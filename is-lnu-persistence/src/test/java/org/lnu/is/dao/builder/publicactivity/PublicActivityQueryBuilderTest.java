package org.lnu.is.dao.builder.publicactivity;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.publicactivity.PublicActivity;
import org.lnu.is.domain.publicactivity.PublicActivityType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PublicActivityQueryBuilderTest {

	private PublicActivityQueryBuilder unit = new PublicActivityQueryBuilder();
	
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
		PublicActivity context = new PublicActivity();
		
		String expectedQuery = "SELECT e FROM PublicActivity e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PublicActivity> pagedSearch = new MultiplePagedSearch<>();
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
		
		PublicActivity context = new PublicActivity();
		
		String expectedQuery = "SELECT e FROM PublicActivity e WHERE e.status=:status ";
		MultiplePagedSearch<PublicActivity> pagedSearch = new MultiplePagedSearch<>();
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
		
		PublicActivity context = new PublicActivity();
		
		String expectedQuery = "SELECT e FROM PublicActivity e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PublicActivity> pagedSearch = new MultiplePagedSearch<>();
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
		
		PublicActivity context = new PublicActivity();
		
		String expectedQuery = "SELECT e FROM PublicActivity e ";
		MultiplePagedSearch<PublicActivity> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "fdsfds";
		Date begDate = new Date();
		Date endDate = new Date();
		TimePeriod timePeriod = new TimePeriod();
		PublicActivityType publicActiveType = new PublicActivityType();
		
		PublicActivity context = new PublicActivity();
		context.setName(name);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		context.setTimePeriod(timePeriod);
		context.setPublicActivityType(publicActiveType);

		String expectedQuery = "SELECT e FROM PublicActivity e WHERE ( e.publicActivityType=:publicActivityType AND e.timePeriod=:timePeriod AND e.name LIKE CONCAT('%',:name,'%') AND e.begDate <= :begDate AND e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PublicActivity> pagedSearch = new MultiplePagedSearch<>();
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
		
		String name = "fdsfds";
		Date begDate = new Date();
		Date endDate = new Date();
		TimePeriod timePeriod = new TimePeriod();
		PublicActivityType publicActiveType = new PublicActivityType();
		
		PublicActivity context = new PublicActivity();
		context.setName(name);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		context.setTimePeriod(timePeriod);
		context.setPublicActivityType(publicActiveType);
		
		String expectedQuery = "SELECT e FROM PublicActivity e WHERE ( e.publicActivityType=:publicActivityType AND e.timePeriod=:timePeriod AND e.name LIKE CONCAT('%',:name,'%') AND e.begDate <= :begDate AND e.endDate >= :endDate) ";
		MultiplePagedSearch<PublicActivity> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
