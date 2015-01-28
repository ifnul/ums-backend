package org.lnu.is.converter.employee.status;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		EmployeeStatusResource source = new EmployeeStatusResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<EmployeeStatusResource> sources = Arrays.asList(source); 
		
		EmployeeStatus expected = new EmployeeStatus();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<EmployeeStatus> expecteds = Arrays.asList(expected);
		
		// Where
		List<EmployeeStatus> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
