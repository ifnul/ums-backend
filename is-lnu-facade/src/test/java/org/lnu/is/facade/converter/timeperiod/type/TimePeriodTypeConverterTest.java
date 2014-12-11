package org.lnu.is.facade.converter.timeperiod.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.timeperiod.TimePeriodType;
import org.lnu.is.facade.resource.timeperiod.type.TimePeriodTypeResource;

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
}
