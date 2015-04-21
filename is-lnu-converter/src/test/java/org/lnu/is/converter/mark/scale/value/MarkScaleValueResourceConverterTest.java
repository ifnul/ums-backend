package org.lnu.is.converter.mark.scale.value;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.mark.scale.value.MarkScaleValueResourceConverter;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.resource.mark.scale.value.MarkScaleValueResource;


public class MarkScaleValueResourceConverterTest {

	private MarkScaleValueResourceConverter unit = new MarkScaleValueResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String strValue = "strValue";
		
		Long markscaleId = 1L;
		MarkScale markscale = new MarkScale();
		markscale.setId(markscaleId);
		
		MarkScaleValueResource source = new MarkScaleValueResource();
		source.setStrValue(strValue);
		source.setMarkScaleId(markscaleId);
		
		MarkScaleValue expected = new MarkScaleValue();
		expected.setStrValue(strValue);
		expected.setMarkScale(markscale);
		
		// When
		MarkScaleValue actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given	
		String strValue = "strValue";
		
		MarkScaleValueResource source = new MarkScaleValueResource();
		source.setStrValue(strValue);
		
		MarkScaleValue expected = new MarkScaleValue();
		expected.setStrValue(strValue);
		
		// When
		MarkScaleValue actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
