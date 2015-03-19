package org.lnu.is.dao.builder.publicactivity.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.publicactivity.PublicActivityType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PublicActivityTypeQueryBuilderTest {

	private PublicActivityTypeQueryBuilder unit = new PublicActivityTypeQueryBuilder();
	
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
		PublicActivityType context = new PublicActivityType();
		
		String expectedQuery = "SELECT e FROM PublicActivityType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PublicActivityType> pagedSearch = new MultiplePagedSearch<>();
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
		
		PublicActivityType context = new PublicActivityType();
		
		String expectedQuery = "SELECT e FROM PublicActivityType e WHERE e.status=:status ";
		MultiplePagedSearch<PublicActivityType> pagedSearch = new MultiplePagedSearch<>();
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
		
		PublicActivityType context = new PublicActivityType();
		
		String expectedQuery = "SELECT e FROM PublicActivityType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PublicActivityType> pagedSearch = new MultiplePagedSearch<>();
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
		
		PublicActivityType context = new PublicActivityType();
		
		String expectedQuery = "SELECT e FROM PublicActivityType e ";
		MultiplePagedSearch<PublicActivityType> pagedSearch = new MultiplePagedSearch<>();
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
		PublicActivityType context = new PublicActivityType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT e FROM PublicActivityType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PublicActivityType> pagedSearch = new MultiplePagedSearch<>();
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
		PublicActivityType context = new PublicActivityType();
		context.setAbbrName(abbrName);
		
		String expectedQuery = "SELECT e FROM PublicActivityType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<PublicActivityType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
