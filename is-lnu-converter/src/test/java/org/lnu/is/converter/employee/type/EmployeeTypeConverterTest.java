package org.lnu.is.converter.employee.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		EmployeeType source = new EmployeeType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<EmployeeType> sources = Arrays.asList(source); 
		
		EmployeeTypeResource expected = new EmployeeTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<EmployeeTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<EmployeeTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
