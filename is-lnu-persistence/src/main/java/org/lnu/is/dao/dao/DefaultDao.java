package org.lnu.is.dao.dao;

import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.pagination.PagedQuerySearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;

/**
 * Abstract implementation, that has
 * all methods for convenient work with entities.
 * @author ivanursul
 *
 * @param <ENTITY> Entity type.    
 * @param <KEY> Identifier class.
 */
public class DefaultDao<ENTITY, KEY> implements Dao<ENTITY, KEY> {

	private PersistenceManager<ENTITY, KEY> persistenceManager;
	
	private QueryBuilder<ENTITY> queryBuilder;
	
	private Class<ENTITY> entityClass;
	
	@Override
	public ENTITY findById(final KEY id) {
		ENTITY entity = persistenceManager.findById(getEntityClass(), id);
		return entity;
	}

	@Override
	public void save(final ENTITY entity) {
		persistenceManager.create(entity);
	}

	@Override
	public void update(final ENTITY entity) {
		persistenceManager.update(entity);
	}

	@Override
	public void delete(final ENTITY entity) {
		persistenceManager.remove(entity);
	}

	@Override
	public PagedResult<ENTITY> getEntities(final PagedSearch<ENTITY> pagedSearch) {
		
		String querySql = queryBuilder.build(pagedSearch.getEntity());
		Queries<ENTITY> queries = new Queries<ENTITY>(getEntityClass(), querySql);
		
		PagedQuerySearch<ENTITY> pagedQuerySearch = new PagedQuerySearch<ENTITY>(queries, pagedSearch.getOffset(), 
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
