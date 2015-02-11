package org.lnu.is.converter.timeperiod.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.timeperiod.TimePeriodType;
import org.lnu.is.resource.timeperiod.type.TimePeriodTypeResource;

public class TimePeriodTypeConverterTest {

	private TimePeriodTypeConverter unit = new TimePeriodTypeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1l;
		String name = "name";
		String abbrName = "abbr name";
		TimePeriodType source = new TimePeriodType();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setId(id);

		TimePeriodTypeResource expected = new TimePeriodTypeResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setId(id);
		
		// When
		TimePeriodTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		TimePeriodType source = new TimePeriodType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<TimePeriodType> sources = Arrays.asList(source); 
		
		TimePeriodTypeResource expected = new TimePeriodTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<TimePeriodTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<TimePeriodTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
