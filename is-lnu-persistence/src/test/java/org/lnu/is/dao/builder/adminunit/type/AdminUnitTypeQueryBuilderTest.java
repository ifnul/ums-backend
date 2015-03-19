package org.lnu.is.dao.builder.adminunit.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.adminunit.type.AdminUnitType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class AdminUnitTypeQueryBuilderTest {

	private AdminUnitTypeQueryBuilder unit = new AdminUnitTypeQueryBuilder();
	
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
		AdminUnitType context = new AdminUnitType();

		String expected = "SELECT e FROM AdminUnitType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstr() throws Exception {
		// Given
		unit.setSecurity(false);
		
		AdminUnitType context = new AdminUnitType();
		
		String expected = "SELECT e FROM AdminUnitType e WHERE e.status=:status ";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusCosntrant() throws Exception {
		// Given
		unit.setActive(false);
		AdminUnitType context = new AdminUnitType();
		
		String expected = "SELECT e FROM AdminUnitType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AdminUnitType context = new AdminUnitType();
		
		String expected = "SELECT e FROM AdminUnitType e ";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abb rname";
		String name = "name";
		
		AdminUnitType context = new AdminUnitType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expected = "SELECT e FROM AdminUnitType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "abb rname";
		String name = "name";
		
		AdminUnitType context = new AdminUnitType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expected = "SELECT e FROM AdminUnitType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
