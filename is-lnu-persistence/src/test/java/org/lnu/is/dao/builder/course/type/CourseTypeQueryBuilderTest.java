package org.lnu.is.dao.builder.course.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.coursetype.CourseType;
import org.lnu.is.pagination.MultiplePagedSearch;

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
		MultiplePagedSearch<CourseType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstaint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		CourseType context = new CourseType();
		
		String expected = "SELECT e FROM CourseType e WHERE e.status=:status ";
		MultiplePagedSearch<CourseType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusCOnstsint() throws Exception {
		// Given
		unit.setActive(false);
		
		CourseType context = new CourseType();
		
		String expected = "SELECT e FROM CourseType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<CourseType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		CourseType context = new CourseType();
		
		String expected = "SELECT e FROM CourseType e ";
		MultiplePagedSearch<CourseType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
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
		MultiplePagedSearch<CourseType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDEfaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "abbr name";
		String name = "name";
		CourseType context = new CourseType();
		context.setName(name);
		context.setAbbrName(abbrName);
		
		String expected = "SELECT e FROM CourseType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<CourseType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
