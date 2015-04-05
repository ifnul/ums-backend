package org.lnu.is.converter.sallary.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.salary.type.SallaryType;
import org.lnu.is.resource.sallary.type.SallaryTypeResource;

/**
 * SallaryType converter.
 * @author ivanursul
 *
 */
@Converter("sallaryTypeConverter")
public class SallaryTypeConverter extends AbstractConverter<SallaryType, SallaryTypeResource> {

	@Override
	public SallaryTypeResource convert(final SallaryType source, final SallaryTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public SallaryTypeResource convert(final SallaryType source) {
		return convert(source, new SallaryTypeResource());
	}

}
