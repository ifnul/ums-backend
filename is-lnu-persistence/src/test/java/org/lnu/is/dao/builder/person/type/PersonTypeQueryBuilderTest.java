package org.lnu.is.dao.builder.person.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.person.PersonType;

public class PersonTypeQueryBuilderTest {

	private PersonTypeQueryBuilder unit = new PersonTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
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

		String expectedQuery = "SELECT e FROM PersonType e WHERE e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
