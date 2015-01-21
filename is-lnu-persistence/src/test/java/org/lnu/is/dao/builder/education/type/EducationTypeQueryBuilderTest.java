package org.lnu.is.dao.builder.education.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.educationtype.EducationType;

public class EducationTypeQueryBuilderTest {

	private EducationTypeQueryBuilder unit = new EducationTypeQueryBuilder();
	
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
		EducationType context = new EducationType();
		
		String expected = "SELECT e FROM EducationType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		EducationType context = new EducationType();
		
		String expected = "SELECT e FROM EducationType e WHERE e.status=:status ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		EducationType context = new EducationType();
		
		String expected = "SELECT e FROM EducationType e WHERE e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EducationType context = new EducationType();
		
		String expected = "SELECT e FROM EducationType e ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		EducationType context = new EducationType();
		context.setName(name);
		context.setAbbrName(abbrName);

		String expected = "SELECT e FROM EducationType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDEfaultCOnstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "abbr name";
		String name = "name";
		EducationType context = new EducationType();
		context.setName(name);
		context.setAbbrName(abbrName);
		
		String expected = "SELECT e FROM EducationType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
