package org.lnu.is.web.rest.controller;

import org.lnu.is.resource.message.MessageResource;

/**
 * Interface, that declares crud operations.
 * @author ivanursul
 *
 * @param <RESOURCE> RESOURCE.
 * @param <RESOURCELIST> RESOURCELIST.
 */
public interface CrudController<RESOURCE, RESOURCELIST> extends PagedController<RESOURCE, RESOURCELIST> {

	/**
	 * Method for creating new resource.
	 * @param resource resource.
	 * @return resource with generated identifier.
	 */
	RESOURCE createResource(RESOURCE resource);

	/**
	 * Method for updating resource.
	 * @param id id.
	 * @param resource resource.
	 * @return message resource.
	 */
	MessageResource updateResource(final Long id, RESOURCE resource);

	/**
	 * Method for removing resource.
	 * @param id id.
	 * @return message about opearation.
	 */
	MessageResource removeResource(Long id);
	
}
