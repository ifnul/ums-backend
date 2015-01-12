package org.lnu.is.dao.builder.timesheet.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.timesheettype.TimeSheetType;

public class TimesheetTypeQueryBuilderTest {

	private TimesheetTypeQueryBuilder unit = new TimesheetTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "TestString";
		
		TimeSheetType context = new TimeSheetType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT r FROM TimeSheetType r WHERE r.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
