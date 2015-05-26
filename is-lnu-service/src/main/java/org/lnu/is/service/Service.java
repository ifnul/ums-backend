package org.lnu.is.service;

import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.PagedResult;

/**
 * Common interface for all services.
 * @author ivanursul
 *
 * @param <ENTITY> Entity.
 * @param <KEY> Key.
 */
public interface Service<ENTITY, KEY> {

	/**
	 * Method for creating entity.
	 * @param entity entity
	 */
	void createEntity(ENTITY entity);

	/**
	 * Method for getting entity.
	 * @param id id
	 * @return entity.
	 */
	ENTITY getEntity(KEY id);

	/**
	 * Method for updatin entity.
	 * @param entity entity
	 */
	void updateEntity(ENTITY entity);

	/**
	 * Method for removing entity.
	 * @param entity entity
	 */
	void removeEntity(ENTITY entity);

	/**
	 * Method for getting paged result.
	 * @param search search
	 * @return paged result with ready entities.
	 */
	PagedResult<ENTITY> getEntities(MultiplePagedSearch<ENTITY> search);

}
