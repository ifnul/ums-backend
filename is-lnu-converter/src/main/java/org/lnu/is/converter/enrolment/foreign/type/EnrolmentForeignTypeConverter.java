package org.lnu.is.converter.enrolment.foreign.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.foreign.type.EnrolmentForeignType;
import org.lnu.is.resource.enrolment.foreign.type.EnrolmentForeignTypeResource;

/**
 * EnrolmentForeign Type Converter.
 * 
 * @author OlehZanevych
 * 
 */
@Converter("enrolmentForeignTypeConverter")
public class EnrolmentForeignTypeConverter extends AbstractConverter<EnrolmentForeignType, EnrolmentForeignTypeResource> {

	@Override
	public EnrolmentForeignTypeResource convert(final EnrolmentForeignType source, final EnrolmentForeignTypeResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public EnrolmentForeignTypeResource convert(final EnrolmentForeignType source) {
		return convert(source, new EnrolmentForeignTypeResource());
	}

}
