package org.lnu.is.facade.converter.enrolment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.resource.enrolment.EnrolmentResource;

public class EnrolmentConverterTest {

	private EnrolmentConverter unit = new EnrolmentConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String docNum = "1234";
		Enrolment source = new Enrolment();
		source.setDocNum(docNum);

		EnrolmentResource expected = new EnrolmentResource();
		expected.setDocNum(docNum);

		// When
		EnrolmentResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
