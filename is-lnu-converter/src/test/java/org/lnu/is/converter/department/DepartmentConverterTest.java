package org.lnu.is.converter.department;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.type.DepartmentType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.resource.department.DepartmentResource;

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

		Long orderId = 4L;
		Order order = new Order();
		order.setId(orderId);

		Department department = new Department();
		department.setAbbrName(abbrName);
		department.setBegDate(begDate);
		department.setEndDate(endDate);
		department.setName(name);
		department.setParent(parent);
		department.setDepartmentType(departmentType);
		department.setOrder(order);
		
		DepartmentResource expected = new DepartmentResource();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setName(name);
		expected.setDepartmentTypeId(departmentType.getId());
		expected.setParentId(parent.getId());
		expected.setOrderId(orderId);
		
		// When
		DepartmentResource actual = unit.convert(department);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		Date begDate = new Date();
		Date endDate = new Date();

		Department department = new Department();
		department.setAbbrName(abbrName);
		department.setBegDate(begDate);
		department.setEndDate(endDate);
		department.setName(name);
		
		DepartmentResource expected = new DepartmentResource();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setName(name);
		
		// When
		DepartmentResource actual = unit.convert(department);
		
		// Then
		assertEquals(expected, actual);
	}
}
