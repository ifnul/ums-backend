package org.lnu.is.service;

import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.PagedResult;

/**
 * Common interface for all services.
 * @author ivanursul
 *
 * @param <ENTITY> Entity.
 * @param <ENTITYLIST> Entity or MultySearch.
 * @param <KEY> Key.
 */
public interface Service<ENTITY, ENTITYLIST, KEY> {

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
	PagedResult<ENTITY> getEntities(MultiplePagedSearch<ENTITYLIST> search);

}
