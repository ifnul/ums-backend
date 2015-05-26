package org.lnu.is.dao.builder.department.specialty;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.specialty.DepartmentSpecialty;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class DepartmentSpecialtyQueryBuilderTest {

	private DepartmentSpecialtyQueryBuilder unit = new DepartmentSpecialtyQueryBuilder();
	
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
		DepartmentSpecialty context = new DepartmentSpecialty();

		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentSpecialty> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		DepartmentSpecialty context = new DepartmentSpecialty();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specialty", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);

		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.department ASC, e.specialty DESC";
		MultiplePagedSearch<DepartmentSpecialty> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE e.status=:status ";
		MultiplePagedSearch<DepartmentSpecialty> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specialty", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE e.status=:status ORDER BY e.department ASC, e.specialty DESC";
		MultiplePagedSearch<DepartmentSpecialty> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentSpecialty> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specialty", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.department ASC, e.specialty DESC";
		MultiplePagedSearch<DepartmentSpecialty> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e ";
		MultiplePagedSearch<DepartmentSpecialty> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specialty", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e ORDER BY e.department ASC, e.specialty DESC";
		MultiplePagedSearch<DepartmentSpecialty> pagedSearch = new MultiplePagedSearch<>();
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
		Specialty specialty = new Specialty();
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		context.setDepartment(department);
		context.setSpecialty(specialty);
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE ( e.department = :department AND e.specialty = :specialty ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentSpecialty> pagedSearch = new MultiplePagedSearch<>();
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
		Specialty specialty = new Specialty();
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		context.setDepartment(department);
		context.setSpecialty(specialty);
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specialty", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE ( e.department = :department AND e.specialty = :specialty ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.department ASC, e.specialty DESC";
		MultiplePagedSearch<DepartmentSpecialty> pagedSearch = new MultiplePagedSearch<>();
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
		Specialty specialty = new Specialty();
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		context.setDepartment(department);
		context.setSpecialty(specialty);
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE ( e.department = :department AND e.specialty = :specialty ) ";
		MultiplePagedSearch<DepartmentSpecialty> pagedSearch = new MultiplePagedSearch<>();
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
		Specialty specialty = new Specialty();
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		context.setDepartment(department);
		context.setSpecialty(specialty);
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specialty", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE ( e.department = :department AND e.specialty = :specialty ) ORDER BY e.department ASC, e.specialty DESC";
		MultiplePagedSearch<DepartmentSpecialty> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
