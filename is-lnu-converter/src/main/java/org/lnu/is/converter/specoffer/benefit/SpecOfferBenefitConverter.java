package org.lnu.is.converter.specoffer.benefit;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.specoffer.SpecOfferBenefit;
import org.lnu.is.resource.specoffer.benefit.SpecOfferBenefitResource;

/**
 * Spec Offer Benefit Converter.
 * @author ivanursul
 *
 */
@Converter("specOfferBenefitConverter")
public class SpecOfferBenefitConverter extends AbstractConverter<SpecOfferBenefit, SpecOfferBenefitResource> {

	@Override
	public SpecOfferBenefitResource convert(final SpecOfferBenefit source, final SpecOfferBenefitResource target) {
		
		if (source.getBenefit() != null) {
			target.setBenefitId(source.getBenefit().getId());
		}
		
		if (source.getSpecOffer() != null) {
			target.setSpecOfferId(source.getSpecOffer().getId());
		}
		
		target.setId(source.getId());
		target.setNote(source.getNote());
		
		return target;
	}

	@Override
	public SpecOfferBenefitResource convert(final SpecOfferBenefit source) {
		return convert(source, new SpecOfferBenefitResource());
	}

}
