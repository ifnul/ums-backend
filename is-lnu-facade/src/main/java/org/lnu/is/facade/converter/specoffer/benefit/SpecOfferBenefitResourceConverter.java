package org.lnu.is.facade.converter.specoffer.benefit;

import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecofferBenefit;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.specoffer.benefit.SpecOfferBenefitResource;

/**
 * Spec Offer Resource Converter.
 * @author ivanursul
 *
 */
@Converter("specOfferBenefitResourceConverter")
public class SpecOfferBenefitResourceConverter extends AbstractConverter<SpecOfferBenefitResource, SpecofferBenefit> {

	@Override
	public SpecofferBenefit convert(final SpecOfferBenefitResource source, final SpecofferBenefit target) {
		
		if (source.getBenefitId() != null) {
			Benefit benefit = new Benefit();
			benefit.setId(source.getBenefitId());
			target.setBenefit(benefit);
		}
		
		if (source.getSpecOfferId() != null) {
			SpecOffer specOffer = new SpecOffer();
			specOffer.setId(source.getSpecOfferId());
			target.setSpecOffer(specOffer);
		}
		
		return target;
	}

	@Override
	public SpecofferBenefit convert(final SpecOfferBenefitResource source) {
		return convert(source, new SpecofferBenefit());
	}

}
