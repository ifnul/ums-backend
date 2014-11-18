package org.lnu.is.facade.converter.enrolmentstatustype;

import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.enrolmentstatustype.EnrolmentStatusTypeResource;

/**
 * Enrolment Status Type Converter.
 * 
 * @author kushnir
 *
 */
@Converter("enrolmentStatusTypeConverter")
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
