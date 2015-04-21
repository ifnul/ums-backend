package org.lnu.is.converter.mark.scale.exchange;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.mark.scale.exchange.MarkScaleExchangeResourceConverter;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.exchange.MarkScaleExchange;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.resource.mark.scale.exchange.MarkScaleExchangeResource;


public class MarkScaleExchangeResourceConverterTest {

	private MarkScaleExchangeResourceConverter unit = new MarkScaleExchangeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
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
		
		MarkScaleExchangeResource source = new MarkScaleExchangeResource();
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		source.setMarkExchange(markExchange);
		source.setMarkScaleId(markscaleId);
		source.setMarkScaleValueId(markscaleValueId);
		source.setMarkScaleExchangeId(markscaleExchangeId);
		source.setMarkScaleExchangeValueId(markscaleExchangeValueId);
		
		MarkScaleExchange expected = new MarkScaleExchange();
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		expected.setMarkExchange(markExchange);
		expected.setMarkScale(markscale);
		expected.setMarkScaleValue(markscaleValue);
		expected.setMarkScaleExchange(markscaleExchange);
		expected.setMarkScaleExchangeValue(markscaleExchangeValue);
		
		// When
		MarkScaleExchange actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Double markMin = 0.0;
		Double markMax = 10.0;
		Double markExchange = 5.0;
		
		MarkScaleExchangeResource source = new MarkScaleExchangeResource();
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		source.setMarkExchange(markExchange);
		
		MarkScaleExchange expected = new MarkScaleExchange();
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		expected.setMarkExchange(markExchange);
		
		// When
		MarkScaleExchange actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
