package org.lnu.is.dao.builder.department.name;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.name.DepartmentName;
import org.lnu.is.domain.language.language;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class DepartmentNameQueryBuilderTest {

	private DepartmentNameQueryBuilder unit = new DepartmentNameQueryBuilder();
	
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
		DepartmentName context = new DepartmentName();

		String expectedQuery = "SELECT e FROM DepartmentName e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentName> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		DepartmentName context = new DepartmentName();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("language", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);

		String expectedQuery = "SELECT e FROM DepartmentName e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.department ASC, e.language DESC, e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<DepartmentName> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentName context = new DepartmentName();
		
		String expectedQuery = "SELECT e FROM DepartmentName e WHERE e.status=:status ";
		MultiplePagedSearch<DepartmentName> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentName context = new DepartmentName();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("language", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM DepartmentName e WHERE e.status=:status ORDER BY e.department ASC, e.language DESC, e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<DepartmentName> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentName context = new DepartmentName();
		
		String expectedQuery = "SELECT e FROM DepartmentName e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentName> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentName context = new DepartmentName();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("language", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM DepartmentName e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.department ASC, e.language DESC, e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<DepartmentName> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentName context = new DepartmentName();
		
		String expectedQuery = "SELECT e FROM DepartmentName e ";
		MultiplePagedSearch<DepartmentName> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentName context = new DepartmentName();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("language", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM DepartmentName e ORDER BY e.department ASC, e.language DESC, e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<DepartmentName> pagedSearch = new MultiplePagedSearch<>();
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
		language language = new language();
		String name = "fdfds";
		String abbrName = "asfasf";
		DepartmentName context = new DepartmentName();
		context.setDepartment(department);
		context.setLanguage(language);
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM DepartmentName e WHERE ( e.department = :department AND e.language = :language AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentName> pagedSearch = new MultiplePagedSearch<>();
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
		language language = new language();
		String name = "fdfds";
		String abbrName = "asfasf";
		DepartmentName context = new DepartmentName();
		context.setDepartment(department);
		context.setLanguage(language);
		context.setAbbrName(abbrName);
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("language", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM DepartmentName e WHERE ( e.department = :department AND e.language = :language AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.department ASC, e.language DESC, e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<DepartmentName> pagedSearch = new MultiplePagedSearch<>();
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
		language language = new language();
		String name = "fdfds";
		String abbrName = "asfasf";
		DepartmentName context = new DepartmentName();
		context.setDepartment(department);
		context.setLanguage(language);
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM DepartmentName e WHERE ( e.department = :department AND e.language = :language AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') ) ";
		MultiplePagedSearch<DepartmentName> pagedSearch = new MultiplePagedSearch<>();
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
		language language = new language();
		String name = "fdfds";
		String abbrName = "asfasf";
		DepartmentName context = new DepartmentName();
		context.setDepartment(department);
		context.setLanguage(language);
		context.setAbbrName(abbrName);
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("language", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM DepartmentName e WHERE ( e.department = :department AND e.language = :language AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') ) ORDER BY e.department ASC, e.language DESC, e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<DepartmentName> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
