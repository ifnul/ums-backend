package org.lnu.is.dao.builder.department.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.type.DepartmentType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class DepartmentTypeQueryBuilderTest {

	private DepartmentTypeQueryBuilder unit = new DepartmentTypeQueryBuilder();
	
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
		DepartmentType context = new DepartmentType();
		
		String expected = "SELECT e FROM DepartmentType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecuirtyConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		DepartmentType context = new DepartmentType();
		
		String expected = "SELECT e FROM DepartmentType e WHERE e.status=:status ";
		MultiplePagedSearch<DepartmentType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStautsConstaint() throws Exception {
		// Given
		unit.setActive(false);
		
		DepartmentType context = new DepartmentType();
		
		String expected = "SELECT e FROM DepartmentType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstaitns() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		DepartmentType context = new DepartmentType();
		
		String expected = "SELECT e FROM DepartmentType e ";
		MultiplePagedSearch<DepartmentType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		DepartmentType context = new DepartmentType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expected = "SELECT e FROM DepartmentType e WHERE ( d.name LIKE CONCAT('%',:name,'%') AND d.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDEfaultConstaints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String name = "name";
		String abbrName = "abbr name";
		DepartmentType context = new DepartmentType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expected = "SELECT e FROM DepartmentType e WHERE ( d.name LIKE CONCAT('%',:name,'%') AND d.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<DepartmentType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
