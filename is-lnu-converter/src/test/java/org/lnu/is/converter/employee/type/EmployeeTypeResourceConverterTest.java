package org.lnu.is.converter.employee.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.employee.type.EmployeeType;
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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		EmployeeTypeResource source = new EmployeeTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<EmployeeTypeResource> sources = Arrays.asList(source); 
		
		EmployeeType expected = new EmployeeType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<EmployeeType> expecteds = Arrays.asList(expected);
		
		// Where
		List<EmployeeType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
