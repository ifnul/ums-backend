package org.lnu.is.dao.builder.person;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.Person;
import org.lnu.is.queries.Queries;

public class PersonQueryBuilderTest {

	private PersonQueryBuilder unit = new PersonQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String name = "name";
		Person context = new Person();
		context.setName(name);

		String expectedQuery = "SELECT p FROM Person p WHERE p.name LIKE CONCAT('%',:name,'%') ";
		
		// When
		Queries actual = unit.build(context);
		String actualQuery = actual.getQuery();
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
