package org.lnu.is.converter.employee.status;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.employee.status.EmployeeStatus;
import org.lnu.is.resource.employee.status.EmployeeStatusResource;

public class EmployeeStatusConverterTest {

	private EmployeeStatusConverter unit = new EmployeeStatusConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "DutyN";
		String abbrName = "AN";

		EmployeeStatus source = new EmployeeStatus();
		source.setName(name);
		source.setAbbrName(abbrName);

		EmployeeStatusResource expected = new EmployeeStatusResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		EmployeeStatusResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
