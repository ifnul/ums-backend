package org.lnu.is.dao.builder.person.name;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.PersonName;

public class PersonNameQueryBuilderTest {

	private PersonNameQueryBuilder unit = new PersonNameQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		PersonName context = new PersonName();

		String expected = "SELECT p FROM PersonName p ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
