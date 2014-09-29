package org.lnu.is.dao;

import javax.annotation.Resource;

import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

public abstract class AbstractDao<E, T> implements Dao<E, T> {

	@Resource(name = "persistenceManager")
	private PersistenceManager<E, T> persistenceManager;
	
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
	
	/**
	 * Method for searching results by part.
	 * @param searchRequest search request.
	 * @return Paged Result with part result. 
	 */
	protected PagedResult<E> search(final PagedSearch<E> searchRequest) {
		return persistenceManager.search(searchRequest);
	}
}
