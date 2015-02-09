package org.lnu.is.converter.enrolment.benefit;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.benefit.EnrolmentBenefit;
import org.lnu.is.resource.enrolment.benefit.EnrolmentBenefitResource;

/**
 * Enrolment Benefit Converter.
 * @author ivanursul
 *
 */
@Converter("enrolmentBenefitConverter")
public class EnrolmentBenefitConverter extends AbstractConverter<EnrolmentBenefit, EnrolmentBenefitResource> {

	@Override
	public EnrolmentBenefitResource convert(final EnrolmentBenefit source, final EnrolmentBenefitResource target) {

		target.setId(source.getId());
		
		if (source.getEnrolment() != null) {
			target.setEnrolmentId(source.getEnrolment().getId());
		}
		
		if (source.getBenefit() != null) {
			target.setBenefitId(source.getBenefit().getId());
		}
		
		if (source.getPersonPaper() != null) {
			target.setPersonPaperId(source.getPersonPaper().getId());
		}
		
		return target;
	}

	@Override
	public EnrolmentBenefitResource convert(final EnrolmentBenefit source) {
		return convert(source, new EnrolmentBenefitResource());
	}

}
