package org.lnu.is.dao.builder.timeperiod.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.timeperiod.TimePeriodType;

public class TimePeriodTypeQueryBuilderTest {

	private TimePeriodTypeQueryBuilder unit = new TimePeriodTypeQueryBuilder();
	
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
		TimePeriodType context = new TimePeriodType();

		String expected = "SELECT e FROM TimePeriodType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		TimePeriodType context = new TimePeriodType();
		
		String expected = "SELECT e FROM TimePeriodType e WHERE e.status=:status ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		TimePeriodType context = new TimePeriodType();
		
		String expected = "SELECT e FROM TimePeriodType e WHERE e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		TimePeriodType context = new TimePeriodType();
		
		String expected = "SELECT e FROM TimePeriodType e ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbrNAme";
		String name = "name";
		TimePeriodType context = new TimePeriodType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expected = "SELECT e FROM TimePeriodType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";;
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "abbrNAme";
		String name = "name";
		TimePeriodType context = new TimePeriodType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expected = "SELECT e FROM TimePeriodType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";;
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
