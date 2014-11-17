package org.lnu.is.facade.converter.persontype;

import org.lnu.is.domain.persontype.PersonType;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.persontype.PersonTypeResource;

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
