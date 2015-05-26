package org.lnu.is.converter.timesheet.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.timesheet.type.TimeSheetType;
import org.lnu.is.resource.timesheet.type.TimeSheetTypeResource;

public class TimeSheetTypeConverterTest {

	private TimeSheetTypeConverter unit = new TimeSheetTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "Test string";
		String abbrName = "ts";

		
		TimeSheetType source = new TimeSheetType();
		source.setName(name);
		source.setAbbrName(abbrName);

		TimeSheetTypeResource expected = new TimeSheetTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		TimeSheetTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		TimeSheetType source = new TimeSheetType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<TimeSheetType> sources = Arrays.asList(source); 
		
		TimeSheetTypeResource expected = new TimeSheetTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<TimeSheetTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<TimeSheetTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
