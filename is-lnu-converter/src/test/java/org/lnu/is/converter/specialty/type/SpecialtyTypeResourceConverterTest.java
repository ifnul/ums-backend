package org.lnu.is.converter.specialty.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.resource.specialty.type.SpecialtyTypeResource;

public class SpecialtyTypeResourceConverterTest {

	private SpecialtyTypeResourceConverter unit = new SpecialtyTypeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		SpecialtyTypeResource source = new SpecialtyTypeResource();
		source.setAbbrName(abbrName);
		source.setName(name);

		SpecialtyType expected = new SpecialtyType();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		// When
		SpecialtyType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		SpecialtyTypeResource source = new SpecialtyTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<SpecialtyTypeResource> sources = Arrays.asList(source); 
		
		SpecialtyType expected = new SpecialtyType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<SpecialtyType> expecteds = Arrays.asList(expected);
		
		// Where
		List<SpecialtyType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
