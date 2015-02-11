package org.lnu.is.dao.builder.person.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.person.type.PersonType;

public class PersonTypeQueryBuilderTest {

	private PersonTypeQueryBuilder unit = new PersonTypeQueryBuilder();
	
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
		PersonType context = new PersonType();
		
		String expectedQuery = "SELECT e FROM PersonType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		PersonType context = new PersonType();
		
		String expectedQuery = "SELECT e FROM PersonType e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		PersonType context = new PersonType();
		
		String expectedQuery = "SELECT e FROM PersonType e WHERE e.crtUserGroup IN (:userGroups) ";
		
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
		
		PersonType context = new PersonType();
		
		String expectedQuery = "SELECT e FROM PersonType e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		PersonType context = new PersonType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM PersonType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
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
		
		String name = "name";
		String abbrName = "abbr name";
		PersonType context = new PersonType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM PersonType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
