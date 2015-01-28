package org.lnu.is.converter.timeperiod;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
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
		
		
		TimePeriodResource source = new TimePeriodResource();
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setId(id);
		source.setName(name);
		source.setNumValue(numValue);
		
		// When
		TimePeriod actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
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
		
		Date begDate1 = new Date();
		Date endDate1 = new Date();
		Long id1 = 2L;
		String name1 = "name1";
		Integer numValue1 = 2;
		
		TimePeriod expected1 = new TimePeriod();
		expected1.setBegDate(begDate1);
		expected1.setEndDate(endDate1);
		expected1.setName(name1);
		expected1.setNumValue(numValue1);
		
		
		TimePeriodResource source1 = new TimePeriodResource();
		source1.setBegDate(begDate1);
		source1.setEndDate(endDate1);
		source1.setId(id1);
		source1.setName(name1);
		source1.setNumValue(numValue1);
		
		List<TimePeriodResource> sources = Arrays.asList(source,source1);
		
		List<TimePeriod> expecteds = Arrays.asList(expected,expected1);
		// When
		List<TimePeriod> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
