package org.lnu.is.converter.markscale.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.markscale.type.MarkscaleType;
import org.lnu.is.resource.markscale.type.MarkscaleTypeResource;

public class MarkscaleTypeConverterTest {

	private MarkscaleTypeConverter unit = new MarkscaleTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "MarkscaleN";
		String abbrName = "AN";

		MarkscaleType source = new MarkscaleType();
		source.setName(name);
		source.setAbbrName(abbrName);

		MarkscaleTypeResource expected = new MarkscaleTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		MarkscaleTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		MarkscaleType source = new MarkscaleType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<MarkscaleType> sources = Arrays.asList(source); 
		
		MarkscaleTypeResource expected = new MarkscaleTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<MarkscaleTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<MarkscaleTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
