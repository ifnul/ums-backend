package org.lnu.is.dao.builder.degree.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.degree.DegreeType;

public class DegreeTypeQueryBuilderTest {

	private DegreeTypeQueryBuilder unit = new DegreeTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "AN";

		DegreeType context = new DegreeType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT a FROM DegreeType a WHERE a.abbrname LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
