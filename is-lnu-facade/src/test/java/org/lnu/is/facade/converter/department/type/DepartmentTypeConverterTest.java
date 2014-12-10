package org.lnu.is.facade.converter.department.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.department.DepartmentType;
import org.lnu.is.facade.resource.department.type.DepartmentTypeResource;

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
}
