package org.lnu.is.web.rest.controller;

import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Inteface, that declares paged request method.
 * @author ivanursul
 * @param <RESOURCE> resource, that is used.
 */
public interface PagedController<RESOURCE> {
	
	/**
	 * Method that returns paged result resource.
	 * @param request
	 * @return paged result resource.
	 */
	PagedResultResource<RESOURCE> getPagedResource(PagedRequest<RESOURCE> request);
	
	/**
	 * Method for getting resource.
	 * @param id
	 * @return resource.
	 */
	RESOURCE getResource(Long id);
}
