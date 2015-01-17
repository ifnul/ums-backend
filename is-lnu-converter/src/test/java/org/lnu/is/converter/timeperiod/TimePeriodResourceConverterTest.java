package org.lnu.is.converter.timeperiod;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.domain.timeperiod.TimePeriodType;
import org.lnu.is.resource.timeperiod.TimePeriodResource;

public class TimePeriodResourceConverterTest {

	private TimePeriodResourceConverter unit = new TimePeriodResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long parentId = 2L;
		TimePeriod parent = new TimePeriod();
		parent.setId(parentId);
		
		Long timePeriodTypeId = 3L;
		TimePeriodType timePeriodType = new TimePeriodType();
		timePeriodType.setId(timePeriodTypeId);
		
		Date begDate = new Date();
		Date endDate = new Date();
		Long id = 1L;
		String name = "name";
		Integer numValue = 1;

		TimePeriod expected = new TimePeriod();
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setName(name);
		expected.setNumValue(numValue);
		
		expected.setParent(parent);
		expected.setTimePeriodType(timePeriodType);

		TimePeriodResource source = new TimePeriodResource();
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setId(id);
		source.setName(name);
		source.setNumValue(numValue);
		source.setParentId(parentId);
		source.setTimePeriodTypeId(timePeriodTypeId);
		
		// When
		TimePeriod actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
