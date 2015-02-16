package org.lnu.is.converter.enrolmentforeign.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolmentforeign.type.EnrolmentForeignType;
import org.lnu.is.resource.enrolmentforeign.type.EnrolmentForeignTypeResource;

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
		target.setNote(source.getNote());

		return target;
	}

	@Override
	public EnrolmentForeignTypeResource convert(final EnrolmentForeignType source) {
		return convert(source, new EnrolmentForeignTypeResource());
	}

}
