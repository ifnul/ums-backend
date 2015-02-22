package org.lnu.is.converter.markscale.exchange;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.markscale.exchange.MarkscaleExchange;
import org.lnu.is.resource.markscale.exchange.MarkscaleExchangeResource;

/**
 * Markscale exchange converter.
 * @author OlehZanevych
 *
 */
@Converter("markscaleExchangeConverter")
public class MarkscaleExchangeConverter extends AbstractConverter<MarkscaleExchange, MarkscaleExchangeResource> {

	@Override
	public MarkscaleExchangeResource convert(final MarkscaleExchange source, final MarkscaleExchangeResource target) {
		
		if (source.getMarkscale() != null) {
			target.setMarkscaleId(source.getMarkscale().getId());
		}
		
		if (source.getMarkscaleValue() != null) {
			target.setMarkscaleValueId(source.getMarkscaleValue().getId());
		}
		
		if (source.getMarkscaleExchange() != null) {
			target.setMarkscaleExchangeId(source.getMarkscaleExchange().getId());
		}
		
		if (source.getMarkscaleExchangeValue() != null) {
			target.setMarkscaleExchangeValueId(source.getMarkscaleExchangeValue().getId());
		}
		
		target.setMarkMin(source.getMarkMin());
		target.setMarkMax(source.getMarkMax());
		target.setMarkExchange(source.getMarkExchange());
		target.setNote(source.getNote());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public MarkscaleExchangeResource convert(final MarkscaleExchange source) {
		return convert(source, new MarkscaleExchangeResource());
	}

}
