package org.lnu.is.converter.mark.scale;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.mark.scale.MarkScaleConverter;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.type.MarkScaleType;
import org.lnu.is.resource.mark.scale.MarkScaleResource;

public class MarkScaleConverterTest {

	private MarkScaleConverter unit = new MarkScaleConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;
		
		Long markscaleTypeId = 1L;
		MarkScaleType markscaleType = new MarkScaleType();
		markscaleType.setId(markscaleTypeId);
		
		MarkScaleResource expected = new MarkScaleResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		expected.setMarkScaleTypeId(markscaleTypeId);
		
		MarkScale source = new MarkScale();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		source.setMarkScaleType(markscaleType);
		
		// When
		MarkScaleResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Long id = 1L;
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;
		
		MarkScaleResource expected = new MarkScaleResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		
		MarkScale source = new MarkScale();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		
		// When
		MarkScaleResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
