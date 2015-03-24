package org.lnu.is.dao.builder.specoffer.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.pagination.MultiplePagedSearch;

public class SpecOfferTypeQueryBuilderTest {

	private SpecOfferTypeQueryBuilder unit = new SpecOfferTypeQueryBuilder();
	
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
		SpecOfferType context = new SpecOfferType();

		String expectedQuery = "SELECT e FROM SpecOfferType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOfferType> pagedSearch = new MultiplePagedSearch<>();
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
		SpecOfferType context = new SpecOfferType();
		
		String expectedQuery = "SELECT e FROM SpecOfferType e WHERE e.status=:status ";
		MultiplePagedSearch<SpecOfferType> pagedSearch = new MultiplePagedSearch<>();
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
		SpecOfferType context = new SpecOfferType();
		
		String expectedQuery = "SELECT e FROM SpecOfferType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOfferType> pagedSearch = new MultiplePagedSearch<>();
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
		SpecOfferType context = new SpecOfferType();
		
		String expectedQuery = "SELECT e FROM SpecOfferType e ";
		MultiplePagedSearch<SpecOfferType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithOneParameter() throws Exception {
		// Given
		String abbrName = "abbrName";
		
		SpecOfferType context = new SpecOfferType();
		context.setAbbrName(abbrName);
		
		String expectedQuery = "SELECT e FROM SpecOfferType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOfferType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildEmptyParameters() throws Exception {
		// Given
		TimePeriod timePeriod = new TimePeriod();
		String abbrName = "abbrName";
		
		SpecOfferType context = new SpecOfferType();
		context.setAbbrName(abbrName);
		context.setTimePeriod(timePeriod);
		
		String expectedQuery = "SELECT e FROM SpecOfferType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.timePeriod = :timePeriod) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOfferType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildEmptyParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		TimePeriod timePeriod = new TimePeriod();
		String abbrName = "abbrName";
		
		SpecOfferType context = new SpecOfferType();
		context.setAbbrName(abbrName);
		context.setTimePeriod(timePeriod);
		
		String expectedQuery = "SELECT e FROM SpecOfferType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.timePeriod = :timePeriod) ";
		MultiplePagedSearch<SpecOfferType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
