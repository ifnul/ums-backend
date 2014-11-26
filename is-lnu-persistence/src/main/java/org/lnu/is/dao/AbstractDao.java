package org.lnu.is.dao;

import javax.annotation.Resource;

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
 * @param <E> Entity class.    
 * @param <T> Identifier class.
 */
public abstract class AbstractDao<E, T> implements Dao<E, T> {

	@Resource(name = "persistenceManager")
	private PersistenceManager<E, T> persistenceManager;
	
	private QueryBuilder<E> queryBuilder;
	
	public void setQueryBuilder(final QueryBuilder<E> queryBuilder) {
		this.queryBuilder = queryBuilder;
	}

	/**
	 * Need to implement for each entity(User, Student, etc..).
	 * @return Class instance
	 */
	public abstract Class<E> getEntityClass();
	
	@Override
	public E findById(final T id) {
		E entity = persistenceManager.findById(getEntityClass(), id);
		return entity;
	}

	@Override
	public void save(final E entity) {
		persistenceManager.create(entity);
	}

	@Override
	public void update(final E entity) {
		persistenceManager.update(entity);
	}

	@Override
	public void delete(final E entity) {
		persistenceManager.remove(entity);
	}

	@Override
	public PagedResult<E> getEntities(final PagedSearch<E> pagedSearch) {

		String querySql = queryBuilder.build(pagedSearch.getEntity());
		Queries<E> queries = new Queries<E>(getEntityClass(), querySql);
		
		PagedQuerySearch<E> pagedQuerySearch = new PagedQuerySearch<E>(queries, pagedSearch.getOffset(), 
				pagedSearch.getLimit(), pagedSearch.getParameters(), getEntityClass());
		
		return persistenceManager.search(pagedQuerySearch);
	}
	
}
