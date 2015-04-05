package org.lnu.is.converter.marriedtype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.married.type.MarriedTypeResourceConverter;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.resource.married.type.MarriedTypeResource;

public class MarriedTypeResourceConverterTest {
	
	private MarriedTypeResourceConverter unit = new MarriedTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr";

		MarriedType expected = new MarriedType();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		MarriedTypeResource source = new MarriedTypeResource();
		source.setAbbrName(abbrName);
		source.setName(name);

		// When
		MarriedType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		MarriedTypeResource source = new MarriedTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<MarriedTypeResource> sources = Arrays.asList(source); 
		
		MarriedType expected = new MarriedType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<MarriedType> expecteds = Arrays.asList(expected);
		
		// Where
		List<MarriedType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
