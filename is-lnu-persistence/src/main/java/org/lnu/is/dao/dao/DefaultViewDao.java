package org.lnu.is.dao.dao;

import java.util.Collections;
import java.util.Map;

import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.View;
import org.lnu.is.pagination.MultiplePagedQuerySearch;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.PagedResult;
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
public class DefaultViewDao<ENTITY extends View, KEY> implements Dao<ENTITY, KEY> {
	private static final String QUERY = "SELECT e FROM %s WHERE e.id=:id ";

	private static final Logger LOG = LoggerFactory.getLogger(DefaultDao.class);
	
	private PersistenceManager<ENTITY, KEY> persistenceManager;
	
	private QueryBuilder<ENTITY> queryBuilder;
	
	private Class<ENTITY> entityClass;
	
	@Override
	public ENTITY getEntityById(final KEY id) {
		String querySql = String.format(QUERY, getEntityClass().getSimpleName());
		Map<String, Object> parameters = Collections.<String, Object>singletonMap("id", id);
		Query<ENTITY> query = new Query<ENTITY>(getEntityClass(), querySql, parameters);
		
		return getPersistenceManager().getSingleResult(query);
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
		
		String querySql = queryBuilder.build(pagedSearch);
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
