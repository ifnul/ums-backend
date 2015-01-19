package org.lnu.is.converter.specialty.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.resource.specialty.type.SpecialtyTypeResource;

/**
 * Specialty Type Converter.
 * @author ivanursul
 *
 */
@Converter("specialtyTypeConverter")
public class SpecialtyTypeConverter extends AbstractConverter<SpecialtyType, SpecialtyTypeResource> {

	@Override
	public SpecialtyTypeResource convert(final SpecialtyType source, final SpecialtyTypeResource target) {
		
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());
		
		return target;
	}

	@Override
	public SpecialtyTypeResource convert(final SpecialtyType source) {
		return convert(source, new SpecialtyTypeResource());
	}

}
