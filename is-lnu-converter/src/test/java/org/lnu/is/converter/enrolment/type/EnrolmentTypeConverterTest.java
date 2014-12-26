package org.lnu.is.converter.enrolment.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.enrolment.type.EnrolmentTypeConverter;
import org.lnu.is.domain.enrolment.EnrolmentType;
import org.lnu.is.resource.enrolment.type.EnrolmentTypeResource;

public class EnrolmentTypeConverterTest {

	private EnrolmentTypeConverter unit = new EnrolmentTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "1234";
		EnrolmentType source = new EnrolmentType();
		source.setName(name);

		EnrolmentTypeResource expected = new EnrolmentTypeResource();
		expected.setName(name);

		// When
		EnrolmentTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
