package org.lnu.is.converter.mark.scale.exchange;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.mark.scale.exchange.MarkScaleExchangeConverter;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.exchange.MarkScaleExchange;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.resource.mark.scale.exchange.MarkScaleExchangeResource;

public class MarkScaleExchangeConverterTest {

	private MarkScaleExchangeConverter unit = new MarkScaleExchangeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		Double markMin = 0.0;
		Double markMax = 10.0;
		Double markExchange = 5.0;
		
		Long markscaleId = 1L;
		MarkScale markscale = new MarkScale();
		markscale.setId(markscaleId);
		
		Long markscaleValueId = 1L;
		MarkScaleValue markscaleValue = new MarkScaleValue();
		markscaleValue.setId(markscaleValueId);
		
		Long markscaleExchangeId = 2L;
		MarkScale markscaleExchange = new MarkScale();
		markscaleExchange.setId(markscaleExchangeId);
		
		Long markscaleExchangeValueId = 2L;
		MarkScaleValue markscaleExchangeValue = new MarkScaleValue();
		markscaleExchangeValue.setId(markscaleExchangeValueId);
		
		MarkScaleExchangeResource expected = new MarkScaleExchangeResource();
		expected.setId(id);
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		expected.setMarkExchange(markExchange);
		expected.setMarkScaleId(markscaleId);
		expected.setMarkScaleValueId(markscaleValueId);
		expected.setMarkScaleExchangeId(markscaleExchangeId);
		expected.setMarkScaleExchangeValueId(markscaleExchangeValueId);
		
		MarkScaleExchange source = new MarkScaleExchange();
		source.setId(id);
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		source.setMarkExchange(markExchange);
		source.setMarkScale(markscale);
		source.setMarkScaleValue(markscaleValue);
		source.setMarkScaleExchange(markscaleExchange);
		source.setMarkScaleExchangeValue(markscaleExchangeValue);
		
		// When
		MarkScaleExchangeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Long id = 1L;
		Double markMin = 0.0;
		Double markMax = 10.0;
		Double markExchange = 5.0;
		
		MarkScaleExchangeResource expected = new MarkScaleExchangeResource();
		expected.setId(id);
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		expected.setMarkExchange(markExchange);
		
		MarkScaleExchange source = new MarkScaleExchange();
		source.setId(id);
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		source.setMarkExchange(markExchange);
		
		// When
		MarkScaleExchangeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
