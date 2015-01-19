package org.lnu.is.converter.family.type;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.familytype.FamilyType;
import org.lnu.is.resource.familytype.FamilyTypeResource;

/**
 * Family Type Resorce Converter.
 * @author ivanursul
 *
 */
@ResourceConverter("familyTypeResourceConverter")
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
