package org.lnu.is.converter.department.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.department.type.DepartmentTypeResourceConverter;
import org.lnu.is.domain.department.DepartmentType;
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
}
