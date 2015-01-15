package org.lnu.is.dao.builder.course.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.coursetype.CourseType;

public class CourseTypeQueryBuilderTest {

	private CourseTypeQueryBuilder unit = new CourseTypeQueryBuilder();
	
	@Test
	public void testname() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		CourseType context = new CourseType();
		context.setName(name);
		context.setAbbrName(abbrName);

		String expected = "SELECT a FROM CourseType a WHERE a.name LIKE CONCAT('%',:name,'%') OR a.abbrName LIKE CONCAT('%',:abbrName,'%') ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
