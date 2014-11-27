package org.lnu.is.service.person;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.person.PersonDao;
import org.lnu.is.domain.person.Person;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default person service.
 * @author ivanursul
 *
 */
@Service("personService")
public class DefaultPersonService implements PersonService {

	@Resource(name = "personDao")
	private PersonDao defaultDao;

	@Resource(name = "personParametersExtractor")
	private ParametersExtractor<Person> parametersExtractor;
	
	@Override
	public void createPerson(final Person person) {
		defaultDao.save(person);
	}

	@Override
	public Person getPerson(final Long id) {
		return defaultDao.findById(id);
	}

	@Override
	public void updatePerson(final Person person) {
		defaultDao.update(person);
	}

	@Override
	public void removePerson(final Person person) {
		defaultDao.delete(person);
	}

	@Override
	public PagedResult<Person> getPersons(final PagedSearch<Person> pagedSearch) {
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);
		
		return defaultDao.getEntities(pagedSearch);
	}
	
}
