package org.lnu.is.dao.builder.person.paper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.queries.Queries;

public class PersonPaperQueryBuilderTest {

	private PersonPaperQueryBuilder unit = new PersonPaperQueryBuilder();
	
	@Test
	public void test() throws Exception {
		// Given
		PersonPaper context = new PersonPaper();
		String expectedQuery = "SELECT p FROM PersonPaper p ";
		
		// When
		Queries actual = unit.build(context);
		String actualQuery = actual.getQuery();
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
