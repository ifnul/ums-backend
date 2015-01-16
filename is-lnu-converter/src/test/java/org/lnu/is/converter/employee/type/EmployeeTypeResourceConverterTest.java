package org.lnu.is.converter.employee.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.employee.EmployeeType;
import org.lnu.is.resource.employee.type.EmployeeTypeResource;

public class EmployeeTypeResourceConverterTest {

	private EmployeeTypeResourceConverter unit = new EmployeeTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "EmployeeN";
		String abbrName = "AN";

		EmployeeType expected = new EmployeeType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		EmployeeTypeResource source = new EmployeeTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		EmployeeType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
