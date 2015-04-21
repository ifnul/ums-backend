package org.lnu.is.converter.mark.scale.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.mark.scale.type.MarkScaleType;
import org.lnu.is.resource.mark.scale.type.MarkScaleTypeResource;

/**
 * MarkScale Type Resource Converter.
 * 
 * @author OlehZanevych
 *
 */
@Converter("markScaleTypeResourceConverter")
public class MarkScaleTypeResourceConverter extends AbstractConverter<MarkScaleTypeResource, MarkScaleType> {

	@Override
	public MarkScaleType convert(final MarkScaleTypeResource source, final MarkScaleType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public MarkScaleType convert(final MarkScaleTypeResource source) {
		return convert(source, new MarkScaleType());
	}
}
