package org.lnu.is.facade.converter.specoffer.subject;

import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.specoffer.subject.SpecOfferSubjectResource;

/**
 * SpecOfferSubjectConverter.
 * @author ivanursul
 *
 */
@Converter("specOfferSubjectConverter")
public class SpecOfferSubjectConverter extends AbstractConverter<SpecofferSubject, SpecOfferSubjectResource> {

	@Override
	public SpecOfferSubjectResource convert(final SpecofferSubject source, final SpecOfferSubjectResource target) {
		
		target.setAlternative(source.getAlternative());
		target.setId(source.getId());
		target.setIsMajor(source.getIsMajor());
		target.setMark(source.getMark());
		
		if (source.getSpecOffer() != null) {
			target.setSpecOfferId(source.getSpecOffer().getId());
		}
		
		if (source.getEnrolmentSubject() != null) {
			target.setEnrolmentSubjectId(source.getEnrolmentSubject().getId());
		}
		
		return target;
	}

	@Override
	public SpecOfferSubjectResource convert(final SpecofferSubject source) {
		return convert(source, new SpecOfferSubjectResource());
	}

}
