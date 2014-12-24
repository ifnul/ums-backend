package org.lnu.is.web.rest.controller;

import org.lnu.is.facade.resource.message.MessageResource;

/**
 * Interface, that declares crud operations.
 * @author ivanursul
 *
 * @param <RESOURCE>
 */
public interface CrudController<RESOURCE> extends PagedController<RESOURCE> {

	/**
	 * Method for creating new resource.
	 * @param resource
	 * @return resource with generated identifier.
	 */
	RESOURCE createResource(RESOURCE resource);

	/**
	 * Method for updating resource.
	 * @param id
	 * @param resource
	 * @return message resource.
	 */
	MessageResource updateResource(final Long id, RESOURCE resource);

	/**
	 * Method for getting resource.
	 * @param id
	 * @return resource.
	 */
	RESOURCE getResource(Long id);
	
	/**
	 * Method for removing resource.
	 * @param id
	 * @return message about opearation.
	 */
	MessageResource removeResource(Long id);
	
}
