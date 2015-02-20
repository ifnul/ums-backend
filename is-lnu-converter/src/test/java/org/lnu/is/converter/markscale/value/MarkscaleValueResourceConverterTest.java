package org.lnu.is.converter.markscale.value;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.resource.markscale.value.MarkscaleValueResource;


public class MarkscaleValueResourceConverterTest {

	private MarkscaleValueResourceConverter unit = new MarkscaleValueResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String strValue = "strValue";
		
		Long markscaleId = 1L;
		Markscale markscale = new Markscale();
		markscale.setId(markscaleId);
		
		MarkscaleValueResource source = new MarkscaleValueResource();
		source.setStrValue(strValue);
		source.setMarkscaleId(markscaleId);
		
		MarkscaleValue expected = new MarkscaleValue();
		expected.setStrValue(strValue);
		expected.setMarkscale(markscale);
		
		// When
		MarkscaleValue actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given	
		String strValue = "strValue";
		
		MarkscaleValueResource source = new MarkscaleValueResource();
		source.setStrValue(strValue);
		
		MarkscaleValue expected = new MarkscaleValue();
		expected.setStrValue(strValue);
		
		// When
		MarkscaleValue actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
