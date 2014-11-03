package org.lnu.is.facade.converter.department;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.departmenttype.DepartmentType;
import org.lnu.is.facade.resource.department.DepartmentResource;

public class DepartmentConverterTest {

	private DepartmentConverter unit = new DepartmentConverter();
	
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

		Department department = new Department();
		department.setAbbrName(abbrName);
		department.setBegDate(begDate);
		department.setEndDate(endDate);
		department.setName(name);
		department.setParent(parent);
		department.setDepartmentType(departmentType);

		DepartmentResource expected = new DepartmentResource();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setName(name);
		expected.setDepartmentTypeId(departmentType.getId());
		expected.setParentId(parent.getId());
		
		// When
		DepartmentResource actual = unit.convert(department);

		// Then
		assertEquals(expected, actual);
	}
}
