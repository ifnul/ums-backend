package org.lnu.is.facade.converter.timeperiod.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.timeperiod.TimePeriodType;
import org.lnu.is.facade.resource.timeperiod.type.TimePeriodTypeResource;

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
}
