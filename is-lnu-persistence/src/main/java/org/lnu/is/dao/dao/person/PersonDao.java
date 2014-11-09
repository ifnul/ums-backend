package org.lnu.is.dao.dao.person;

import org.lnu.is.dao.Dao;
import org.lnu.is.domain.person.Person;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Person Dao interface.
 * @author ivanursul
 *
 */
public interface PersonDao extends Dao<Person, Long> {

	/**
	 * Method for getting.
	 * @author ivanursul
	 * @param pagedSearch
	 * @return pagedResult.
	 */
	PagedResult<Person> getPersons(PagedSearch<Person> pagedSearch);

}
