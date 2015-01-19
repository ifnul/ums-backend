package org.lnu.is.dao.builder.person.award;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.domain.person.PersonPaper;

public class PersonAwardQueryBuilderTest {

	private PersonAwardQueryBuilder unit = new PersonAwardQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		PersonAward context = new PersonAward();
		
		String expectedQuery = "SELECT e FROM PersonAward e WHERE e.status=:status ";
		
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

		String expectedQuery = "SELECT e FROM PersonAward e WHERE ( e.person = :person OR e.person = :person ) AND e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
