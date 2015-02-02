package org.lnu.is.converter.publicactivity.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.publicactivity.PublicActivityType;
import org.lnu.is.resource.publicactivity.type.PublicActivityTypeResource;

public class PublicActivityTypeResourceConverterTest {

	private PublicActivityTypeResourceConverter unit = new PublicActivityTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "PublicActivityN";
		String abbrName = "AN";

		PublicActivityType expected = new PublicActivityType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		PublicActivityTypeResource source = new PublicActivityTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		PublicActivityType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		PublicActivityTypeResource source = new PublicActivityTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<PublicActivityTypeResource> sources = Arrays.asList(source); 
		
		PublicActivityType expected = new PublicActivityType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<PublicActivityType> expecteds = Arrays.asList(expected);
		
		// Where
		List<PublicActivityType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
