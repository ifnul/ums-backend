package org.lnu.is.converter.mark.scale.value;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.resource.mark.scale.value.MarkScaleValueResource;

/**
 * MarkScale value converter.
 * @author OlehZanevych
 *
 */
@Converter("markScaleValueConverter")
public class MarkScaleValueConverter extends AbstractConverter<MarkScaleValue, MarkScaleValueResource> {

	@Override
	public MarkScaleValueResource convert(final MarkScaleValue source, final MarkScaleValueResource target) {
		
		if (source.getMarkScale() != null) {
			target.setMarkScaleId(source.getMarkScale().getId());
		}
		
		target.setStrValue(source.getStrValue());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public MarkScaleValueResource convert(final MarkScaleValue source) {
		return convert(source, new MarkScaleValueResource());
	}

}
