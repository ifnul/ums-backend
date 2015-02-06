package org.lnu.is.converter.person.contact;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.contact.PersonContact;
import org.lnu.is.resource.person.contact.PersonContactResource;

/**
 * Person Contact Converter.
 * 
 * @author illay
 *
 */
@Converter("personContactConverter")
public class PersonContactConverter extends
	AbstractConverter<PersonContact, PersonContactResource> {

    @Override
    public PersonContactResource convert(final PersonContact source,
	    final PersonContactResource target) {

	if (source.getPerson() != null) {
	    target.setPersonId(source.getPerson().getId());
	}

	if (source.getContactType() != null) {
	    target.setContactTypeId(source.getContactType().getId());
	}

	target.setId(source.getId());
	target.setValue(source.getValue());

	return target;
    }

    @Override
    public PersonContactResource convert(final PersonContact source) {
	return convert(source, new PersonContactResource());
    }

}
