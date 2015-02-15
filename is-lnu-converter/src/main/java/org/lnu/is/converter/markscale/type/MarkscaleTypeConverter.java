package org.lnu.is.converter.markscale.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.markscale.type.MarkscaleType;
import org.lnu.is.resource.markscale.type.MarkscaleTypeResource;

/**
 * Markscale Type Converter.
 * 
 * @author OlehZanevych
 * 
 */
@Converter("markscaleTypeConverter")
public class MarkscaleTypeConverter extends AbstractConverter<MarkscaleType, MarkscaleTypeResource> {

	@Override
	public MarkscaleTypeResource convert(final MarkscaleType source, final MarkscaleTypeResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());
		target.setNote(source.getNote());

		return target;
	}

	@Override
	public MarkscaleTypeResource convert(final MarkscaleType source) {
		return convert(source, new MarkscaleTypeResource());
	}

}
