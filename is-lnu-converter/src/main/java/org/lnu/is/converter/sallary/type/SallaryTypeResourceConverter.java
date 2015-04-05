package org.lnu.is.converter.sallary.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.salary.type.SallaryType;
import org.lnu.is.resource.sallary.type.SallaryTypeResource;

/**
 * SallaryType resource converter.
 * @author ivanursul
 *
 */
@Converter("sallaryTypeResourceConverter")
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
