package org.lnu.is.converter.enrolment.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.type.EnrolmentType;
import org.lnu.is.resource.enrolment.type.EnrolmentTypeResource;

/**
 * Enrolment Type Converter.
 * 
 * @author kushnir
 *
 */
@Converter("enrolmentTypeConverter")
public class EnrolmentTypeConverter extends AbstractConverter<EnrolmentType, EnrolmentTypeResource> {

	@Override
	public EnrolmentTypeResource convert(final EnrolmentType source, final EnrolmentTypeResource target) {
		target.setId(source.getId());
		target.setName(source.getName());

		return target;
	}

	@Override
	public EnrolmentTypeResource convert(final EnrolmentType source) {
		return convert(source, new EnrolmentTypeResource());
	}

}
