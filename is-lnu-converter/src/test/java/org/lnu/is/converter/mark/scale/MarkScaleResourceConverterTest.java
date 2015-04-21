package org.lnu.is.converter.mark.scale;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.mark.scale.MarkScaleResourceConverter;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.type.MarkScaleType;
import org.lnu.is.resource.mark.scale.MarkScaleResource;


public class MarkScaleResourceConverterTest {

	private MarkScaleResourceConverter unit = new MarkScaleResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;
		
		Long markscaleTypeId = 1L;
		MarkScaleType markscaleType = new MarkScaleType();
		markscaleType.setId(markscaleTypeId);
		
		MarkScaleResource source = new MarkScaleResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		source.setMarkScaleTypeId(markscaleTypeId);
		
		MarkScale expected = new MarkScale();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		expected.setMarkScaleType(markscaleType);
		
		// When
		MarkScale actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;
		
		MarkScaleResource source = new MarkScaleResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		
		MarkScale expected = new MarkScale();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		
		// When
		MarkScale actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
