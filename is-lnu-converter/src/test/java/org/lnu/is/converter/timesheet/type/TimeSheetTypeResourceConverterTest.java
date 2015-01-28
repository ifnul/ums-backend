package org.lnu.is.converter.timesheet.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.timesheettype.TimeSheetType;
import org.lnu.is.resource.timesheet.type.TimeSheetTypeResource;

public class TimeSheetTypeResourceConverterTest {

	private TimeSheetTypeResourceConverter unit = new TimeSheetTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "Test string";
		String abbrName = "ts";

		TimeSheetType expected = new TimeSheetType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		TimeSheetTypeResource source = new TimeSheetTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		TimeSheetType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		TimeSheetTypeResource source = new TimeSheetTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<TimeSheetTypeResource> sources = Arrays.asList(source); 
		
		TimeSheetType expected = new TimeSheetType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<TimeSheetType> expecteds = Arrays.asList(expected);
		
		// Where
		List<TimeSheetType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
