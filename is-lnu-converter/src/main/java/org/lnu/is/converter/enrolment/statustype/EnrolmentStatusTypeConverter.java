package org.lnu.is.converter.enrolment.statustype;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.resource.enrolment.statustype.EnrolmentStatusTypeResource;

/**
 * Enrolment Status Type Converter.
 * 
 * @author kushnir
 *
 */
@ResourceConverter("enrolmentStatusTypeConverter")
public class EnrolmentStatusTypeConverter extends AbstractConverter<EnrolmentStatusType, EnrolmentStatusTypeResource> {

	@Override
	public EnrolmentStatusTypeResource convert(final EnrolmentStatusType source, final EnrolmentStatusTypeResource target) {

		target.setId(source.getId());
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		target.setDescription(source.getDescription());

		return target;
	}

	@Override
	public EnrolmentStatusTypeResource convert(final EnrolmentStatusType source) {
		return convert(source, new EnrolmentStatusTypeResource());
	}

}
