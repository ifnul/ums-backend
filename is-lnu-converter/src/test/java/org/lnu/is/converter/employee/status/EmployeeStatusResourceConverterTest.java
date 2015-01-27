package org.lnu.is.converter.employee.status;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.employee.status.EmployeeStatus;
import org.lnu.is.resource.employee.status.EmployeeStatusResource;

public class EmployeeStatusResourceConverterTest {

	private EmployeeStatusResourceConverter unit = new EmployeeStatusResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "DutyN";
		String abbrName = "AN";

		EmployeeStatus expected = new EmployeeStatus();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		EmployeeStatusResource source = new EmployeeStatusResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		EmployeeStatus actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
