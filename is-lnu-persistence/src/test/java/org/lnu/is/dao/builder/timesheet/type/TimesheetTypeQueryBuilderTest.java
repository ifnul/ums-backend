package org.lnu.is.dao.builder.timesheet.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.timesheettype.TimeSheetType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class TimesheetTypeQueryBuilderTest {

	private TimeSheetTypeQueryBuilder unit = new TimeSheetTypeQueryBuilder();
	
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
		TimeSheetType context = new TimeSheetType();
		
		String expectedQuery = "SELECT e FROM TimeSheetType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<TimeSheetType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		TimeSheetType context = new TimeSheetType();
		
		String expectedQuery = "SELECT e FROM TimeSheetType e ";
		MultiplePagedSearch<TimeSheetType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		TimeSheetType context = new TimeSheetType();
		
		String expectedQuery = "SELECT e FROM TimeSheetType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<TimeSheetType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		TimeSheetType context = new TimeSheetType();
		
		String expectedQuery = "SELECT e FROM TimeSheetType e WHERE e.status=:status ";
		MultiplePagedSearch<TimeSheetType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "TestString";
		String name = "fsdds";
		
		TimeSheetType context = new TimeSheetType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM TimeSheetType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<TimeSheetType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParametersAndWithourDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "TestString";
		String name = "fsdds";
		
		TimeSheetType context = new TimeSheetType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM TimeSheetType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<TimeSheetType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
