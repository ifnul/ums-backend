package org.lnu.is.facade.facade.person;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.person.PersonResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Person facade.
 * @author ivanursul
 *
 */
public interface PersonFacade extends Facade<PersonResource> {

	/**
	 * Method for creating person.
	 * @author ivanursul
	 * @param personResource
	 * @return person resource.
	 */
	PersonResource createPerson(PersonResource personResource);

	/**
	 * Method for updating person.
	 * @author ivanursul
	 * @param id
	 * @param personResource
	 */
	void updatePerson(Long id, PersonResource personResource);

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
	 * @param pagedRequest
	 * @return pagedResult.
	 */
	PagedResultResource<PersonResource> getPersons(PagedRequest<PersonResource> pagedRequest);

}
