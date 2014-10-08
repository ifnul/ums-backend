package org.lnu.is.facade.converter.specoffer;

import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resources.specoffer.SpecOfferResource;
import org.springframework.stereotype.Component;

/**
 * Converter, that convert from Resource to Entity.
 * @author ivanursul
 *
 */
@Component("specOfferResourceConverter")
public class SpecOfferResourceConverter extends AbstractConverter<SpecOfferResource, SpecOffer> {

	@Override
	public SpecOffer convert(final SpecOfferResource source, final SpecOffer target) {
		return target;
	}

	@Override
	public SpecOffer convert(final SpecOfferResource source) {
		return convert(source, new SpecOffer());
	}

}
