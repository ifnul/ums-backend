package org.lnu.is.dao.builder.person.paper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.PersonPaper;

public class PersonPaperQueryBuilderTest {

	private PersonPaperQueryBuilder unit = new PersonPaperQueryBuilder();
	
	@Test
	public void test() throws Exception {
		// Given
		PersonPaper context = new PersonPaper();
		String expectedQuery = "SELECT p FROM PersonPaper p ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
