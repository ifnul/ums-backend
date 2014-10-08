package org.lnu.is.facade.converter.specoffer;

import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resources.specoffer.SpecOfferResource;
import org.springframework.stereotype.Component;

/**
 * Converter, that converts from Entity to Resource.
 * @author ivanursul
 *
 */
@Component("specOfferConverter")
public class SpecOfferConverter extends AbstractConverter<SpecOffer, SpecOfferResource> {

	@Override
	public SpecOfferResource convert(final SpecOffer source, final SpecOfferResource target) {
		return target;
	}

	@Override
	public SpecOfferResource convert(final SpecOffer source) {
		return convert(source, new SpecOfferResource());
	}

}
