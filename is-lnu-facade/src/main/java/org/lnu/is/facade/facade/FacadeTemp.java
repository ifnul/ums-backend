package org.lnu.is.facade.facade;

import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Common interface for all facades.
 * @author kushnir
 *
 * @param <RESOURCE> Resource.
 * @param <KEY> Key.
 */
public interface FacadeTemp<RESOURCE, KEY> {
	/**
	 * Method for creating entity.
	 * @param resource
	 * @return Entity resource.
	 */
	RESOURCE createEntity(RESOURCE resource);

	/**
	 * Method for getting entity.
	 * 
	 * @param id
	 * @return Entity resource.
	 */
	RESOURCE getEntity(final KEY id);

	/**
	 * Method for removing entity.
	 * 
	 * @param id
	 */
	void removeEntity(final KEY id);

	/**
	 * Method for updating entity.
	 * 
	 * @param id
	 * @param resource
	 */
	void updateEntity(final KEY id, RESOURCE resource);

	/**
	 * Method for getting uri.
	 * @param resource
	 * @return uri
	 */
	String getUriForPagedResult(PagedRequest<RESOURCE> resource);

	/**
	 * Method for getting paged result for entities.
	 * 
	 * @param request
	 * @return Paged Result.
	 */
	PagedResultResource<RESOURCE> getEntities(PagedRequest<RESOURCE> request);
}
