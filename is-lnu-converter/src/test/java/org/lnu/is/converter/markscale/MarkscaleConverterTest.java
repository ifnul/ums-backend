package org.lnu.is.converter.markscale;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.type.MarkscaleType;
import org.lnu.is.resource.markscale.MarkscaleResource;

public class MarkscaleConverterTest {

	private MarkscaleConverter unit = new MarkscaleConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;
		
		Long markscaleTypeId = 1L;
		MarkscaleType markscaleType = new MarkscaleType();
		markscaleType.setId(markscaleTypeId);
		
		MarkscaleResource expected = new MarkscaleResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		expected.setMarkscaleTypeId(markscaleTypeId);
		
		Markscale source = new Markscale();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		source.setMarkscaleType(markscaleType);
		
		// When
		MarkscaleResource actual = unit.convert(source);

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
		
		MarkscaleResource expected = new MarkscaleResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		
		Markscale source = new Markscale();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		
		// When
		MarkscaleResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
