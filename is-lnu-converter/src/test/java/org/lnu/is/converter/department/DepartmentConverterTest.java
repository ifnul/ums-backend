package org.lnu.is.converter.department;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
	
	@Test
	public void testConvertAll() throws Exception {
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
		
		String name1 = "name";
		String abbrName1 = "abbr name";
		Date begDate1 = new Date();
		Date endDate1 = new Date();

		Department department1 = new Department();
		department1.setAbbrName(abbrName1);
		department1.setBegDate(begDate1);
		department1.setEndDate(endDate1);
		department1.setName(name1);
		
		DepartmentResource expected1 = new DepartmentResource();
		expected1.setAbbrName(abbrName1);
		expected1.setBegDate(begDate1);
		expected1.setEndDate(endDate1);
		expected1.setName(name1);
		
		List<Department> source = Arrays.asList(department, department1);
		
		List<DepartmentResource> expecteds = Arrays.asList(expected, expected1);
		// When
		List<DepartmentResource> actual = unit.convertAll(source);
		
		// Then
		assertEquals(expecteds, actual);
	}

}
