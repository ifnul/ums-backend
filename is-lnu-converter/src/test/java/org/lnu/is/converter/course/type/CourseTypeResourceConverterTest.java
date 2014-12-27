package org.lnu.is.converter.course.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.coursetype.CourseType;
import org.lnu.is.resource.course.type.CourseTypeResource;

public class CourseTypeResourceConverterTest {

	private CourseTypeResourceConverter unit = new CourseTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "AddressN";
		String abbrName = "AN";

		CourseType expected = new CourseType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		CourseTypeResource source = new CourseTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		CourseType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
