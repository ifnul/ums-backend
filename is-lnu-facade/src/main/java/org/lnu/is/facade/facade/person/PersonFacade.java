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
	 * @author ivanursul
	 * @param resource
	 * @return person resource.
	 */
	PersonResource createPerson(PersonResource resource);

	/**
	 * Method for updating person.
	 * @author ivanursul
	 * @param id
	 * @param resource
	 */
	void updatePerson(Long id, PersonResource resource);

	/**
	 * Method for getting person by identifier.
	 * @author ivanursul
	 * @param id
	 * @return person resource.
	 */
	PersonResource getPerson(Long id);

	/**
	 * Method for removing person.
	 * @author ivanursul
	 * @param id
	 */
	void removePerson(Long id);

	/**
	 * Method for getting persons.
	 * @author ivanursul
	 * @param request
	 * @return pagedResult.
	 */
	PagedResultResource<PersonResource> getPersons(PagedRequest<PersonResource> request);

}
