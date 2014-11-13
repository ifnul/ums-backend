package org.lnu.is.dao;

import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Interface, that has all methods, that are needed 
 * to work with entities.
 * @author ivanursul
 *
 * @param <E> Entity class.
 * @param <T> Identifier class.
 */
public interface Dao<E, T> {

	/**
	 * Method for finding Entities by Id.
	 * @param id identifier.
	 * @return Entity.
	 */
	E findById(T id);
	
	/**
	 * Method for saving entity.
	 * @param entity entity.
	 */
	void save(E entity);
	
	/**
	 * Method for updating entity.
	 * @param entity entity.
	 */
	void update(E entity);
	
	/**
	 * Method for deleting entity.
	 * @param entity entity.
	 */
	void delete(E entity);
	
	/**
	 * Method for getting paged Result.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<E> getEntities(PagedSearch<E> pagedSearch);
}

