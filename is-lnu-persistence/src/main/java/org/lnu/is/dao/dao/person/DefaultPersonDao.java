package org.lnu.is.dao.dao.person;

import java.util.Collections;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.person.Person;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Repository;

/**
 * Default Person Dao.
 * @author ivanursul
 *
 */
@Repository("personDao")
public class DefaultPersonDao extends AbstractDao<Person, Long> implements PersonDao {

	@Override
	public Class<Person> getEntityClass() {
		return Person.class;
	}

	@Override
	public PagedResult<Person> getPersons(final PagedSearch<Person> pagedSearch) {

		Queries query = Queries.FIND_PERSONS;

		pagedSearch.setClazz(getEntityClass());
		pagedSearch.setParameters(Collections.<String, Object>emptyMap());
		pagedSearch.setQuery(query);

		return search(pagedSearch);
	}

}
