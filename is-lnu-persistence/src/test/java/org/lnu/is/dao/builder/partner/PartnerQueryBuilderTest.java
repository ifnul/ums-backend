package org.lnu.is.dao.builder.partner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.partner.Partner;

public class PartnerQueryBuilderTest {

	private PartnerQueryBuilder unit = new PartnerQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "abbr name";
		Partner context = new Partner();
		context.setAbbrName(abbrName);

		String expected = "SELECT p FROM Partner p WHERE p.abbrName LIKE CONCAT('%',:abbrName,'%') ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
