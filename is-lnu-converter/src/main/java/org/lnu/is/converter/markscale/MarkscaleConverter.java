package org.lnu.is.converter.markscale;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.resource.markscale.MarkscaleResource;

/**
 * Markscale Converter.
 * @author OlehZanevych
 *
 */
@Converter("markscaleConverter")
public class MarkscaleConverter extends AbstractConverter<Markscale, MarkscaleResource> {

	@Override
	public MarkscaleResource convert(final Markscale source, final MarkscaleResource target) {
		
		if (source.getMarkscaleType() != null) {
			target.setMarkscaleTypeId(source.getMarkscaleType().getId());
		}
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		target.setMarkMin(source.getMarkMin());
		target.setMarkMax(source.getMarkMax());
		target.setNote(source.getNote());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public MarkscaleResource convert(final Markscale source) {
		return convert(source, new MarkscaleResource());
	}

}
