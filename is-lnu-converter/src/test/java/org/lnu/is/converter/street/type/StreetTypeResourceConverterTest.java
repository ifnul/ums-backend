package org.lnu.is.converter.street.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.street.type.StreetType;
import org.lnu.is.resource.street.type.StreetTypeResource;

public class StreetTypeResourceConverterTest {

	private StreetTypeResourceConverter unit = new StreetTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		StreetType expected = new StreetType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		StreetTypeResource source = new StreetTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		StreetType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		StreetTypeResource source = new StreetTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<StreetTypeResource> sources = Arrays.asList(source); 
		
		StreetType expected = new StreetType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<StreetType> expecteds = Arrays.asList(expected);
		
		// Where
		List<StreetType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}

}
