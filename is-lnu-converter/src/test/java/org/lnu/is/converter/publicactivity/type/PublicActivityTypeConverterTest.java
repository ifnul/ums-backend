package org.lnu.is.converter.publicactivity.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.publicactivity.PublicActivityType;
import org.lnu.is.resource.publicactivity.type.PublicActivityTypeResource;

public class PublicActivityTypeConverterTest {

	private PublicActivityTypeConverter unit = new PublicActivityTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		PublicActivityType source = new PublicActivityType();
		source.setName(name);
		source.setAbbrName(abbrName);

		PublicActivityTypeResource expected = new PublicActivityTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		PublicActivityTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		PublicActivityType source = new PublicActivityType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<PublicActivityType> sources = Arrays.asList(source); 
		
		PublicActivityTypeResource expected = new PublicActivityTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<PublicActivityTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<PublicActivityTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}

