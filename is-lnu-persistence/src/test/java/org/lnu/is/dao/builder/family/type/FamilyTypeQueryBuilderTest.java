package org.lnu.is.dao.builder.family.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.familytype.FamilyType;

public class FamilyTypeQueryBuilderTest {

	private FamilyTypeQueryBuilder unit = new FamilyTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "AN";

		FamilyType context = new FamilyType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT a FROM FamilyType a WHERE a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
