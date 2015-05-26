package org.lnu.is.converter.education.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.education.type.EducationType;
import org.lnu.is.resource.education.type.EducationTypeResource;

public class EducationTypeResourceConverterTest {

	private EducationTypeResourceConverter unit = new EducationTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "EducationN";
		String abbrName = "AN";

		EducationType expected = new EducationType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		EducationTypeResource source = new EducationTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		EducationType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		EducationTypeResource source = new EducationTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<EducationTypeResource> sources = Arrays.asList(source); 
		
		EducationType expected = new EducationType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<EducationType> expecteds = Arrays.asList(expected);
		
		// Where
		List<EducationType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
