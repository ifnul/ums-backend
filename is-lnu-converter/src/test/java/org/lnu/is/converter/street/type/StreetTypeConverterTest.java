package org.lnu.is.converter.street.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.street.type.StreetType;
import org.lnu.is.resource.street.type.StreetTypeResource;

public class StreetTypeConverterTest {

	private StreetTypeConverter unit = new StreetTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		
		StreetType source = new StreetType();
		source.setName(name);
		source.setAbbrName(abbrName);

		StreetTypeResource expected = new StreetTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		StreetTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		StreetType source = new StreetType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<StreetType> sources = Arrays.asList(source); 
		
		StreetTypeResource expected = new StreetTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<StreetTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<StreetTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
