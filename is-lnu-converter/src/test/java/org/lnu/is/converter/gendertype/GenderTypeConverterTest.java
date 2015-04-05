package org.lnu.is.converter.gendertype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.resource.gender.type.GenderTypeResource;

public class GenderTypeConverterTest {

	private GenderTypeConverter unit = new GenderTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		GenderType source = new GenderType();
		source.setName(name);
		source.setAbbrName(abbrName);

		GenderTypeResource expected = new GenderTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		GenderTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		GenderType source = new GenderType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<GenderType> sources = Arrays.asList(source); 
		
		GenderTypeResource expected = new GenderTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<GenderTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<GenderTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
