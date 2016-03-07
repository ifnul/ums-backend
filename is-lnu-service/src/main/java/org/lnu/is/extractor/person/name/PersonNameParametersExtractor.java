package org.lnu.is.extractor.person.name;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.language.language;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.name.PersonName;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person Name parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("personNameParametersExtractor")
public class PersonNameParametersExtractor extends AbstractParametersExtractor<PersonName> {

	@Resource(name = "languageDao")
	private Dao<language, language, Long> languageDao;
	
	@Resource(name = "personDao")
	private Dao<Person, Person, Long> personDao;
	
	@Override
	public Map<String, Object> getParameters(final PersonName entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getLanguage(), languageDao, "language", parameters);
		
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getFirstName(), "firstName", parameters);
		addParameter(entity.getFatherName(), "fatherName", parameters);
		addParameter(entity.getSurname(), "surname", parameters);
		
		return parameters;
	}

}
