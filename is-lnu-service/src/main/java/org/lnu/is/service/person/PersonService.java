package org.lnu.is.service.person;

import org.lnu.is.domain.person.Person;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;


/**
 * Person Service interface.
 * @author ivanursul
 *
 */
public interface PersonService {

	/**
	 * Method for creating new person.
	 * @author ivanursul
	 * @param person
	 */
	void createPerson(Person person);

	/**
	 * Method for getting person by identifier.
	 * @author ivanursul
	 * @param id
	 * @return person entity.
	 */
	Person getPerson(Long id);

	/**
	 * Method for updating person.
	 * @author ivanursul
	 * @param person
	 */
	void updatePerson(Person person);

	/**
	 * Method for removing person.
	 * @author ivanursul
	 * @param person
	 */
	void removePerson(Person person);

	/**
	 * Method for getting paged result.
	 * @author ivanursul
	 * @param pagedSearch
	 * @return persons.
	 */
	PagedResult<Person> getPersons(PagedSearch<Person> pagedSearch);


}
