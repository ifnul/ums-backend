package org.lnu.is.converter.markscale.exchange;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.exchange.MarkscaleExchange;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.resource.markscale.exchange.MarkscaleExchangeResource;

/**
 * Markscale exchange resource converter.
 * @author OlehZanevych
 *
 */
@Converter("markscaleExchangeResourceConverter")
public class MarkscaleExchangeResourceConverter extends AbstractConverter<MarkscaleExchangeResource, MarkscaleExchange> {

	@Override
	public MarkscaleExchange convert(final MarkscaleExchangeResource source, final MarkscaleExchange target) {
		
		if (source.getMarkscaleId() != null) {
			Markscale markscale = new Markscale();
			markscale.setId(source.getMarkscaleId());
			target.setMarkscale(markscale);
		}
		
		if (source.getMarkscaleValueId() != null) {
			MarkscaleValue markscaleValue = new MarkscaleValue();
			markscaleValue.setId(source.getMarkscaleValueId());
			target.setMarkscaleValue(markscaleValue);
		}
		
		if (source.getMarkscaleExchangeId() != null) {
			Markscale markscaleExchange = new Markscale();
			markscaleExchange.setId(source.getMarkscaleExchangeId());
			target.setMarkscaleExchange(markscaleExchange);
		}
		
		if (source.getMarkscaleExchangeValueId() != null) {
			MarkscaleValue markscaleExchangeValue = new MarkscaleValue();
			markscaleExchangeValue.setId(source.getMarkscaleExchangeValueId());
			target.setMarkscaleExchangeValue(markscaleExchangeValue);
		}
		
		target.setMarkMin(source.getMarkMin());
		target.setMarkMax(source.getMarkMax());
		target.setMarkExchange(source.getMarkExchange());
		target.setNote(source.getNote());
		
		return target;
	}

	@Override
	public MarkscaleExchange convert(final MarkscaleExchangeResource source) {
		return convert(source, new MarkscaleExchange());
	}

}
