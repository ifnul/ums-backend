package org.lnu.is.dao.builder.wave.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.wave.type.WaveType;

public class WaveTypeQueryBuilderTest {

	private WaveTypeQueryBuilder unit = new WaveTypeQueryBuilder();
	
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
		WaveType context = new WaveType();

		String expected = "SELECT e FROM WaveType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		WaveType context = new WaveType();
		
		String expected = "SELECT e FROM WaveType e WHERE e.status=:status ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		WaveType context = new WaveType();
		
		String expected = "SELECT e FROM WaveType e WHERE e.crtUserGroup IN (:userGroups) ";
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
		
		WaveType context = new WaveType();
		
		String expected = "SELECT e FROM WaveType e ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "name";
		WaveType context = new WaveType();
		context.setName(name);
		
		String expected = "SELECT e FROM WaveType e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";;
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
		
		String name = "name";
		WaveType context = new WaveType();
		context.setName(name);
		
		String expected = "SELECT e FROM WaveType e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) ";;
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
