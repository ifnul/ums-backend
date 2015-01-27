package org.lnu.is.converter.employee.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.employee.type.EmployeeType;
import org.lnu.is.resource.employee.type.EmployeeTypeResource;

public class EmployeeTypeConverterTest {

	private EmployeeTypeConverter unit = new EmployeeTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "EmployeeN";
		String abbrName = "AN";

		EmployeeType source = new EmployeeType();
		source.setName(name);
		source.setAbbrName(abbrName);

		EmployeeTypeResource expected = new EmployeeTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		EmployeeTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
