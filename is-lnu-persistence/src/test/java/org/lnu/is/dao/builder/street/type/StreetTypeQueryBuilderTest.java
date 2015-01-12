package org.lnu.is.dao.builder.street.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.streettype.StreetType;

public class StreetTypeQueryBuilderTest {

	private StreetTypeQueryBuilder unit = new StreetTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "Diablo";
		
		StreetType context = new StreetType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT r FROM StreetType r WHERE r.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
