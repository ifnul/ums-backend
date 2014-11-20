package org.lnu.is.dao.builder.gendertype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.queries.Queries;

public class GenderTypeQueryBuilderTest {

	private GenderTypeQueryBuilder unit = new GenderTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "abbrname";
		GenderType context = new GenderType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT g FROM GenderType g WHERE g.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		Queries actual = unit.build(context);
		String actualQuery = actual.getQuery();

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
