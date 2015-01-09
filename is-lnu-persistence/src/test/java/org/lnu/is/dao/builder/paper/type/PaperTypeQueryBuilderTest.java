package org.lnu.is.dao.builder.paper.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.papertype.PaperType;

public class PaperTypeQueryBuilderTest {

	private PaperTypeQueryBuilder unit = new PaperTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "abbrname";
		PaperType context = new PaperType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT g FROM PaperType g WHERE g.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
