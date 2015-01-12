package org.lnu.is.converter.timesheet.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.timesheettype.TimeSheetType;
import org.lnu.is.resource.timesheet.type.TimesheetTypeResource;

public class TimesheetTypeConverterTest {

	private TimesheetTypeConverter unit = new TimesheetTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "Test string";
		String abbrName = "ts";

		
		TimeSheetType source = new TimeSheetType();
		source.setName(name);
		source.setAbbrName(abbrName);

		TimesheetTypeResource expected = new TimesheetTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		TimesheetTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
