package org.lnu.is.converter.mark.scale.exchange;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.mark.scale.exchange.MarkScaleExchange;
import org.lnu.is.resource.mark.scale.exchange.MarkScaleExchangeResource;

/**
 * MarkScale exchange converter.
 * @author OlehZanevych
 *
 */
@Converter("markScaleExchangeConverter")
public class MarkScaleExchangeConverter extends AbstractConverter<MarkScaleExchange, MarkScaleExchangeResource> {

	@Override
	public MarkScaleExchangeResource convert(final MarkScaleExchange source, final MarkScaleExchangeResource target) {
		
		if (source.getMarkScale() != null) {
			target.setMarkScaleId(source.getMarkScale().getId());
		}
		
		if (source.getMarkScaleValue() != null) {
			target.setMarkScaleValueId(source.getMarkScaleValue().getId());
		}
		
		if (source.getMarkScaleExchange() != null) {
			target.setMarkScaleExchangeId(source.getMarkScaleExchange().getId());
		}
		
		if (source.getMarkScaleExchangeValue() != null) {
			target.setMarkScaleExchangeValueId(source.getMarkScaleExchangeValue().getId());
		}
		
		target.setMarkMin(source.getMarkMin());
		target.setMarkMax(source.getMarkMax());
		target.setMarkExchange(source.getMarkExchange());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public MarkScaleExchangeResource convert(final MarkScaleExchange source) {
		return convert(source, new MarkScaleExchangeResource());
	}

}
