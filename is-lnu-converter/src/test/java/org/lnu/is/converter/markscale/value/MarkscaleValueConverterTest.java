package org.lnu.is.converter.markscale.value;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.resource.markscale.value.MarkscaleValueResource;

public class MarkscaleValueConverterTest {

	private MarkscaleValueConverter unit = new MarkscaleValueConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String strValue = "strValue";
		
		Long markscaleId = 1L;
		Markscale markscale = new Markscale();
		markscale.setId(markscaleId);
		
		MarkscaleValueResource expected = new MarkscaleValueResource();
		expected.setId(id);
		expected.setStrValue(strValue);
		expected.setMarkscaleId(markscaleId);
		
		MarkscaleValue source = new MarkscaleValue();
		source.setId(id);
		source.setStrValue(strValue);
		source.setMarkscale(markscale);
		
		// When
		MarkscaleValueResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Long id = 1L;
		String strValue = "strValue";
		
		MarkscaleValueResource expected = new MarkscaleValueResource();
		expected.setId(id);
		expected.setStrValue(strValue);
		
		MarkscaleValue source = new MarkscaleValue();
		source.setId(id);
		source.setStrValue(strValue);
		
		// When
		MarkscaleValueResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
