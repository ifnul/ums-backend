package org.lnu.is.converter.family.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.family.type.FamilyType;
import org.lnu.is.resource.family.type.FamilyTypeResource;

/**
 * Family Type Resorce Converter.
 * @author ivanursul
 *
 */
@Converter("familyTypeResourceConverter")
public class FamilyTypeResourceConverter extends AbstractConverter<FamilyTypeResource, FamilyType> {

	@Override
	public FamilyType convert(final FamilyTypeResource source, final FamilyType target) {
		
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());
		
		return target;
	}

	@Override
	public FamilyType convert(final FamilyTypeResource source) {
		return convert(source, new FamilyType());
	}

}
