package org.lnu.is.converter.markscale.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.markscale.type.MarkscaleType;
import org.lnu.is.resource.markscale.type.MarkscaleTypeResource;

/**
 * Markscale Type Resource Converter.
 * 
 * @author OlehZanevych
 *
 */
@Converter("markscaleTypeResourceConverter")
public class MarkscaleTypeResourceConverter extends AbstractConverter<MarkscaleTypeResource, MarkscaleType> {

	@Override
	public MarkscaleType convert(final MarkscaleTypeResource source, final MarkscaleType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());
		target.setNote(source.getNote());

		return target;
	}

	@Override
	public MarkscaleType convert(final MarkscaleTypeResource source) {
		return convert(source, new MarkscaleType());
	}
}
