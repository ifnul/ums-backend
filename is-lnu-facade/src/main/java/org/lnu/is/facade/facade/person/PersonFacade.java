package org.lnu.is.facade.facade.person;

import org.lnu.is.facade.resource.person.PersonResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Person facade.
 * @author ivanursul
 *
 */
public interface PersonFacade {

	/**
	 * Method for creating person.
	 * @param resource
	 * @return person resource.
	 */
	PersonResource createEntity(PersonResource resource);

	/**
	 * Method for updating person.
	 * @param id
	 * @param resource
	 */
	void updateEntity(Long id, PersonResource resource);

	/**
	 * Method for getting person by identifier.
	 * @param id
	 * @return person resource.
	 */
	PersonResource getEntity(Long id);

	/**
	 * Method for removing person.
	 * @param id
	 */
	void removeEntity(Long id);

	/**
	 * Method for getting persons.
	 * @param request
	 * @return pagedResult.
	 */
	PagedResultResource<PersonResource> getEntities(PagedRequest<PersonResource> request);

}
