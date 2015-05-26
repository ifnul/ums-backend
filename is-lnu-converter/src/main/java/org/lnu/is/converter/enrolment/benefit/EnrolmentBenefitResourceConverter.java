package org.lnu.is.converter.enrolment.benefit;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.benefit.EnrolmentBenefit;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.resource.enrolment.benefit.EnrolmentBenefitResource;

/**
 * Enrolment Benefit Converter.
 * @author ivanursul
 *
 */
@Converter("enrolmentBenefitResourceConverter")
public class EnrolmentBenefitResourceConverter extends AbstractConverter<EnrolmentBenefitResource, EnrolmentBenefit> {

	@Override
	public EnrolmentBenefit convert(final EnrolmentBenefitResource source, final EnrolmentBenefit target) {

		if (source.getEnrolmentId() != null) {
			Enrolment enrolment = new Enrolment();
			enrolment.setId(source.getEnrolmentId());
			target.setEnrolment(enrolment);
		}
		
		if (source.getBenefitId() != null) {
			Benefit benefit = new Benefit();
			benefit.setId(source.getBenefitId());
			target.setBenefit(benefit);
		}
		
		if (source.getPersonPaperId() != null) {
			PersonPaper personpaper = new PersonPaper();
			personpaper.setId(source.getPersonPaperId());
			target.setPersonPaper(personpaper);
		}
		
		return target;
	}

	@Override
	public EnrolmentBenefit convert(final EnrolmentBenefitResource source) {
		return convert(source, new EnrolmentBenefit());
	}

}
