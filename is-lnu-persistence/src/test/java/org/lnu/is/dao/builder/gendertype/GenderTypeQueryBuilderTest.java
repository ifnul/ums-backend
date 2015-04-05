package org.lnu.is.dao.builder.gendertype;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.dao.builder.gender.type.GenderTypeQueryBuilder;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class GenderTypeQueryBuilderTest {

	private GenderTypeQueryBuilder unit = new GenderTypeQueryBuilder();
	
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
		GenderType context = new GenderType();
		
		String expectedQuery = "SELECT e FROM GenderType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<GenderType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityCOnstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		GenderType context = new GenderType();
		
		String expectedQuery = "SELECT e FROM GenderType e WHERE e.status=:status ";
		MultiplePagedSearch<GenderType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusCosntraint() throws Exception {
		// Given
		unit.setActive(false);
		
		GenderType context = new GenderType();
		
		String expectedQuery = "SELECT e FROM GenderType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<GenderType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		GenderType context = new GenderType();
		
		String expectedQuery = "SELECT e FROM GenderType e ";
		MultiplePagedSearch<GenderType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbrname";
		GenderType context = new GenderType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT e FROM GenderType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<GenderType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "abbrname";
		GenderType context = new GenderType();
		context.setAbbrName(abbrName);
		
		String expectedQuery = "SELECT e FROM GenderType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<GenderType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
