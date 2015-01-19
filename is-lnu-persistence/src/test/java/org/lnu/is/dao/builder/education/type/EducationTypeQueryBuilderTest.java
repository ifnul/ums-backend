package org.lnu.is.dao.builder.education.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.educationtype.EducationType;

public class EducationTypeQueryBuilderTest {

	private EducationTypeQueryBuilder unit = new EducationTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		EducationType context = new EducationType();
		
		String expected = "SELECT e FROM EducationType e WHERE e.status=:status ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		EducationType context = new EducationType();
		context.setName(name);
		context.setAbbrName(abbrName);

		String expected = "SELECT e FROM EducationType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
