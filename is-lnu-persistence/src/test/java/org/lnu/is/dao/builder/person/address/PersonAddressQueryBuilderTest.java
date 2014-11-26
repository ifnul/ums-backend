package org.lnu.is.dao.builder.person.address;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.PersonAddress;

public class PersonAddressQueryBuilderTest {

	private PersonAddressQueryBuilder unit = new PersonAddressQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		PersonAddress context = new PersonAddress();
		String expectedQuery = "SELECT p FROM PersonAddress p ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
