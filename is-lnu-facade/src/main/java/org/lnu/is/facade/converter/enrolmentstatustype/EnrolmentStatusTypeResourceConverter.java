package org.lnu.is.facade.converter.enrolmentstatustype;

import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.enrolmentstatustype.EnrolmentStatusTypeResource;

/**
 * Enrolment Status Type Resource Converter.
 * 
 * @author kushnir
 *
 */

@Converter("enrolmentStatusTypeResourceConverter")
public class EnrolmentStatusTypeResourceConverter extends AbstractConverter<EnrolmentStatusTypeResource, EnrolmentStatusType> {

	@Override
	public EnrolmentStatusType convert(final EnrolmentStatusTypeResource source, final EnrolmentStatusType target) {

		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		target.setDescription(source.getDescription());

		return target;
	}

	@Override
	public EnrolmentStatusType convert(final EnrolmentStatusTypeResource source) {
		return convert(source, new EnrolmentStatusType());
	}

}
