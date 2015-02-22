package org.lnu.is.converter.markscale.exchange;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.exchange.MarkscaleExchange;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.resource.markscale.exchange.MarkscaleExchangeResource;

public class MarkscaleExchangeConverterTest {

	private MarkscaleExchangeConverter unit = new MarkscaleExchangeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
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
		
		MarkscaleExchangeResource expected = new MarkscaleExchangeResource();
		expected.setId(id);
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		expected.setMarkExchange(markExchange);
		expected.setNote(note);
		expected.setMarkscaleId(markscaleId);
		expected.setMarkscaleValueId(markscaleValueId);
		expected.setMarkscaleExchangeId(markscaleExchangeId);
		expected.setMarkscaleExchangeValueId(markscaleExchangeValueId);
		
		MarkscaleExchange source = new MarkscaleExchange();
		source.setId(id);
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		source.setMarkExchange(markExchange);
		source.setNote(note);
		source.setMarkscale(markscale);
		source.setMarkscaleValue(markscaleValue);
		source.setMarkscaleExchange(markscaleExchange);
		source.setMarkscaleExchangeValue(markscaleExchangeValue);
		
		// When
		MarkscaleExchangeResource actual = unit.convert(source);

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
		String note = "note";
		
		MarkscaleExchangeResource expected = new MarkscaleExchangeResource();
		expected.setId(id);
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		expected.setMarkExchange(markExchange);
		expected.setNote(note);
		
		MarkscaleExchange source = new MarkscaleExchange();
		source.setId(id);
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		source.setMarkExchange(markExchange);
		source.setNote(note);
		
		// When
		MarkscaleExchangeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
