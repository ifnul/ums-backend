package org.lnu.is.converter.degree.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.degree.DegreeType;
import org.lnu.is.resource.degree.type.DegreeTypeResource;

public class DegreeTypeConverterTest {

	private DegreeTypeConverter unit = new DegreeTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "DegreeN";
		String abbrName = "AN";

		DegreeType source = new DegreeType();
		source.setName(name);
		source.setAbbrName(abbrName);

		DegreeTypeResource expected = new DegreeTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		DegreeTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		DegreeType source = new DegreeType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<DegreeType> sources = Arrays.asList(source); 
		
		DegreeTypeResource expected = new DegreeTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<DegreeTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<DegreeTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
