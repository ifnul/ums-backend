package org.lnu.is.converter.specoffer.subject;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.specoffer.SpecOfferSubject;
import org.lnu.is.resource.specoffer.subject.SpecOfferSubjectResource;

/**
 * SpecOfferSubjectConverter.
 * @author ivanursul
 *
 */
@Converter("specOfferSubjectConverter")
public class SpecOfferSubjectConverter extends AbstractConverter<SpecOfferSubject, SpecOfferSubjectResource> {

	@Override
	public SpecOfferSubjectResource convert(final SpecOfferSubject source, final SpecOfferSubjectResource target) {
		
		target.setAlternative(source.getAlternative());
		target.setId(source.getId());
		target.setIsMajor(source.getIsMajor());
		target.setMark(source.getMark());
		target.setWeightSubject(source.getWeightSubject());
		
		if (source.getSpecOffer() != null) {
			target.setSpecOfferId(source.getSpecOffer().getId());
		}
		
		if (source.getEnrolmentSubject() != null) {
			target.setEnrolmentSubjectId(source.getEnrolmentSubject().getId());
		}
		
		return target;
	}

	@Override
	public SpecOfferSubjectResource convert(final SpecOfferSubject source) {
		return convert(source, new SpecOfferSubjectResource());
	}

}
