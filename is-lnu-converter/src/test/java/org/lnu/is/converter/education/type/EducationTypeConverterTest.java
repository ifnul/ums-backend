package org.lnu.is.converter.education.type;

import static org.junit.Assert.assertEquals;

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
}

