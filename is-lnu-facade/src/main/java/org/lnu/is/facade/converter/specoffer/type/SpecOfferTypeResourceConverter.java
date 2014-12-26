package org.lnu.is.facade.converter.specoffer.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.resource.specoffer.type.SpecOfferTypeResource;

/**
 * Spec offer Type Resource Converter.
 * @author ivanursul
 *
 */
@Converter("specOfferTypeResourceConverter")
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
