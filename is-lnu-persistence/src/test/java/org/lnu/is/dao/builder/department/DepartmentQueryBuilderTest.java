package org.lnu.is.dao.builder.department;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.DepartmentType;
import org.lnu.is.domain.order.Order;

public class DepartmentQueryBuilderTest {

	private DepartmentQueryBuilder unit = new DepartmentQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Department context = new Department();

		String expectedQuery = "SELECT e FROM Department e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Department parent = new Department();
		DepartmentType departmentType = new DepartmentType();
		Order order = new Order();
		String name = "name";
		String abbrName = "abbr name";
		String manager = "manager";
		String phone = "pohne";
		String email = "emaul";
		Date begDate = new Date();
		Date endDate = new Date();

		Department context = new Department();
		context.setName(name);
		context.setParent(parent);
		context.setDepartmentType(departmentType);
		context.setOrder(order);
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setManager(manager);
		context.setPhone(phone);
		context.setEmail(email);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		
		String expectedQuery = "SELECT e FROM Department e WHERE ( e.parent = :parent OR e.departmentType = :departmentType OR e.order = :order OR e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.manager LIKE CONCAT('%',:manager,'%') OR e.phone LIKE CONCAT('%',:phone,'%') OR e.email LIKE CONCAT('%',:email,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate) AND e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
