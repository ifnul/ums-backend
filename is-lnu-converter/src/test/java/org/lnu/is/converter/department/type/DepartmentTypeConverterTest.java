package org.lnu.is.converter.department.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.department.type.DepartmentType;
import org.lnu.is.resource.department.type.DepartmentTypeResource;

public class DepartmentTypeConverterTest {

	private DepartmentTypeConverter unit = new DepartmentTypeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		
		DepartmentType source = new DepartmentType();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setId(id);

		DepartmentTypeResource expected = new DepartmentTypeResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setId(id);
		
		// When
		DepartmentTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		DepartmentType source = new DepartmentType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<DepartmentType> sources = Arrays.asList(source); 
		
		DepartmentTypeResource expected = new DepartmentTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<DepartmentTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<DepartmentTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
