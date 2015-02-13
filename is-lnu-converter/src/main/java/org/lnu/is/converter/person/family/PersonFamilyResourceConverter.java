package org.lnu.is.converter.person.family;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.familytype.FamilyType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.family.PersonFamily;
import org.lnu.is.resource.person.family.PersonFamilyResource;

/**
 * Person Family Resource Converter.
 * @author ivanursul
 *
 */
@Converter("personFamilyResourceConverter")
public class PersonFamilyResourceConverter extends AbstractConverter<PersonFamilyResource, PersonFamily> {

	@Override
	public PersonFamily convert(final PersonFamilyResource source, final PersonFamily target) {
		
		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			target.setPerson(person);
		}
		
		if (source.getFamilyTypeId() != null) {
			FamilyType familyType = new FamilyType();
			familyType.setId(source.getFamilyTypeId());
			target.setFamilyType(familyType);
		}

		target.setName(source.getName());
		target.setBirthDate(source.getBirthDate());
		
		return target;
	}

	@Override
	public PersonFamily convert(final PersonFamilyResource source) {
		return convert(source, new PersonFamily());
	}

}
