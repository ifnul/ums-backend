package org.lnu.is.facade.converter.department;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.DepartmentType;
import org.lnu.is.resource.department.DepartmentResource;

public class DepartmentResourceConverterTest {

	private DepartmentResourceConverter unit = new DepartmentResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		Date begDate = new Date();
		Date endDate = new Date();
		
		Department parent = new Department();
		parent.setId(1L);
		
		DepartmentType departmentType = new DepartmentType();
		departmentType.setId(2L);

		Department expected = new Department();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setName(name);
		expected.setParent(parent);
		expected.setDepartmentType(departmentType);

		DepartmentResource departmentResource = new DepartmentResource();
		departmentResource.setAbbrName(abbrName);
		departmentResource.setBegDate(begDate);
		departmentResource.setEndDate(endDate);
		departmentResource.setName(name);
		departmentResource.setDepartmentTypeId(departmentType.getId());
		departmentResource.setParentId(parent.getId());
		
		// When
		Department actual = unit.convert(departmentResource);

		// Then
		assertEquals(expected, actual);
	}
}
