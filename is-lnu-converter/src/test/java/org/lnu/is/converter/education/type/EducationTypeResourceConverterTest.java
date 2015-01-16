package org.lnu.is.converter.education.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.educationtype.EducationType;
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
}
