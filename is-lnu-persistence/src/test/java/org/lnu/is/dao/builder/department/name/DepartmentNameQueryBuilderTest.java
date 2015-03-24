package org.lnu.is.dao.builder.department.name;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.name.DepartmentName;
import org.lnu.is.domain.language.Language;
import org.lnu.is.pagination.MultiplePagedSearch;

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
	public void testBuildWithParameters() throws Exception {
		// Given
		Department department = new Department();
		Language language = new Language();
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
	public void testBuildWithParametersAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Department department = new Department();
		Language language = new Language();
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
}
