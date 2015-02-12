package org.lnu.is.converter.person.language;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.language.PersonLanguage;
import org.lnu.is.resource.person.language.PersonLanguageResource;

/**
 * Person Language Converter.
 * @author ivanursul
 *
 */
@Converter("personLanguageConverter")
public class PersonLanguageConverter extends AbstractConverter<PersonLanguage, PersonLanguageResource> {

	@Override
	public PersonLanguageResource convert(final PersonLanguage source, final PersonLanguageResource target) {

		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}
		
		if (source.getLanguage() != null) {
			target.setLanguageId(source.getLanguage().getId());
		}
		
		if (source.getLanguageLevel() != null) {
			target.setLanguageLevelId(source.getLanguageLevel().getId());
		}
		
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public PersonLanguageResource convert(final PersonLanguage source) {
		return convert(source, new PersonLanguageResource());
	}

}
