package com.optigra.funnypictures.dao;

import javax.annotation.Resource;

import com.optigra.funnypictures.dao.persistence.PersistenceManager;
import com.optigra.funnypictures.pagination.PagedResult;
import com.optigra.funnypictures.pagination.PagedSearch;

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
