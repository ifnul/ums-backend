package org.lnu.is.dao.builder.specialty.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.specialty.SpecialtyType;

public class SpecialtyTypeQueryBuilderTest {

	private SpecialtyTypeQueryBuilder unit = new SpecialtyTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "abbr name";
		SpecialtyType context = new SpecialtyType();
		context.setAbbrName(abbrName);

		String expected = "SELECT s FROM SpecialtyType s WHERE s.abbrName LIKE CONCAT('%',:abbrName,'%') ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
