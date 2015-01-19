package org.lnu.is.dao.builder.gendertype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.gendertype.GenderType;

public class GenderTypeQueryBuilderTest {

	private GenderTypeQueryBuilder unit = new GenderTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		GenderType context = new GenderType();
		
		String expectedQuery = "SELECT e FROM GenderType e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbrname";
		GenderType context = new GenderType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT e FROM GenderType e WHERE e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
