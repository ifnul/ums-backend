package org.lnu.is.converter.markscale.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.markscale.type.MarkscaleType;
import org.lnu.is.resource.markscale.type.MarkscaleTypeResource;

public class MarkscaleTypeResourceConverterTest {

	private MarkscaleTypeResourceConverter unit = new MarkscaleTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "MarkscaleN";
		String abbrName = "AN";

		MarkscaleType expected = new MarkscaleType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		MarkscaleTypeResource source = new MarkscaleTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		MarkscaleType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		MarkscaleTypeResource source = new MarkscaleTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<MarkscaleTypeResource> sources = Arrays.asList(source); 
		
		MarkscaleType expected = new MarkscaleType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<MarkscaleType> expecteds = Arrays.asList(expected);
		
		// Where
		List<MarkscaleType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
