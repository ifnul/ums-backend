package org.lnu.is.converter.markscale.value;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.resource.markscale.value.MarkscaleValueResource;

/**
 * Markscale value resource converter.
 * @author OlehZanevych
 *
 */
@Converter("markscaleValueResourceConverter")
public class MarkscaleValueResourceConverter extends AbstractConverter<MarkscaleValueResource, MarkscaleValue> {

	@Override
	public MarkscaleValue convert(final MarkscaleValueResource source, final MarkscaleValue target) {
		
		if (source.getMarkscaleId() != null) {
			Markscale markscale = new Markscale();
			markscale.setId(source.getMarkscaleId());
			target.setMarkscale(markscale);
		}
		
		target.setStrValue(source.getStrValue());
		target.setNote(source.getNote());
		
		return target;
	}

	@Override
	public MarkscaleValue convert(final MarkscaleValueResource source) {
		return convert(source, new MarkscaleValue());
	}

}
