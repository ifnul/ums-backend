package org.lnu.is.converter.sallary.type;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.salarytype.SallaryType;
import org.lnu.is.resource.sallary.type.SallaryTypeResource;

/**
 * SallaryType resource converter.
 * @author ivanursul
 *
 */
@ResourceConverter("sallaryTypeResourceConverter")
public class SallaryTypeResourceConverter extends AbstractConverter<SallaryTypeResource, SallaryType> {

	@Override
	public SallaryType convert(final SallaryTypeResource source, final SallaryType target) {
		
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public SallaryType convert(final SallaryTypeResource source) {
		return convert(source, new SallaryType());
	}

}
