package org.lnu.is.dao.builder.education.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.educationtype.EducationType;

public class EducationTypeQueryBuilderTest {

	private EducationTypeQueryBuilder unit = new EducationTypeQueryBuilder();
	
	@Test
	public void testname() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		EducationType context = new EducationType();
		context.setName(name);
		context.setAbbrName(abbrName);

		String expected = "SELECT a FROM EducationType a WHERE a.name LIKE CONCAT('%',:name,'%') OR a.abbrName LIKE CONCAT('%',:abbrName,'%') ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
