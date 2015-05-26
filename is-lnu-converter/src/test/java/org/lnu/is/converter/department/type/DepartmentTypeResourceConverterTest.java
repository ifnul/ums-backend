package org.lnu.is.converter.department.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.department.type.DepartmentType;
import org.lnu.is.resource.department.type.DepartmentTypeResource;

public class DepartmentTypeResourceConverterTest {

	private DepartmentTypeResourceConverter unit = new DepartmentTypeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		
		DepartmentTypeResource source = new DepartmentTypeResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setId(id);

		DepartmentType expected = new DepartmentType();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		// When
		DepartmentType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		DepartmentTypeResource source = new DepartmentTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<DepartmentTypeResource> sources = Arrays.asList(source); 
		
		DepartmentType expected = new DepartmentType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<DepartmentType> expecteds = Arrays.asList(expected);
		
		// Where
		List<DepartmentType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
