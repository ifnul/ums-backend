package org.lnu.is.converter.specoffer.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.resource.specoffer.type.SpecOfferTypeResource;

/**
 * Spec Offer Type Converter.
 * @author ivanursul
 *
 */
@Converter("specOfferTypeConverter")
public class SpecOfferTypeConverter extends AbstractConverter<SpecOfferType, SpecOfferTypeResource> {

	@Override
	public SpecOfferTypeResource convert(final SpecOfferType source, final SpecOfferTypeResource target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setId(source.getId());
		target.setName(source.getName());
		
		if (source.getTimePeriod() != null) {
			target.setTimePeriodId(source.getTimePeriod().getId());
		}
		
		return target;
	}

	@Override
	public SpecOfferTypeResource convert(final SpecOfferType source) {
		return convert(source, new SpecOfferTypeResource());
	}

}
