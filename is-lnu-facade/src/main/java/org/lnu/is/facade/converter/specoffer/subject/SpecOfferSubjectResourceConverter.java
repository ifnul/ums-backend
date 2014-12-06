package org.lnu.is.facade.converter.specoffer.subject;

import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.specoffer.subject.SpecOfferSubjectResource;

/**
 * Spec Offer Subject ResourceConverter.
 * @author ivanursul
 *
 */
@Converter("specOfferSubjectResourceConverter")
public class SpecOfferSubjectResourceConverter extends AbstractConverter<SpecOfferSubjectResource, SpecofferSubject> {

	@Override
	public SpecofferSubject convert(final SpecOfferSubjectResource source, final SpecofferSubject target) {
		
		target.setAlternative(source.getAlternative());
		target.setId(source.getId());
		target.setIsMajor(source.getIsMajor());
		target.setMark(source.getMark());
		
		if (source.getSpecOfferId() != null) {
			SpecOffer specOffer = new SpecOffer();
			specOffer.setId(source.getSpecOfferId());
			
			target.setSpecOffer(specOffer);
		}
		
		if (source.getEnrolmentSubjectId() != null) {
			EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
			enrolmentSubject.setId(source.getEnrolmentSubjectId());
			
			target.setEnrolmentSubject(enrolmentSubject);
		}
		
		return target;
	}

	@Override
	public SpecofferSubject convert(final SpecOfferSubjectResource source) {
		return convert(source, new SpecofferSubject());
	}

}
