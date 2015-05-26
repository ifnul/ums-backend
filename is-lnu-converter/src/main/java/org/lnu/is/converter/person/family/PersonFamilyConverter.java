package org.lnu.is.converter.person.family;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.family.PersonFamily;
import org.lnu.is.resource.person.family.PersonFamilyResource;

/**
 * Person Family Converter.
 * @author ivanursul
 *
 */
@Converter("personFamilyConverter")
public class PersonFamilyConverter extends AbstractConverter<PersonFamily, PersonFamilyResource> {

	@Override
	public PersonFamilyResource convert(final PersonFamily source, final PersonFamilyResource target) {
		
		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}
		
		if (source.getFamilyType() != null) {
			target.setFamilyTypeId(source.getFamilyType().getId());
		}

		target.setId(source.getId());
		target.setName(source.getName());
		target.setBirthDate(source.getBirthDate());
		
		return target;
	}

	@Override
	public PersonFamilyResource convert(final PersonFamily source) {
		return convert(source, new PersonFamilyResource());
	}

}
