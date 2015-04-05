package org.lnu.is.converter.degree.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.degree.type.DegreeType;
import org.lnu.is.resource.degree.type.DegreeTypeResource;

public class DegreeTypeResourceConverterTest {

	private DegreeTypeResourceConverter unit = new DegreeTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "DegreeN";
		String abbrName = "AN";

		DegreeType expected = new DegreeType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		DegreeTypeResource source = new DegreeTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		DegreeType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		DegreeTypeResource source = new DegreeTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<DegreeTypeResource> sources = Arrays.asList(source); 
		
		DegreeType expected = new DegreeType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<DegreeType> expecteds = Arrays.asList(expected);
		
		// Where
		List<DegreeType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
