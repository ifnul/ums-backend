package org.lnu.is.dao.builder.sallary.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.salarytype.SallaryType;

public class SallaryTypeQueryBuilderTest {

	private SallaryTypeQueryBuilder unit = new SallaryTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "Diablo";
		
		SallaryType context = new SallaryType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT r FROM SallaryType r WHERE r.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
