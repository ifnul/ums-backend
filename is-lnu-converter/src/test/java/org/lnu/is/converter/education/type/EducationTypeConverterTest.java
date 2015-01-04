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
		EducationType source = new EducationType();
		source.setName(name);

		EducationTypeResource expected = new EducationTypeResource();
		expected.setName(name);
		
		// When
		EducationTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}

