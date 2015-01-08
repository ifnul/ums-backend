package org.lnu.is.dao.builder.honor.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.honorstype.HonorType;

public class HonorTypeQueryBuilderTest {

	private HonorTypeQueryBuilder unit = new HonorTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "abbrname";
		HonorType context = new HonorType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT g FROM HonorType g WHERE g.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
