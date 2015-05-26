package org.lnu.is.converter.person.name;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.name.PersonName;
import org.lnu.is.resource.person.name.PersonNameResource;

/**
 * Person Name Converter.
 * @author ivanursul
 *
 */
@Converter("personNameConverter")
public class PersonNameConverter extends AbstractConverter<PersonName, PersonNameResource> {

	@Override
	public PersonNameResource convert(final PersonName source, final PersonNameResource target) {
		
		if (source.getLanguage() != null) {
			target.setLanguageId(source.getLanguage().getId());
		}
		
		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}
		
		target.setName(source.getName());
		target.setFirstName(source.getFirstName());
		target.setFatherName(source.getFatherName());
		target.setSurname(source.getSurname());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public PersonNameResource convert(final PersonName source) {
		return convert(source, new PersonNameResource());
	}

}
