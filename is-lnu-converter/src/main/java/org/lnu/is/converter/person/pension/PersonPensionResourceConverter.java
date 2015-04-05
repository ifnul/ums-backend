package org.lnu.is.converter.person.pension;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.pension.type.PensionType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.pension.PersonPension;
import org.lnu.is.resource.person.pension.PersonPensionResource;

/**
 * Person Pension Resource Converter.
 * @author ivanursul
 *
 */
@Converter("personPensionResourceConverter")
public class PersonPensionResourceConverter extends AbstractConverter<PersonPensionResource, PersonPension> {

	@Override
	public PersonPension convert(final PersonPensionResource source, final PersonPension target) {
		
		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			target.setPerson(person);
		}
		
		if (source.getPensionTypeId() != null) {
			PensionType paperType = new PensionType();
			paperType.setId(source.getPensionTypeId());
			
			target.setPensionType(paperType);
		}
		
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		
		return target;
	}

	@Override
	public PersonPension convert(final PersonPensionResource source) {
		return convert(source, new PersonPension());
	}

}
