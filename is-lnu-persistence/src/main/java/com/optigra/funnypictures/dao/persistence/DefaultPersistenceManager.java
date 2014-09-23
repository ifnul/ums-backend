package com.optigra.funnypictures.dao.persistence;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.optigra.funnypictures.pagination.PagedResult;
import com.optigra.funnypictures.pagination.PagedSearch;
import com.optigra.funnypictures.queries.Query;

@Repository("persistenceManager")
public class DefaultPersistenceManager<T, I> implements PersistenceManager<T, I> {
    private static final Logger logger = LoggerFactory.getLogger(DefaultPersistenceManager.class);

    private static final String COUNT_QUERY = "SELECT COUNT(*) FROM %s a WHERE a IN(%s) ";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public T create(final T entity) {
		logger.info("Saving entity for class:{}", entity.getClass());
		entityManager.persist(entity);
		return entity;
    }

    @Override
    public T findById(final Class<T> clazz, final I id) {
        T entity = entityManager.find(clazz, id);
        return entity;
    }

    @Override
    public T update(final T entity) {
    	logger.info("Updating entity for class:{}", entity.getClass());
        return entityManager.merge(entity);
    }

    @Override
    public void remove(final T entity) {
    	logger.info("Removing entity for class:{}", entity.getClass());
        entityManager.remove(entity);
    }

    @Override
    public T executeSingleResultQuery(final Query<T> query) {
        Query<T> finalQuery = query;
        TypedQuery<T> typedQuery = createQuery(finalQuery.getQuery(), finalQuery.getParameters(), finalQuery.getEntityClass());

        return typedQuery.getSingleResult();
    }

    @Override
    public List<T> executeMultipleResultQuery(final Query<T> query) {
        Query<T> finalQuery = query;
        TypedQuery<T> typedQuery = createQuery(finalQuery.getQuery(), finalQuery.getParameters(), finalQuery.getEntityClass());

        return typedQuery.getResultList();
    }

    @Override
    public PagedResult<T> search(final PagedSearch<T> searchRequest) {
        Query<T> finalQuery =  new Query<T>(searchRequest.getClazz(), searchRequest.getQuery().getQuery(), searchRequest.getParameters());
        TypedQuery<T> typedQuery = createQuery(finalQuery.getQuery(), finalQuery.getParameters(), finalQuery.getEntityClass());
        typedQuery.setFirstResult(searchRequest.getOffset());
        typedQuery.setMaxResults(searchRequest.getLimit());

        Long count = getQueryCount(finalQuery.getQuery(), finalQuery.getParameters(), finalQuery.getEntityClass());

        PagedResult<T> result = new PagedResult<T>(searchRequest.getOffset(), searchRequest.getLimit(), count, typedQuery.getResultList());

        return result;
    }

    private <M> Long getQueryCount(final String querySql, final Map<String, Object> parameters, final Class<M> clazz) {

        String jpQuery = String.format(COUNT_QUERY, clazz.getSimpleName(), querySql);

        TypedQuery<Long> countQuery = createQuery(jpQuery, parameters, Long.class);

        return countQuery.getSingleResult();
    }

    private <M> TypedQuery<M> createQuery(final String querySql, final Map<String, Object> parameters, final Class<M> clazz) {
        TypedQuery<M> typedQuery = entityManager.createQuery(querySql, clazz);

        logger.info(String.format("Create JPQL: query=[%s]; parameters=[%s] ", querySql, parameters));

        for (String key : parameters.keySet()) {
            typedQuery.setParameter(key, parameters.get(key));
        }

        return typedQuery;
    }
}
