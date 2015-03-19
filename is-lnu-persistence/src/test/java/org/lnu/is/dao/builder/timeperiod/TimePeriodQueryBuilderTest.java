package org.lnu.is.dao.builder.timeperiod;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.domain.timeperiod.TimePeriodType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class TimePeriodQueryBuilderTest {

	private TimePeriodQueryBuilder unit = new TimePeriodQueryBuilder();
	
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
		TimePeriod context = new TimePeriod();
		
		String expectedQuery = "SELECT e FROM TimePeriod e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<TimePeriod> pagedSearch = new MultiplePagedSearch<>();
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
		
		TimePeriod context = new TimePeriod();
		
		String expectedQuery = "SELECT e FROM TimePeriod e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<TimePeriod> pagedSearch = new MultiplePagedSearch<>();
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
		
		TimePeriod context = new TimePeriod();
		
		String expectedQuery = "SELECT e FROM TimePeriod e WHERE e.status=:status ";
		MultiplePagedSearch<TimePeriod> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		TimePeriodType timePeriodType = new TimePeriodType();
		Integer numValue = 2;

		TimePeriod context = new TimePeriod();
		context.setBegDate(new Date());
		context.setTimePeriodType(timePeriodType);
		context.setNumValue(numValue);

		String expectedQuery = "SELECT e FROM TimePeriod e WHERE ( e.timePeriodType = :timePeriodType OR e.numValue = :numValue OR e.begDate <= :begDate OR e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<TimePeriod> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		TimePeriodType timePeriodType = new TimePeriodType();
		Integer numValue = 2;
		
		TimePeriod context = new TimePeriod();
		context.setBegDate(new Date());
		context.setTimePeriodType(timePeriodType);
		context.setNumValue(numValue);
		
		String expectedQuery = "SELECT e FROM TimePeriod e WHERE ( e.timePeriodType = :timePeriodType OR e.numValue = :numValue OR e.begDate <= :begDate OR e.endDate >= :endDate) ";
		MultiplePagedSearch<TimePeriod> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
