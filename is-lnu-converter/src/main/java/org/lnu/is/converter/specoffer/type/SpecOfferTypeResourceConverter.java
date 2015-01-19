package org.lnu.is.converter.specoffer.type;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.resource.specoffer.type.SpecOfferTypeResource;

/**
 * Spec offer Type Resource Converter.
 * @author ivanursul
 *
 */
@ResourceConverter("specOfferTypeResourceConverter")
public class SpecOfferTypeResourceConverter extends AbstractConverter<SpecOfferTypeResource, SpecOfferType> {

	@Override
	public SpecOfferType convert(final SpecOfferTypeResource source, final SpecOfferType target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setId(source.getId());
		target.setName(source.getName());
		
		if (source.getSpecialtyTypeId() != null) {
			SpecialtyType specialtyType = new SpecialtyType();
			specialtyType.setId(source.getSpecialtyTypeId());
			
			target.setSpecialtyType(specialtyType);
		}
		
		return target;
	}

	@Override
	public SpecOfferType convert(final SpecOfferTypeResource source) {
		return convert(source, new SpecOfferType());
	}

}
