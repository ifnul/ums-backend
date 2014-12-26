package org.lnu.is.converter.employee;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.converter.employee.EmployeeConverter;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.resource.employee.EmployeeResource;

public class EmployeeConverterTest {

	private EmployeeConverter unit = new EmployeeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String email = "email@email.com";
		Date begDate = new Date();
		Date birthDate = new Date();
		EmployeeResource expected = new EmployeeResource();
		expected.setBegDate(begDate);
		expected.setBirthDate(birthDate);
		expected.setEmail(email);
		
		Employee source = new Employee();
		source.setBegDate(begDate);
		source.setBirthDate(birthDate);
		source.setEmail(email);
		
		// When
		EmployeeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
