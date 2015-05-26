package org.lnu.is.dao.builder.specialty.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class SpecialtyTypeQueryBuilderTest {

	private SpecialtyTypeQueryBuilder unit = new SpecialtyTypeQueryBuilder();
	
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
		SpecialtyType context = new SpecialtyType();
		
		String expected = "SELECT e FROM SpecialtyType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecialtyType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstrains() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		SpecialtyType context = new SpecialtyType();
		
		String expected = "SELECT e FROM SpecialtyType e ";
		MultiplePagedSearch<SpecialtyType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		SpecialtyType context = new SpecialtyType();
		
		String expected = "SELECT e FROM SpecialtyType e WHERE e.status=:status ";
		MultiplePagedSearch<SpecialtyType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		SpecialtyType context = new SpecialtyType();
		
		String expected = "SELECT e FROM SpecialtyType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecialtyType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "fdsfds";
		
		SpecialtyType context = new SpecialtyType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expected = "SELECT e FROM SpecialtyType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecialtyType> pagedSearch = new MultiplePagedSearch<>();
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
		
		String abbrName = "abbr name";
		String name = "fdsfds";
		
		SpecialtyType context = new SpecialtyType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expected = "SELECT e FROM SpecialtyType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<SpecialtyType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
