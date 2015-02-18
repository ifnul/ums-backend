package org.lnu.is.converter.markscale;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.type.MarkscaleType;
import org.lnu.is.resource.markscale.MarkscaleResource;

/**
 * Markscale Resource Converter.
 * @author OlehZanevych
 *
 */
@Converter("markscaleResourceConverter")
public class MarkscaleResourceConverter extends AbstractConverter<MarkscaleResource, Markscale> {

	@Override
	public Markscale convert(final MarkscaleResource source, final Markscale target) {
		
		if (source.getMarkscaleTypeId() != null) {
			MarkscaleType markscaleType = new MarkscaleType();
			markscaleType.setId(source.getMarkscaleTypeId());
			target.setMarkscaleType(markscaleType);
		}
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		target.setMarkMin(source.getMarkMin());
		target.setMarkMax(source.getMarkMax());
		target.setNote(source.getNote());
		
		return target;
	}

	@Override
	public Markscale convert(final MarkscaleResource source) {
		return convert(source, new Markscale());
	}

}
