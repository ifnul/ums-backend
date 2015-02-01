package org.lnu.is.dao.dao;

import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.Model;
import org.lnu.is.pagination.MultiplePagedQuerySearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.queries.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Abstract implementation, that has
 * all methods for convenient work with entities.
 * @author ivanursul
 *
 * @param <ENTITY> Entity type.    
 * @param <KEY> Identifier class.
 */
public class DefaultDao<ENTITY extends Model, KEY> implements Dao<ENTITY, KEY> {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultDao.class);
	
	private PersistenceManager<ENTITY, KEY> persistenceManager;
	
	private QueryBuilder<ENTITY> queryBuilder;
	
	private Class<ENTITY> entityClass;
	
	@Override
	public ENTITY getEntityById(final KEY id) {
		LOG.info("Getting {}.entity wit id", getEntityClass().getSimpleName(), id);
		return persistenceManager.findById(getEntityClass(), id);
	}

	@Override
	public void save(final ENTITY entity) {
		LOG.info("Saving {}.entity: {}", getEntityClass().getSimpleName(), entity);
		persistenceManager.create(entity);
	}

	@Override
	public void update(final ENTITY entity) {
		LOG.info("Updating {}.entity with id: {}, {}", getEntityClass().getSimpleName(), entity.getId(), entity);
		persistenceManager.update(entity);
	}

	@Override
	public void delete(final ENTITY entity) {
		LOG.info("Removing {}.entity with id: {}, {}", getEntityClass().getSimpleName(), entity.getId(), entity);
		persistenceManager.remove(entity);
	}

	@Override
	public PagedResult<ENTITY> getEntities(final MultiplePagedSearch<ENTITY> pagedSearch) {
		LOG.info("Getting paged result for {}: {}", getEntityClass().getSimpleName(), pagedSearch);
		
		String querySql = queryBuilder.build(pagedSearch.getEntity());
		Query<ENTITY> queries = new Query<ENTITY>(getEntityClass(), querySql);
		
		MultiplePagedQuerySearch<ENTITY> pagedQuerySearch = new MultiplePagedQuerySearch<ENTITY>(queries, pagedSearch.getOffset(), 
				pagedSearch.getLimit(), pagedSearch.getParameters(), getEntityClass());
		
		return persistenceManager.search(pagedQuerySearch);
	}

	public Class<ENTITY> getEntityClass() {
		return entityClass;
	}

	public PersistenceManager<ENTITY, KEY> getPersistenceManager() {
		return persistenceManager;
	}
	
	public QueryBuilder<ENTITY> getQueryBuilder() {
		return queryBuilder;
	}

	public void setPersistenceManager(final PersistenceManager<ENTITY, KEY> persistenceManager) {
		this.persistenceManager = persistenceManager;
	}

	public void setQueryBuilder(final QueryBuilder<ENTITY> queryBuilder) {
		this.queryBuilder = queryBuilder;
	}

	public void setEntityClass(final Class<ENTITY> entityClass) {
		this.entityClass = entityClass;
	}
	
}
