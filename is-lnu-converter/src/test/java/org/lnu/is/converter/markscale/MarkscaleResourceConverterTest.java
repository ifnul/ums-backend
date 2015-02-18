package org.lnu.is.converter.markscale;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.type.MarkscaleType;
import org.lnu.is.resource.markscale.MarkscaleResource;


public class MarkscaleResourceConverterTest {

	private MarkscaleResourceConverter unit = new MarkscaleResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;
		
		Long markscaleTypeId = 1L;
		MarkscaleType markscaleType = new MarkscaleType();
		markscaleType.setId(markscaleTypeId);
		
		MarkscaleResource source = new MarkscaleResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		source.setMarkscaleTypeId(markscaleTypeId);
		
		Markscale expected = new Markscale();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		expected.setMarkscaleType(markscaleType);
		
		// When
		Markscale actual = unit.convert(source);

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
		
		MarkscaleResource source = new MarkscaleResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setMarkMin(markMin);
		source.setMarkMax(markMax);
		
		Markscale expected = new Markscale();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setMarkMin(markMin);
		expected.setMarkMax(markMax);
		
		// When
		Markscale actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
