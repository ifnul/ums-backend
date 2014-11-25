package org.lnu.is.dao.builder.person.award;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.queries.Queries;

public class PersonAwardQueryBuilderTest {

	private PersonAwardQueryBuilder unit = new PersonAwardQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Person person = new Person();
		PersonAward context = new PersonAward();
		context.setPerson(person);

		String expectedQuery = "SELECT p FROM PersonAward p WHERE p.person = :person ";
		
		// When
		Queries actual = unit.build(context);
		String actualQuery = actual.getQuery();
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
