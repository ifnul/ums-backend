package org.lnu.is.converter.mark.scale.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.mark.scale.type.MarkScaleType;
import org.lnu.is.resource.mark.scale.type.MarkScaleTypeResource;

/**
 * MarkScale Type Converter.
 * 
 * @author OlehZanevych
 * 
 */
@Converter("markScaleTypeConverter")
public class MarkScaleTypeConverter extends AbstractConverter<MarkScaleType, MarkScaleTypeResource> {

	@Override
	public MarkScaleTypeResource convert(final MarkScaleType source, final MarkScaleTypeResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public MarkScaleTypeResource convert(final MarkScaleType source) {
		return convert(source, new MarkScaleTypeResource());
	}

}
