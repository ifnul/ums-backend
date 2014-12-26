package org.lnu.is.facade.converter.enrolment.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.enrolment.EnrolmentType;
import org.lnu.is.resource.enrolment.type.EnrolmentTypeResource;

public class EnrolmentTypeResourceConverterTest {

	private EnrolmentTypeResourceConverter unit = new EnrolmentTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "1234";
		EnrolmentTypeResource source = new EnrolmentTypeResource();
		source.setName(name);

		EnrolmentType expected = new EnrolmentType();
		expected.setName(name);

		// When
		EnrolmentType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
