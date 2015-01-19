package org.lnu.is.dao.builder.contact.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.contacttype.ContactType;

public class ContactTypeQueryBuilderTest {

	private ContactTypeQueryBuilder unit = new ContactTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		ContactType context = new ContactType();

		String expectedQuery = "SELECT e FROM ContactType e ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "AN";
		String name = "fsdfds";
		
		ContactType context = new ContactType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM ContactType e WHERE e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
