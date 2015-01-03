package org.lnu.is.dao.builder.duty.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.dutytype.DutyType;

public class DutyTypeQueryBuilderTest {

	private DutyTypeQueryBuilder unit = new DutyTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "AN";

		DutyType context = new DutyType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT a FROM DutyType a WHERE a.abbrname LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
