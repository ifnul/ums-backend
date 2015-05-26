package org.lnu.is.converter.employee.status;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		EmployeeStatus source = new EmployeeStatus();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<EmployeeStatus> sources = Arrays.asList(source); 
		
		EmployeeStatusResource expected = new EmployeeStatusResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<EmployeeStatusResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<EmployeeStatusResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
