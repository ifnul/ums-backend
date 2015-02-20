package org.lnu.is.converter.markscale.value;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.resource.markscale.value.MarkscaleValueResource;

/**
 * Markscale value converter.
 * @author OlehZanevych
 *
 */
@Converter("markscaleValueConverter")
public class MarkscaleValueConverter extends AbstractConverter<MarkscaleValue, MarkscaleValueResource> {

	@Override
	public MarkscaleValueResource convert(final MarkscaleValue source, final MarkscaleValueResource target) {
		
		if (source.getMarkscale() != null) {
			target.setMarkscaleId(source.getMarkscale().getId());
		}
		
		target.setStrValue(source.getStrValue());
		target.setNote(source.getNote());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public MarkscaleValueResource convert(final MarkscaleValue source) {
		return convert(source, new MarkscaleValueResource());
	}

}
