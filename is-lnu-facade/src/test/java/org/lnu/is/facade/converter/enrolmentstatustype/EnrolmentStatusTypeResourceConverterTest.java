package org.lnu.is.facade.converter.enrolmentstatustype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.facade.converter.enrolment.statustype.EnrolmentStatusTypeResourceConverter;
import org.lnu.is.facade.resource.enrolment.statustype.EnrolmentStatusTypeResource;

public class EnrolmentStatusTypeResourceConverterTest {

	private EnrolmentStatusTypeResourceConverter unit = new EnrolmentStatusTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";
		String description = "first death";

		EnrolmentStatusTypeResource source = new EnrolmentStatusTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setDescription(description);

		EnrolmentStatusType expected = new EnrolmentStatusType();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setDescription(description);

		// When
		EnrolmentStatusType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
