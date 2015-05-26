package org.lnu.is.converter.timeperiod.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.timeperiod.TimePeriodType;
import org.lnu.is.resource.timeperiod.type.TimePeriodTypeResource;

public class TimePeriodTypeResourceConverterTest {

	private TimePeriodTypeResourceConverter unit = new TimePeriodTypeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1l;
		String name = "name";
		String abbrName = "abbr name";
		TimePeriodType expected = new TimePeriodType();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		TimePeriodTypeResource source = new TimePeriodTypeResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setId(id);
		
		// When
		TimePeriodType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		TimePeriodTypeResource source = new TimePeriodTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<TimePeriodTypeResource> sources = Arrays.asList(source); 
		
		TimePeriodType expected = new TimePeriodType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<TimePeriodType> expecteds = Arrays.asList(expected);
		
		// Where
		List<TimePeriodType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
