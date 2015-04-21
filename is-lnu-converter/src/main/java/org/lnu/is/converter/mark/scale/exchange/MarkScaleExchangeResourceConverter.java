package org.lnu.is.converter.mark.scale.exchange;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.exchange.MarkScaleExchange;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.resource.mark.scale.exchange.MarkScaleExchangeResource;

/**
 * MarkScale exchange resource converter.
 * @author OlehZanevych
 *
 */
@Converter("markScaleExchangeResourceConverter")
public class MarkScaleExchangeResourceConverter extends AbstractConverter<MarkScaleExchangeResource, MarkScaleExchange> {

	@Override
	public MarkScaleExchange convert(final MarkScaleExchangeResource source, final MarkScaleExchange target) {
		
		if (source.getMarkScaleId() != null) {
			MarkScale markScale = new MarkScale();
			markScale.setId(source.getMarkScaleId());
			target.setMarkScale(markScale);
		}
		
		if (source.getMarkScaleValueId() != null) {
			MarkScaleValue markScaleValue = new MarkScaleValue();
			markScaleValue.setId(source.getMarkScaleValueId());
			target.setMarkScaleValue(markScaleValue);
		}
		
		if (source.getMarkScaleExchangeId() != null) {
			MarkScale markScaleExchange = new MarkScale();
			markScaleExchange.setId(source.getMarkScaleExchangeId());
			target.setMarkScaleExchange(markScaleExchange);
		}
		
		if (source.getMarkScaleExchangeValueId() != null) {
			MarkScaleValue markScaleExchangeValue = new MarkScaleValue();
			markScaleExchangeValue.setId(source.getMarkScaleExchangeValueId());
			target.setMarkScaleExchangeValue(markScaleExchangeValue);
		}
		
		target.setMarkMin(source.getMarkMin());
		target.setMarkMax(source.getMarkMax());
		target.setMarkExchange(source.getMarkExchange());
		
		return target;
	}

	@Override
	public MarkScaleExchange convert(final MarkScaleExchangeResource source) {
		return convert(source, new MarkScaleExchange());
	}

}
