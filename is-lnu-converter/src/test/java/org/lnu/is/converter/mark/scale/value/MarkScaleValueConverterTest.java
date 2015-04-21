package org.lnu.is.converter.mark.scale.value;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.mark.scale.value.MarkScaleValueConverter;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.resource.mark.scale.value.MarkScaleValueResource;

public class MarkScaleValueConverterTest {

	private MarkScaleValueConverter unit = new MarkScaleValueConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String strValue = "strValue";
		
		Long markscaleId = 1L;
		MarkScale markscale = new MarkScale();
		markscale.setId(markscaleId);
		
		MarkScaleValueResource expected = new MarkScaleValueResource();
		expected.setId(id);
		expected.setStrValue(strValue);
		expected.setMarkScaleId(markscaleId);
		
		MarkScaleValue source = new MarkScaleValue();
		source.setId(id);
		source.setStrValue(strValue);
		source.setMarkScale(markscale);
		
		// When
		MarkScaleValueResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Long id = 1L;
		String strValue = "strValue";
		
		MarkScaleValueResource expected = new MarkScaleValueResource();
		expected.setId(id);
		expected.setStrValue(strValue);
		
		MarkScaleValue source = new MarkScaleValue();
		source.setId(id);
		source.setStrValue(strValue);
		
		// When
		MarkScaleValueResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
