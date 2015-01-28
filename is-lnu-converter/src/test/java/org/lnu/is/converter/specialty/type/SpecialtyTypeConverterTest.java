package org.lnu.is.converter.specialty.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.specialty.type.SpecialtyTypeConverter;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.resource.specialty.type.SpecialtyTypeResource;

public class SpecialtyTypeConverterTest {

	private SpecialtyTypeConverter unit = new SpecialtyTypeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		SpecialtyTypeResource expected = new SpecialtyTypeResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		SpecialtyType source = new SpecialtyType();
		source.setAbbrName(abbrName);
		source.setName(name);
		
		// When
		SpecialtyTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		SpecialtyType source = new SpecialtyType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<SpecialtyType> sources = Arrays.asList(source); 
		
		SpecialtyTypeResource expected = new SpecialtyTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<SpecialtyTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<SpecialtyTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
