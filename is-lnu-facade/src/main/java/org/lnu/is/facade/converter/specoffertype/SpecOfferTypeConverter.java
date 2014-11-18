package org.lnu.is.facade.converter.specoffertype;

import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.specoffertype.SpecOfferTypeResource;

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
		
		if (source.getSpecialtyType() != null) {
			target.setSpecialtyTypeId(source.getSpecialtyType().getId());
		}
		
		return target;
	}

	@Override
	public SpecOfferTypeResource convert(final SpecOfferType source) {
		return convert(source, new SpecOfferTypeResource());
	}

}
