package org.lnu.is.converter.person.pension;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.pension.PersonPension;
import org.lnu.is.resource.person.pension.PersonPensionResource;

/**
 * Person Pension converter.
 * @author ivanursul
 *
 */
@Converter("personPensionConverter")
public class PersonPensionConverter extends AbstractConverter<PersonPension, PersonPensionResource> {

	@Override
	public PersonPensionResource convert(final PersonPension source, final PersonPensionResource target) {
		
		if (source.getPensionType() != null) {
			target.setPensionTypeId(source.getPensionType().getId());
		}

		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}

		target.setId(source.getId());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		
		return target;
	}

	@Override
	public PersonPensionResource convert(final PersonPension source) {
		return convert(source, new PersonPensionResource());
	}

}
