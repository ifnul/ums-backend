package org.lnu.is.dao.builder.publicactivity;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.publicactivity.PublicActivity;
import org.lnu.is.domain.publicactivity.PublicActivityType;
import org.lnu.is.domain.timeperiod.TimePeriod;

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
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityCOnstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		PublicActivity context = new PublicActivity();
		
		String expectedQuery = "SELECT e FROM PublicActivity e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusCosntraint() throws Exception {
		// Given
		unit.setActive(false);
		
		PublicActivity context = new PublicActivity();
		
		String expectedQuery = "SELECT e FROM PublicActivity e WHERE e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
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
		
		// When
		String actualQuery = unit.build(context);
		
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
		context.setPublicActiveType(publicActiveType);

		String expectedQuery = "SELECT e FROM PublicActivity e WHERE ( e.publicActivityType=:publicActivityType OR e.timePeriod=:timePeriod OR e.name LIKE CONCAT('%',:name,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";

		// When
		String actualQuery = unit.build(context);

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
		context.setPublicActiveType(publicActiveType);
		
		String expectedQuery = "SELECT e FROM PublicActivity e WHERE ( e.publicActivityType=:publicActivityType OR e.timePeriod=:timePeriod OR e.name LIKE CONCAT('%',:name,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
