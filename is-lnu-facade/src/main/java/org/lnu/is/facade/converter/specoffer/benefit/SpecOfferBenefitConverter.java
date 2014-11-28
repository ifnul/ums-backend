package org.lnu.is.facade.converter.specoffer.benefit;

import org.lnu.is.domain.specoffer.SpecofferBenefit;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.specoffer.benefit.SpecOfferBenefitResource;

/**
 * Spec Offer Benefit Converter.
 * @author ivanursul
 *
 */
@Converter("specOfferBenefitConverter")
public class SpecOfferBenefitConverter extends AbstractConverter<SpecofferBenefit, SpecOfferBenefitResource> {

	@Override
	public SpecOfferBenefitResource convert(final SpecofferBenefit source, final SpecOfferBenefitResource target) {
		
		if (source.getBenefit() != null) {
			target.setBenefitId(source.getBenefit().getId());
		}
		
		if (source.getSpecOffer() != null) {
			target.setSpecOfferId(source.getSpecOffer().getId());
		}
		
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public SpecOfferBenefitResource convert(final SpecofferBenefit source) {
		return convert(source, new SpecOfferBenefitResource());
	}

}
