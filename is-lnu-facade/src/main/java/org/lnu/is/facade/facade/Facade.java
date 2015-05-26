package org.lnu.is.facade.facade;

import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;

/**
 * Common interface for all facades.
 * @author kushnir
 *
 * @param <RESOURCE> Resource.
 * @param <KEY> Key.
 */
public interface Facade<RESOURCE, KEY> {
	/**
	 * Method for creating entity.
	 * @param resource
	 * @return Entity resource.
	 */
	RESOURCE createResource(RESOURCE resource);

	/**
	 * Method for getting entity.
	 * 
	 * @param id
	 * @return Entity resource.
	 */
	RESOURCE getResource(final KEY id);

	/**
	 * Method for removing entity.
	 * 
	 * @param id
	 */
	void removeResource(final KEY id);

	/**
	 * Method for updating entity.
	 * 
	 * @param id
	 * @param resource
	 */
	void updateResource(final KEY id, RESOURCE resource);

	/**
	 * Method for getting paged result for entities.
	 * 
	 * @param request
	 * @return Paged Result.
	 */
	PagedResultResource<RESOURCE> getResources(PagedRequest<RESOURCE> request);
}
