package org.lnu.is.dao.builder.contact.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.contacttype.ContactType;

public class ContactTypeQueryBuilderTest {

	private ContactTypeQueryBuilder unit = new ContactTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "AN";

		ContactType context = new ContactType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT a FROM ContactType a WHERE a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
