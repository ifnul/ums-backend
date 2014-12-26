package org.lnu.is.facade.converter.gendertype;

import org.lnu.is.annotations.Converter;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.resource.gendertype.GenderTypeResource;

/**
 * Gender Type Converter.
 * 
 * @author kushnir
 *
 */

@Converter("genderTypeConverter")
public class GenderTypeConverter extends AbstractConverter<GenderType, GenderTypeResource> {

	@Override
	public GenderTypeResource convert(final GenderType source, final GenderTypeResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public GenderTypeResource convert(final GenderType source) {	
		return convert(source, new GenderTypeResource());
	}

}
