package org.lnu.is.converter.honor.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.honors.type.HonorType;
import org.lnu.is.resource.honor.type.HonorTypeResource;

/**
 * Honor Type Converter.
 * 
 * @author ivanursul
 *
 */

@Converter("honorTypeConverter")
public class HonorTypeConverter extends AbstractConverter<HonorType, HonorTypeResource> {

	@Override
	public HonorTypeResource convert(final HonorType source, final HonorTypeResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public HonorTypeResource convert(final HonorType source) {	
		return convert(source, new HonorTypeResource());
	}

}
