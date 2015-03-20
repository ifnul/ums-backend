package org.lnu.is.dao.builder.department;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.type.DepartmentType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.pagination.MultiplePagedSearch;

public class DepartmentQueryBuilderTest {

	private DepartmentQueryBuilder unit = new DepartmentQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}

	@Test
	public void testBuild() throws Exception {
		// Given
		Department context = new Department();

		String expectedQuery = "SELECT e FROM Department e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Department context = new Department();
		
		String expectedQuery = "SELECT e FROM Department e WHERE e.status=:status ";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		Department context = new Department();
		
		String expectedQuery = "SELECT e FROM Department e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Department context = new Department();
		
		String expectedQuery = "SELECT e FROM Department e ";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
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
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		
		String expectedQuery = "SELECT e FROM Department e WHERE ( e.parent = :parent OR e.departmentType = :departmentType OR e.order = :order OR e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.manager LIKE CONCAT('%',:manager,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDIsabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Department parent = new Department();
		DepartmentType departmentType = new DepartmentType();
		Order order = new Order();
		String name = "name";
		String abbrName = "abbr name";
		String manager = "manager";
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
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		
		String expectedQuery = "SELECT e FROM Department e WHERE ( e.parent = :parent OR e.departmentType = :departmentType OR e.order = :order OR e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.manager LIKE CONCAT('%',:manager,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate) ";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
