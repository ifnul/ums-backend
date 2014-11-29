package org.lnu.is.facade.converter.person.name;

import org.lnu.is.domain.person.PersonName;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.person.name.PersonNameResource;

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
		
		return target;
	}

	@Override
	public PersonNameResource convert(final PersonName source) {
		return convert(source, new PersonNameResource());
	}

}
