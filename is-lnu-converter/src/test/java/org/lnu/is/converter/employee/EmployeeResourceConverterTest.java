package org.lnu.is.converter.employee;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.converter.employee.EmployeeResourceConverter;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.resource.employee.EmployeeResource;


public class EmployeeResourceConverterTest {

	private EmployeeResourceConverter unit = new EmployeeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String email = "email@email.com";
		Date begDate = new Date();
		Date birthDate = new Date();
		EmployeeResource source = new EmployeeResource();
		source.setBegDate(begDate);
		source.setBirthDate(birthDate);
		source.setEmail(email);
		
		Employee expected = new Employee();
		expected.setBegDate(begDate);
		expected.setBirthDate(birthDate);
		expected.setEmail(email);
		
		// When
		Employee actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
