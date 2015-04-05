package org.lnu.is.converter.enrolment.foreign.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.foreign.type.EnrolmentForeignType;
import org.lnu.is.resource.enrolmentforeign.type.EnrolmentForeignTypeResource;

/**
 * EnrolmentForeign Type Resource Converter.
 * 
 * @author OlehZanevych
 *
 */
@Converter("enrolmentForeignTypeResourceConverter")
public class EnrolmentForeignTypeResourceConverter extends AbstractConverter<EnrolmentForeignTypeResource, EnrolmentForeignType> {

	@Override
	public EnrolmentForeignType convert(final EnrolmentForeignTypeResource source, final EnrolmentForeignType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());
		target.setNote(source.getNote());

		return target;
	}

	@Override
	public EnrolmentForeignType convert(final EnrolmentForeignTypeResource source) {
		return convert(source, new EnrolmentForeignType());
	}
}
