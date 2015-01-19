package org.lnu.is.converter.person.type;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.PersonType;
import org.lnu.is.resource.person.type.PersonTypeResource;

/**
 * Person Type PersonType - > PersonTypeResource converter.
 * @author ivanursul
 *
 */
@ResourceConverter("personTypeConverter")
public class PersonTypeConverter extends AbstractConverter<PersonType, PersonTypeResource> {

	@Override
	public PersonTypeResource convert(final PersonType source, final PersonTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());
		
		return target;
	}

	@Override
	public PersonTypeResource convert(final PersonType source) {
		return convert(source, new PersonTypeResource());
	}

}
