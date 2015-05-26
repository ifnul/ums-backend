package org.lnu.is.converter.person.language;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.language.Language;
import org.lnu.is.domain.language.LanguageLevel;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.language.PersonLanguage;
import org.lnu.is.resource.person.language.PersonLanguageResource;

/**
 * Person Language Converter.
 * @author ivanursul
 *
 */
@Converter("personLanguageResourceConverter")
public class PersonLanguageResourceConverter extends AbstractConverter<PersonLanguageResource, PersonLanguage> {

	@Override
	public PersonLanguage convert(final PersonLanguageResource source, final PersonLanguage target) {

		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			target.setPerson(person);
		}
		
		if (source.getLanguageId() != null) {
			Language language = new Language();
			language.setId(source.getLanguageId());
			target.setLanguage(language);
		}
		
		if (source.getLanguageLevelId() != null) {
			LanguageLevel languageLevel = new LanguageLevel();
			languageLevel.setId(source.getLanguageLevelId());
			target.setLanguageLevel(languageLevel);
		}
		
		return target;
	}

	@Override
	public PersonLanguage convert(final PersonLanguageResource source) {
		return convert(source, new PersonLanguage());
	}

}
