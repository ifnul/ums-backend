package org.lnu.is.converter.enrolment.status;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.status.EnrolmentStatus;
import org.lnu.is.domain.enrolment.status.type.EnrolmentStatusType;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.resource.enrolment.status.EnrolmentStatusResource;

/**
 * Enrolment Status Resource Converter.
 * @author ivanursul
 *
 */
@Converter("enrolmentStatusResourceConverter")
public class EnrolmentStatusResourceConverter extends AbstractConverter<EnrolmentStatusResource, EnrolmentStatus> {

	@Override
	public EnrolmentStatus convert(final EnrolmentStatusResource source, final EnrolmentStatus target) {
		
		if (source.getEnrolmentId() != null) {
			Enrolment enrolment = new Enrolment();
			enrolment.setId(source.getEnrolmentId());
			target.setEnrolment(enrolment);
		}
		
		if (source.getSpecOfferWaveId() != null) {
			SpecOfferWave specOfferWave = new SpecOfferWave();
			specOfferWave.setId(source.getSpecOfferWaveId());
			target.setSpecOfferWave(specOfferWave);
		}
		
		if (source.getEnrolmentStatusTypeId() != null) {
			EnrolmentStatusType enrolmentStatusType = new EnrolmentStatusType();
			enrolmentStatusType.setId(source.getEnrolmentStatusTypeId());
			target.setEnrolmentStatusType(enrolmentStatusType);
		}
		
		return target;
	}

	@Override
	public EnrolmentStatus convert(final EnrolmentStatusResource source) {
		return convert(source, new EnrolmentStatus());
	}

}
