package org.lnu.is.facade.converter.enrolment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.facade.resource.enrolment.EnrolmentResource;

public class EnrolmentResourceConverterTest {

	private EnrolmentResourceConverter unit = new EnrolmentResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String docNum = "1234";
		EnrolmentResource source = new EnrolmentResource();
		source.setDocNum(docNum);

		Enrolment expected = new Enrolment();
		expected.setDocNum(docNum);

		// When
		Enrolment actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
