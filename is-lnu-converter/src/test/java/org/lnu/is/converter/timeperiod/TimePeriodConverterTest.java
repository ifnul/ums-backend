package org.lnu.is.converter.timeperiod;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.domain.timeperiod.TimePeriodType;
import org.lnu.is.resource.timeperiod.TimePeriodResource;

public class TimePeriodConverterTest {

	private TimePeriodConverter unit = new TimePeriodConverter();
	
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

		TimePeriod source = new TimePeriod();
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setId(id);
		source.setName(name);
		source.setNumValue(numValue);
		
		source.setParent(parent);
		source.setTimePeriodType(timePeriodType);

		TimePeriodResource expected = new TimePeriodResource();
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setId(id);
		expected.setName(name);
		expected.setNumValue(numValue);
		expected.setParentId(parentId);
		expected.setTimePeriodTypeId(timePeriodTypeId);
		
		// When
		TimePeriodResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Date begDate = new Date();
		Date endDate = new Date();
		Long id = 1L;
		String name = "name";
		Integer numValue = 1;
		
		TimePeriod source = new TimePeriod();
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setId(id);
		source.setName(name);
		source.setNumValue(numValue);
		
		TimePeriodResource expected = new TimePeriodResource();
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setId(id);
		expected.setName(name);
		expected.setNumValue(numValue);
		
		// When
		TimePeriodResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
