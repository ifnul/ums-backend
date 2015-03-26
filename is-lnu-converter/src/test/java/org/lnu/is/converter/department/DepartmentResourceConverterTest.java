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

public class DepartmentResourceConverterTest {

	private DepartmentResourceConverter unit = new DepartmentResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		Date begDate = new Date();
		Date endDate = new Date();
		String indetifir = "1d 23";
		
		Department parent = new Department();
		parent.setId(1L);
		
		DepartmentType departmentType = new DepartmentType();
		departmentType.setId(2L);
		
		Long orderId = 4L;
		Order order = new Order();
		order.setId(orderId);

		Department expected = new Department();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setName(name);
		expected.setParent(parent);
		expected.setDepartmentType(departmentType);
		expected.setId(orderId);
		expected.setIdentifir(indetifir);
		
		DepartmentResource departmentResource = new DepartmentResource();
		departmentResource.setAbbrName(abbrName);
		departmentResource.setBegDate(begDate);
		departmentResource.setEndDate(endDate);
		departmentResource.setName(name);
		departmentResource.setDepartmentTypeId(departmentType.getId());
		departmentResource.setParentId(parent.getId());
		departmentResource.setOrderId(orderId);
		departmentResource.setIdentifir(indetifir);
		// When
		Department actual = unit.convert(departmentResource);

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
		
		Department expected = new Department();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setName(name);
		
		DepartmentResource departmentResource = new DepartmentResource();
		departmentResource.setAbbrName(abbrName);
		departmentResource.setBegDate(begDate);
		departmentResource.setEndDate(endDate);
		departmentResource.setName(name);
		
		// When
		Department actual = unit.convert(departmentResource);
		
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

		Department expected = new Department();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setName(name);
		expected.setParent(parent);
		expected.setDepartmentType(departmentType);
		expected.setId(orderId);

		DepartmentResource departmentResource = new DepartmentResource();
		departmentResource.setAbbrName(abbrName);
		departmentResource.setBegDate(begDate);
		departmentResource.setEndDate(endDate);
		departmentResource.setName(name);
		departmentResource.setDepartmentTypeId(departmentType.getId());
		departmentResource.setParentId(parent.getId());
		departmentResource.setOrderId(orderId);
		
		// Given
		String name1 = "name";
		String abbrName1 = "abbr name";
		Date begDate1 = new Date();
		Date endDate1 = new Date();
		
		Department expected1 = new Department();
		expected1.setAbbrName(abbrName1);
		expected1.setBegDate(begDate1);
		expected1.setEndDate(endDate1);
		expected1.setName(name1);
		
		DepartmentResource departmentResource1 = new DepartmentResource();
		departmentResource1.setAbbrName(abbrName1);
		departmentResource1.setBegDate(begDate1);
		departmentResource1.setEndDate(endDate1);
		departmentResource1.setName(name1);
		
		List<Department> expecteds = Arrays.asList(expected, expected1);
		
		List<DepartmentResource> sources = Arrays.asList(departmentResource, departmentResource1);
		
		// When
		List<Department> actual = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actual);
	}

}
