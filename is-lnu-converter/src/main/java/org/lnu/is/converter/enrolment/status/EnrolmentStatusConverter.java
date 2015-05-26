package org.lnu.is.converter.enrolment.status;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.status.EnrolmentStatus;
import org.lnu.is.resource.enrolment.status.EnrolmentStatusResource;

/**
 * Enrolment Status Converter.
 * @author ivanursul
 *
 */
@Converter("enrolmentStatusConverter")
public class EnrolmentStatusConverter extends AbstractConverter<EnrolmentStatus, EnrolmentStatusResource> {

	@Override
	public EnrolmentStatusResource convert(final EnrolmentStatus source, final EnrolmentStatusResource target) {
		
		target.setId(source.getId());
		target.setIsState(source.getIsState());
		target.setIsContract(source.getIsContract());
		
		if (source.getEnrolment() != null) {
			target.setEnrolmentId(source.getEnrolment().getId());
		}
		
		if (source.getSpecOfferWave() != null) {
			target.setSpecOfferWaveId(source.getSpecOfferWave().getId());
		}
		
		if (source.getEnrolmentStatusType() != null) {
			target.setEnrolmentStatusTypeId(source.getEnrolmentStatusType().getId());
		}
		
		return target;
	}

	@Override
	public EnrolmentStatusResource convert(final EnrolmentStatus source) {
		return convert(source, new EnrolmentStatusResource());
	}

}
