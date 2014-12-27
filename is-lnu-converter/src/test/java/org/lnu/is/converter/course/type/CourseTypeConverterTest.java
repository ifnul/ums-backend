package org.lnu.is.converter.course.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.coursetype.CourseType;
import org.lnu.is.resource.course.type.CourseTypeResource;

public class CourseTypeConverterTest {

	private CourseTypeConverter unit = new CourseTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "AddressN";
		String abbrName = "AN";

		CourseType source = new CourseType();
		source.setName(name);
		source.setAbbrName(abbrName);

		CourseTypeResource expected = new CourseTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		CourseTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
