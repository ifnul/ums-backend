package org.lnu.is.dao;

import javax.annotation.Resource;

import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

public abstract class AbstractDao<E, T> implements Dao<E, T> {

	@Resource(name = "persistenceManager")
	private PersistenceManager<E, T> persistenceManager;
	
	public abstract Class<E> getEntityClass();
	
	@Override
	public E findById(T id) {
		E entity = persistenceManager.findById(getEntityClass(), id);
		return entity;
	}

	@Override
	public void save(E entity) {
		persistenceManager.create(entity);
	}

	@Override
	public void update(E entity) {
		persistenceManager.update(entity);
	}

	@Override
	public void delete(E entity) {
		persistenceManager.remove(entity);
	}
	
	protected PagedResult<E> search(PagedSearch<E> searchRequest) {
		return persistenceManager.search(searchRequest);
	}
}
