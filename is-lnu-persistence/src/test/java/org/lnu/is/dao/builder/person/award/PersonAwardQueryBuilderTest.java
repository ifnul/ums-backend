package org.lnu.is.dao.builder.person.award;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.domain.person.PersonPaper;

public class PersonAwardQueryBuilderTest {

	private PersonAwardQueryBuilder unit = new PersonAwardQueryBuilder();
	
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
		PersonAward context = new PersonAward();
		
		String expectedQuery = "SELECT e FROM PersonAward e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		PersonAward context = new PersonAward();
		
		String expectedQuery = "SELECT e FROM PersonAward e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		PersonAward context = new PersonAward();
		
		String expectedQuery = "SELECT e FROM PersonAward e WHERE e.crtUserGroup IN (:userGroups) ";
		
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
		
		PersonAward context = new PersonAward();
		
		String expectedQuery = "SELECT e FROM PersonAward e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		PersonPaper personPaper = new PersonPaper();
		Person person = new Person();
		PersonAward context = new PersonAward();
		context.setPerson(person);
		context.setPersonPaper(personPaper);

		String expectedQuery = "SELECT e FROM PersonAward e WHERE ( e.person = :person OR e.person = :person ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		PersonPaper personPaper = new PersonPaper();
		Person person = new Person();
		PersonAward context = new PersonAward();
		context.setPerson(person);
		context.setPersonPaper(personPaper);
		
		String expectedQuery = "SELECT e FROM PersonAward e WHERE ( e.person = :person OR e.person = :person ) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
