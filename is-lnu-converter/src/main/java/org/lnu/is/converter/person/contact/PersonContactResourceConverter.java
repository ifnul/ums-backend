package org.lnu.is.converter.person.contact;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.contact.PersonContact;
import org.lnu.is.resource.person.contact.PersonContactResource;

/**
 * Person Address Resource Converter.
 * @author illay
 *
 */
@Converter("personContactResourceConverter")
public class PersonContactResourceConverter extends AbstractConverter<PersonContactResource, PersonContact> {

	@Override
	public PersonContact convert(final PersonContactResource source, final PersonContact target) {
		
		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			target.setPerson(person);
		}
		
		if (source.getContactTypeId() != null) {
			ContactType contactType = new ContactType();
			contactType.setId(source.getContactTypeId());
			target.setContactType(contactType);
		}
		
		target.setValue(source.getValue());
		
		return target;
	}

	@Override
	public PersonContact convert(final PersonContactResource source) {
		return convert(source, new PersonContact());
	}


}
