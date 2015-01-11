package org.lnu.is.converter.family.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.familytype.FamilyType;
import org.lnu.is.resource.familytype.FamilyTypeResource;

/**
 * Family Type Converter.
 * @author ivanursul
 *
 */
@Converter("familyTypeConverter")
public class FamilyTypeConverter extends AbstractConverter<FamilyType, FamilyTypeResource> {

	@Override
	public FamilyTypeResource convert(final FamilyType source, final FamilyTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());
		
		return target;
	}

	@Override
	public FamilyTypeResource convert(final FamilyType source) {
		return convert(source, new FamilyTypeResource());
	}

}
