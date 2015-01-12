package org.lnu.is.converter.timesheet.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.timesheettype.TimeSheetType;
import org.lnu.is.resource.timesheet.type.TimesheetTypeResource;

public class TimesheetTypeResourceConverterTest {

	private TimesheetTypeResourceConverter unit = new TimesheetTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "Test string";
		String abbrName = "ts";

		TimeSheetType expected = new TimeSheetType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		TimesheetTypeResource source = new TimesheetTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		TimeSheetType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

}
