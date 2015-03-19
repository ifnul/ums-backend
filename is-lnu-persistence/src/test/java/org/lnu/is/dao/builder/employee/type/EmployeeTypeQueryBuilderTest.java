package org.lnu.is.dao.builder.employee.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.employee.type.EmployeeType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class EmployeeTypeQueryBuilderTest {

	private EmployeeTypeQueryBuilder unit = new EmployeeTypeQueryBuilder();
	
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
		EmployeeType context = new EmployeeType();
		
		String expectedQuery = "SELECT e FROM EmployeeType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EmployeeType> pagedSearch = new MultiplePagedSearch<>();
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
		
		EmployeeType context = new EmployeeType();
		
		String expectedQuery = "SELECT e FROM EmployeeType e WHERE e.status=:status ";
		MultiplePagedSearch<EmployeeType> pagedSearch = new MultiplePagedSearch<>();
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
		
		EmployeeType context = new EmployeeType();
		
		String expectedQuery = "SELECT e FROM EmployeeType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EmployeeType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultCOnstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EmployeeType context = new EmployeeType();
		
		String expectedQuery = "SELECT e FROM EmployeeType e ";
		MultiplePagedSearch<EmployeeType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "AN";
		String name = "fdsfds";

		EmployeeType context = new EmployeeType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM EmployeeType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EmployeeType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDEfaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "AN";
		String name = "fdsfds";
		
		EmployeeType context = new EmployeeType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM EmployeeType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<EmployeeType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
