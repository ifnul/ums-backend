package org.lnu.is.converter.education.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.educationtype.EducationType;
import org.lnu.is.resource.education.type.EducationTypeResource;

public class EducationTypeConverterTest {

	private EducationTypeConverter unit = new EducationTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		EducationType source = new EducationType();
		source.setName(name);
		source.setAbbrName(abbrName);

		EducationTypeResource expected = new EducationTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		EducationTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		EducationType source = new EducationType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<EducationType> sources = Arrays.asList(source); 
		
		EducationTypeResource expected = new EducationTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<EducationTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<EducationTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}

