package org.lnu.is.converter.mark.scale;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.type.MarkScaleType;
import org.lnu.is.resource.mark.scale.MarkScaleResource;

/**
 * MarkScale Resource Converter.
 * @author OlehZanevych
 *
 */
@Converter("markScaleResourceConverter")
public class MarkScaleResourceConverter extends AbstractConverter<MarkScaleResource, MarkScale> {

	@Override
	public MarkScale convert(final MarkScaleResource source, final MarkScale target) {
		
		if (source.getMarkScaleTypeId() != null) {
			MarkScaleType markScaleType = new MarkScaleType();
			markScaleType.setId(source.getMarkScaleTypeId());
			target.setMarkScaleType(markScaleType);
		}
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		target.setMarkMin(source.getMarkMin());
		target.setMarkMax(source.getMarkMax());
		
		return target;
	}

	@Override
	public MarkScale convert(final MarkScaleResource source) {
		return convert(source, new MarkScale());
	}

}
