package org.lnu.is.converter.honor.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.honorstype.HonorType;
import org.lnu.is.resource.honor.type.HonorTypeResource;

/**
 * Honor Type Resource Converter.
 * 
 * @author ivanursul
 *
 */
@Converter("honorTypeResourceConverter")
public class HonorTypeResourceConverter extends AbstractConverter<HonorTypeResource, HonorType> {

	@Override
	public HonorType convert(final HonorTypeResource source, final HonorType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public HonorType convert(final HonorTypeResource source) {
		return convert(source, new HonorType());
	}

}
