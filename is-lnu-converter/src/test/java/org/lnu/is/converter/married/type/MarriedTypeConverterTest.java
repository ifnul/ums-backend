package org.lnu.is.converter.married.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.married.type.MarriedTypeConverter;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.resource.married.type.MarriedTypeResource;

public class MarriedTypeConverterTest {
	
	private MarriedTypeConverter unit = new MarriedTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "ConvertItPlease";
		String abbrName = "CIP";

		MarriedType source = new MarriedType();
		source.setAbbrName(abbrName);
		source.setName(name);

		MarriedTypeResource expected = new MarriedTypeResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		// When
		MarriedTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		MarriedType source = new MarriedType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<MarriedType> sources = Arrays.asList(source); 
		
		MarriedTypeResource expected = new MarriedTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<MarriedTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<MarriedTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
