package org.lnu.is.dao.builder.course.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.coursetype.CourseType;

public class CourseTypeQueryBuilderTest {

	private CourseTypeQueryBuilder unit = new CourseTypeQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}
	

	@Test
	public void testBuild() throws Exception {
		// Given
		CourseType context = new CourseType();
		
		String expected = "SELECT e FROM CourseType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
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
		CourseType context = new CourseType();
		context.setName(name);
		context.setAbbrName(abbrName);

		String expected = "SELECT e FROM CourseType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
