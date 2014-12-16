package org.lnu.is.dao.builder.reason;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.reason.Reason;

public class ReasonQueryBuilderTest {

	private ReasonQueryBuilder unit = new ReasonQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "Diablo";
		
		Reason context = new Reason();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT r FROM Reason r WHERE r.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
