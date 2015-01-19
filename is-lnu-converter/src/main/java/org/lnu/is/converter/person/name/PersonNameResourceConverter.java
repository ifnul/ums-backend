package org.lnu.is.converter.person.name;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.language.Language;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonName;
import org.lnu.is.resource.person.name.PersonNameResource;

/**
 * Person Name Resource Converter.
 * @author ivanursul
 *
 */
@ResourceConverter("personNameResourceConverter")
public class PersonNameResourceConverter extends AbstractConverter<PersonNameResource, PersonName> {

	@Override
	public PersonName convert(final PersonNameResource source, final PersonName target) {
		
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
		
		target.setName(source.getName());
		target.setFirstName(source.getFirstName());
		target.setFatherName(source.getFatherName());
		target.setSurname(source.getSurname());
		
		return target;
	}

	@Override
	public PersonName convert(final PersonNameResource source) {
		return convert(source, new PersonName());
	}

}
