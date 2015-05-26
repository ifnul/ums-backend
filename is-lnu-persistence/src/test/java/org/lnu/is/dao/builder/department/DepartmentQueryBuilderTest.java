package org.lnu.is.dao.builder.department;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.type.DepartmentType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

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
	public void testBuildWithOrderBy() throws Exception {
		// Given
		Department context = new Department();
		
		OrderBy orderBy1 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("departmentType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("order", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("abbrName", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("manager", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("identifir", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9);

		String expectedQuery = "SELECT e FROM Department e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.parent ASC, e.departmentType DESC, e.order ASC, e.abbrName DESC, e.name ASC, e.manager DESC, e.begDate ASC, e.endDate DESC, e.identifir ASC";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWithDisabledSecurityConstraintWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Department context = new Department();
		
		OrderBy orderBy1 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("departmentType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("order", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("abbrName", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("manager", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("identifir", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9);
		
		String expectedQuery = "SELECT e FROM Department e WHERE e.status=:status ORDER BY e.parent ASC, e.departmentType DESC, e.order ASC, e.abbrName DESC, e.name ASC, e.manager DESC, e.begDate ASC, e.endDate DESC, e.identifir ASC";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWithDisabledStatusConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		Department context = new Department();
		
		OrderBy orderBy1 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("departmentType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("order", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("abbrName", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("manager", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("identifir", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9);
		
		String expectedQuery = "SELECT e FROM Department e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.parent ASC, e.departmentType DESC, e.order ASC, e.abbrName DESC, e.name ASC, e.manager DESC, e.begDate ASC, e.endDate DESC, e.identifir ASC";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWithDisabledDefaultConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Department context = new Department();
		
		OrderBy orderBy1 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("departmentType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("order", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("abbrName", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("manager", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("identifir", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9);
		
		String expectedQuery = "SELECT e FROM Department e ORDER BY e.parent ASC, e.departmentType DESC, e.order ASC, e.abbrName DESC, e.name ASC, e.manager DESC, e.begDate ASC, e.endDate DESC, e.identifir ASC";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
		String indetifir = "s";
			
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
		context.setIdentifir(indetifir);
		
		String expectedQuery = "SELECT e FROM Department e WHERE ( e.parent = :parent AND e.departmentType = :departmentType AND e.order = :order AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') AND e.manager LIKE CONCAT('%',:manager,'%') AND e.identifir LIKE CONCAT('%',:identifir,'%') AND e.begDate <= :begDate AND e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		Department parent = new Department();
		DepartmentType departmentType = new DepartmentType();
		Order order = new Order();
		String name = "name";
		String abbrName = "abbr name";
		String manager = "manager";
		Date begDate = new Date();
		Date endDate = new Date();
		String indetifir = "s";
			
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
		context.setIdentifir(indetifir);
		
		OrderBy orderBy1 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("departmentType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("order", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("abbrName", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("manager", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("identifir", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9);
		
		String expectedQuery = "SELECT e FROM Department e WHERE ( e.parent = :parent AND e.departmentType = :departmentType AND e.order = :order AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') AND e.manager LIKE CONCAT('%',:manager,'%') AND e.identifir LIKE CONCAT('%',:identifir,'%') AND e.begDate <= :begDate AND e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.parent ASC, e.departmentType DESC, e.order ASC, e.abbrName DESC, e.name ASC, e.manager DESC, e.begDate ASC, e.endDate DESC, e.identifir ASC";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraints() throws Exception {
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
		
		String expectedQuery = "SELECT e FROM Department e WHERE ( e.parent = :parent AND e.departmentType = :departmentType AND e.order = :order AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') AND e.manager LIKE CONCAT('%',:manager,'%') AND e.begDate <= :begDate AND e.endDate >= :endDate) ";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraintsWithOrderBy() throws Exception {
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
		
		OrderBy orderBy1 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("departmentType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("order", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("abbrName", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("manager", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("identifir", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9);
		
		String expectedQuery = "SELECT e FROM Department e WHERE ( e.parent = :parent AND e.departmentType = :departmentType AND e.order = :order AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') AND e.manager LIKE CONCAT('%',:manager,'%') AND e.begDate <= :begDate AND e.endDate >= :endDate) ORDER BY e.parent ASC, e.departmentType DESC, e.order ASC, e.abbrName DESC, e.name ASC, e.manager DESC, e.begDate ASC, e.endDate DESC, e.identifir ASC";
		MultiplePagedSearch<Department> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
