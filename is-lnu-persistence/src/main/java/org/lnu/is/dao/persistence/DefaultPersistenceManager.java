package org.lnu.is.dao.persistence;

import org.lnu.is.dao.exception.EntityNotFoundException;
import org.lnu.is.dao.persistence.enhancers.Enhancer;
import org.lnu.is.dao.persistence.model.DaoMethod;
import org.lnu.is.dao.persistence.verifier.VerifierChainLink;
import org.lnu.is.domain.EntityModel;
import org.lnu.is.pagination.MultiplePagedQuerySearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.queries.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Persistance Manager to work with entityManager.
 * @author ivanursul
 *
 * @param <T> Entity class.
 * @param <I> IDentifier class.
 */
@Repository("persistenceManager")
public class DefaultPersistenceManager<T extends EntityModel, I> implements PersistenceManager<T, I> {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultPersistenceManager.class);

    private static final String COUNT_QUERY = "SELECT COUNT(*) FROM %s a WHERE a IN(%s) ";

    @PersistenceContext
    private EntityManager entityManager;

    @Resource(name = "persistenceChains")
    private Map<DaoMethod, VerifierChainLink<? super Object>> persistenceChains;
    
    @Resource(name = "persistenceEnhancers")
    private Map<DaoMethod, Enhancer<? super Object>> persistenceEnhancers;
    
    @Override
    public T create(final T entity) {
		LOG.info("Saving entity for class:{}", entity.getClass());

		verify(DaoMethod.CREATE, entity);
		enhance(DaoMethod.CREATE, entity);
		entityManager.persist(entity);
		
		return entity;
    }

    @Override
    public T findById(final Class<T> clazz, final I id) {
        T entity = entityManager.find(clazz, id);
        if (entity == null) {
        	LOG.error("Entity is deleted, {}, {}", clazz.getSimpleName());
        	throw new EntityNotFoundException("Entity doesn't exist", clazz, id);
        }

        verify(DaoMethod.SINGLE_GET, entity);
        return entity;
    }

    @Override
    public T update(final T entity) {
    	LOG.info("Updating entity for class:{}", entity.getClass());
    	verify(DaoMethod.UPDATE, entity);
        return entityManager.merge(entity);
    }

    @Override
    public void remove(final T entity) {
    	LOG.info("Removing entity for class:{}", entity.getClass());
    	enhance(DaoMethod.DELETE, entity);
        update(entity);
    }

    @Override
    public PagedResult<T> search(final MultiplePagedQuerySearch<T> request) {
    	verify(DaoMethod.MULTIPLE_GET, request);
    	
    	TypedQuery<T> typedQuery = createQuery(request.getQuery().getQuery(), request.getParameters(), request.getClazz());
        typedQuery.setFirstResult(request.getOffset());
        typedQuery.setMaxResults(request.getLimit());

        Long count = getQueryCount(request.getQuery().getQuery(), request.getParameters(), request.getClazz());

        PagedResult<T> result = new PagedResult<T>(request.getOffset(), request.getLimit(), count, typedQuery.getResultList());

        return result;
    }
    
	@Override
	public T getSingleResult(final Query<T> query) {
		Query<T> finalQuery = query;
		TypedQuery<T> typedQuery = createQuery(finalQuery.getQuery(), finalQuery.getParameters(), finalQuery.getClazz());

		return typedQuery.getSingleResult();
	}    

	@Override
	public <E> List<E> getMultipleResult(final Query<E> query) {
		Query<E> finalQuery = query;
		TypedQuery<E> typedQuery = createQuery(finalQuery.getQuery(), finalQuery.getParameters(), finalQuery.getClazz());
		
		return typedQuery.getResultList();
	}    
    

	/**
	 * Gets query count for every.
	 * @param querySql query Sql
	 * @param parameters parameters
	 * @param clazz clazz
	 * @param <M> Generic
	 * @return query count.
	 */
    private <M> Long getQueryCount(final String querySql, final Map<String, Object> parameters, final Class<M> clazz) {

        String jpQuery = String.format(COUNT_QUERY, clazz.getSimpleName(), querySql);

        TypedQuery<Long> countQuery = createQuery(jpQuery, parameters, Long.class);

        return countQuery.getSingleResult();
    }

    /**
     * Creates typed Query for entityManager.
     * @param <M> for generic class.
     * @param querySql
     * @param parameters
     * @param clazz
     * @return Entity.
     */
    private <M> TypedQuery<M> createQuery(final String querySql, final Map<String, Object> parameters, final Class<M> clazz) {
        TypedQuery<M> typedQuery = entityManager.createQuery(querySql, clazz);

        LOG.info(String.format("Create JPQL: query=[%s]; parameters=[%s] ", querySql, parameters));

        for (Entry<String, Object> entry : parameters.entrySet()) {
            typedQuery.setParameter(entry.getKey(), entry.getValue());
        }

        return typedQuery;
    }


    public List<Object[]> executeNativeQuery(String sql) {
        return entityManager.createNativeQuery(sql).getResultList();
    }
    
	/**
	 * Method for verifying appropriate logic.
	 * @param method method
	 * @param resource resource
	 */
	protected void verify(final DaoMethod method, final Object resource) {
		VerifierChainLink<? super Object> verifier = persistenceChains.get(method);
		verifier.verify(resource);
	}

	/**
	 * Method for verifying appropriate logic.
	 * @param method method
	 * @param entity entity
	 */
	protected void enhance(final DaoMethod method, final Object entity) {
		Enhancer<? super Object> enhancer = persistenceEnhancers.get(method);
		enhancer.enhance(entity);
	}

	public void setPersistenceChains(final Map<DaoMethod, VerifierChainLink<? super Object>> persistenceChains) {
		this.persistenceChains = persistenceChains;
	}

	public void setPersistenceEnhancers(final Map<DaoMethod, Enhancer<? super Object>> persistenceEnhancers) {
		this.persistenceEnhancers = persistenceEnhancers;
	}
	
}
