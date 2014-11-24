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
	PersonResource createPerson(PersonResource resource);

	/**
	 * Method for updating person.
	 * @param id
	 * @param resource
	 */
	void updatePerson(Long id, PersonResource resource);

	/**
	 * Method for getting person by identifier.
	 * @param id
	 * @return person resource.
	 */
	PersonResource getPerson(Long id);

	/**
	 * Method for removing person.
	 * @param id
	 */
	void removePerson(Long id);

	/**
	 * Method for getting persons.
	 * @param request
	 * @return pagedResult.
	 */
	PagedResultResource<PersonResource> getPersons(PagedRequest<PersonResource> request);

}
