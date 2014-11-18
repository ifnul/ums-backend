package org.lnu.is.dao.builder.persontype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.PersonType;
import org.lnu.is.queries.Queries;

public class PersonTypeQueryBuilderTest {

	private PersonTypeQueryBuilder unit = new PersonTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		PersonType context = new PersonType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT p FROM PersonType p WHERE p.name LIKE CONCAT('%',:name,'%') OR p.abbrName LIKE CONCAT('%',:abbrName,'%') ";
		
		// When
		Queries query = unit.build(context);
		String actualQuery = query.getQuery();
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
