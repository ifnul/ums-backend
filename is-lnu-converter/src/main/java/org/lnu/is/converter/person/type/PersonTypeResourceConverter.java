package org.lnu.is.converter.person.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.PersonType;
import org.lnu.is.resource.person.type.PersonTypeResource;

/**
 * Person Type Resource PersonTypeResource -> PersonType converter.
 * @author ivanursul
 *
 */
@Converter("personTypeResourceConverter")
public class PersonTypeResourceConverter extends AbstractConverter<PersonTypeResource, PersonType> {

	@Override
	public PersonType convert(final PersonTypeResource source, final PersonType target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public PersonType convert(final PersonTypeResource source) {
		return convert(source, new PersonType());
	}

}
