package org.lnu.is.converter.enrolmentstatustype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.enrolment.statustype.EnrolmentStatusTypeConverter;
import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.resource.enrolment.statustype.EnrolmentStatusTypeResource;

public class EnrolmentStatusTypeConverterTest {

	private EnrolmentStatusTypeConverter unit = new EnrolmentStatusTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";
		String description = "first death";

		EnrolmentStatusType source = new EnrolmentStatusType();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setDescription(description);

		EnrolmentStatusTypeResource expected = new EnrolmentStatusTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setDescription(description);

		// When
		EnrolmentStatusTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

}
