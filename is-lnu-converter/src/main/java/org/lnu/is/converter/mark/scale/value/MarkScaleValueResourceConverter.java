package org.lnu.is.converter.mark.scale.value;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.resource.mark.scale.value.MarkScaleValueResource;

/**
 * MarkScale value resource converter.
 * @author OlehZanevych
 *
 */
@Converter("markScaleValueResourceConverter")
public class MarkScaleValueResourceConverter extends AbstractConverter<MarkScaleValueResource, MarkScaleValue> {

	@Override
	public MarkScaleValue convert(final MarkScaleValueResource source, final MarkScaleValue target) {
		
		if (source.getMarkScaleId() != null) {
			MarkScale markScale = new MarkScale();
			markScale.setId(source.getMarkScaleId());
			target.setMarkScale(markScale);
		}
		
		target.setStrValue(source.getStrValue());
		
		return target;
	}

	@Override
	public MarkScaleValue convert(final MarkScaleValueResource source) {
		return convert(source, new MarkScaleValue());
	}

}
