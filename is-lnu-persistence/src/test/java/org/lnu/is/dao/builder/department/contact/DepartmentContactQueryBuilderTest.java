package org.lnu.is.dao.builder.department.contact;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.contact.type.ContactType;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.contact.DepartmentContact;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class DepartmentContactQueryBuilderTest {

	private DepartmentContactQueryBuilder unit = new DepartmentContactQueryBuilder();
	
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
		DepartmentContact context = new DepartmentContact();

		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		DepartmentContact context = new DepartmentContact();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("contactType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("value", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);

		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.department ASC, e.contactType DESC, e.value ASC";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentContact context = new DepartmentContact();
		
		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE e.status=:status ";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentContact context = new DepartmentContact();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("contactType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("value", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE e.status=:status ORDER BY e.department ASC, e.contactType DESC, e.value ASC";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentContact context = new DepartmentContact();
		
		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentContact context = new DepartmentContact();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("contactType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("value", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.department ASC, e.contactType DESC, e.value ASC";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentContact context = new DepartmentContact();
		
		String expectedQuery = "SELECT e FROM DepartmentContact e ";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentContact context = new DepartmentContact();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("contactType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("value", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM DepartmentContact e ORDER BY e.department ASC, e.contactType DESC, e.value ASC";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
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
		
		Department department = new Department();
		ContactType addressType = new ContactType();
		String value = "fasd";
		
		DepartmentContact context = new DepartmentContact();
		context.setDepartment(department);
		context.setContactType(addressType);
		context.setValue(value);
		
		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE ( e.department = :department AND e.contactType = :addressType AND e.value LIKE CONCAT('%',:value,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		
		Department department = new Department();
		ContactType addressType = new ContactType();
		String value = "fasd";
		
		DepartmentContact context = new DepartmentContact();
		context.setDepartment(department);
		context.setContactType(addressType);
		context.setValue(value);
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("contactType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("value", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE ( e.department = :department AND e.contactType = :addressType AND e.value LIKE CONCAT('%',:value,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.department ASC, e.contactType DESC, e.value ASC";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Department department = new Department();
		ContactType addressType = new ContactType();
		String value = "fasd";
		
		DepartmentContact context = new DepartmentContact();
		context.setDepartment(department);
		context.setContactType(addressType);
		context.setValue(value);
		
		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE ( e.department = :department AND e.contactType = :addressType AND e.value LIKE CONCAT('%',:value,'%') ) ";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Department department = new Department();
		ContactType addressType = new ContactType();
		String value = "fasd";
		
		DepartmentContact context = new DepartmentContact();
		context.setDepartment(department);
		context.setContactType(addressType);
		context.setValue(value);
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("contactType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("value", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE ( e.department = :department AND e.contactType = :addressType AND e.value LIKE CONCAT('%',:value,'%') ) ORDER BY e.department ASC, e.contactType DESC, e.value ASC";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
