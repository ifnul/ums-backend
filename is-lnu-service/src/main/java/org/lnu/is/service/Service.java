package org.lnu.is.service;

import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Common interface for all services.
 * @author ivanursul
 *
 * @param <ENTITY> Entity.
 * @param <KEY> Key.
 */
// TODO: Ivan Ursul - Rename to Service, when refactoring will be finished.
public interface Service<ENTITY, KEY> {

	/**
	 * Method for creating entity.
	 * @param entity
	 */
	void createEntity(ENTITY entity);

	/**
	 * Method for getting entity.
	 * @param id
	 * @return entity.
	 */
	ENTITY getEntity(KEY id);

	/**
	 * Method for updatin entity.
	 * @param entity
	 */
	void updateEntity(ENTITY entity);

	/**
	 * Method for removing entity.
	 * @param entity
	 */
	void removeEntity(ENTITY entity);

	/**
	 * Method for getting paged result.
	 * @param search
	 * @return paged result with ready entities.
	 */
	PagedResult<ENTITY> getEntities(PagedSearch<ENTITY> search);

}
