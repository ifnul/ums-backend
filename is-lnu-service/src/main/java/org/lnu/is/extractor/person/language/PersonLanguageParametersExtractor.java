package org.lnu.is.extractor.person.language;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.language.Language;
import org.lnu.is.domain.language.LanguageLevel;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.language.PersonLanguage;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person Language Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("personLanguageParametersExtractor")
public class PersonLanguageParametersExtractor extends AbstractParametersExtractor<PersonLanguage> {

	@Resource(name = "personDao")
	private Dao<Person, Person, Long> personDao;
	
	@Resource(name = "languageDao")
	private Dao<Language, Language, Long> languageDao;
	
	@Resource(name = "languageLevelDao")
	private Dao<LanguageLevel, LanguageLevel, Long> languageLevelDao;
	
	@Override
	protected Map<String, Object> getParameters(final PersonLanguage entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getLanguage(), languageDao, "language", parameters);
		addParameter(entity.getLanguageLevel(), languageLevelDao, "languageLevel", parameters);
		
		return parameters;
	}

}
