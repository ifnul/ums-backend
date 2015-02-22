package org.lnu.is.converter.markscale.exchange;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.exchange.MarkscaleExchange;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.resource.markscale.exchange.MarkscaleExchangeResource;


public class MarkscaleExchangeResourceConverterTest {

	private MarkscaleExchangeResourceConverter unit = new MarkscaleExchangeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Double markMin = 0.0;
		Double markMax = 10.0;
		Double markExchange = 5.0;
		String note = "note";
		
		Long markscaleId = 1L;
		Markscale markscale = new Markscale();
		markscale.setId(markscaleId);
		
		Long markscaleValueId = 1L;
		MarkscaleValue markscaleValue = new MarkscaleValue();
		markscaleValue.setId(markscaleValueId);
		
		Long markscaleExchangeId = 2L;
		Markscale markscaleExchange = new Markscale();
		markscaleExchange.setId(markscaleExchangeId);
		
		Long markscaleExchangeValueId = 2L;
		MarkscaleValue markscaleExchangeValue = new MarkscaleValue();
		markscaleExchangeValue.setId(markscaleExchangeValueId);
		
		MarkscaleExchangeResource source = new MarkscaleExchangeResource();
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		source.setMarkExchange(markExchange);
		source.setNote(note);
		source.setMarkscaleId(markscaleId);
		source.setMarkscaleValueId(markscaleValueId);
		source.setMarkscaleExchangeId(markscaleExchangeId);
		source.setMarkscaleExchangeValueId(markscaleExchangeValueId);
		
		MarkscaleExchange expected = new MarkscaleExchange();
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		expected.setMarkExchange(markExchange);
		expected.setNote(note);
		expected.setMarkscale(markscale);
		expected.setMarkscaleValue(markscaleValue);
		expected.setMarkscaleExchange(markscaleExchange);
		expected.setMarkscaleExchangeValue(markscaleExchangeValue);
		
		// When
		MarkscaleExchange actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Double markMin = 0.0;
		Double markMax = 10.0;
		Double markExchange = 5.0;
		String note = "note";
		
		MarkscaleExchangeResource source = new MarkscaleExchangeResource();
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		source.setMarkExchange(markExchange);
		source.setNote(note);
		
		MarkscaleExchange expected = new MarkscaleExchange();
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		expected.setMarkExchange(markExchange);
		expected.setNote(note);
		
		// When
		MarkscaleExchange actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
