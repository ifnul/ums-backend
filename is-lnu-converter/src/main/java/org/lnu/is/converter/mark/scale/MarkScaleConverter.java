package org.lnu.is.converter.mark.scale;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.resource.mark.scale.MarkScaleResource;

/**
 * MarkScale Converter.
 * @author OlehZanevych
 *
 */
@Converter("markScaleConverter")
public class MarkScaleConverter extends AbstractConverter<MarkScale, MarkScaleResource> {

	@Override
	public MarkScaleResource convert(final MarkScale source, final MarkScaleResource target) {
		
		if (source.getMarkScaleType() != null) {
			target.setMarkScaleTypeId(source.getMarkScaleType().getId());
		}
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		target.setMarkMin(source.getMarkMin());
		target.setMarkMax(source.getMarkMax());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public MarkScaleResource convert(final MarkScale source) {
		return convert(source, new MarkScaleResource());
	}

}
