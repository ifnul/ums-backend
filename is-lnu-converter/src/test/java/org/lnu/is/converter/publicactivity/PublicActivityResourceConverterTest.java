package org.lnu.is.converter.publicactivity;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.publicactivity.PublicActivity;
import org.lnu.is.domain.publicactivity.PublicActivityType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.resource.publicactivity.PublicActivityResource;

public class PublicActivityResourceConverterTest {

	private PublicActivityResourceConverter unit = new PublicActivityResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		Date begDate = new Date();
		Date endDate = new Date();

		Long publicActiveTypeId = 2L;
		PublicActivityType publicActiveType = new PublicActivityType();
		publicActiveType.setId(publicActiveTypeId);
		
		Long timePeriodId = 3L;
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setId(timePeriodId);

		PublicActivity expected = new PublicActivity();
		expected.setId(id);
		expected.setName(name);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setPublicActivityType(publicActiveType);
		expected.setTimePeriod(timePeriod);

		PublicActivityResource source = new PublicActivityResource();
		source.setId(id);
		source.setName(name);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setPublicActivityTypeId(publicActiveTypeId);
		source.setTimePeriodId(timePeriodId);
		
		// When
		PublicActivity actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PublicActivity expected = new PublicActivity();
		PublicActivityResource source = new PublicActivityResource();
		
		// When
		PublicActivity actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		Date begDate = new Date();
		Date endDate = new Date();
		
		Long publicActiveTypeId = 2L;
		PublicActivityType publicActiveType = new PublicActivityType();
		publicActiveType.setId(publicActiveTypeId);
		
		Long timePeriodId = 3L;
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setId(timePeriodId);
		
		PublicActivity expected = new PublicActivity();
		expected.setId(id);
		expected.setName(name);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setPublicActivityType(publicActiveType);
		expected.setTimePeriod(timePeriod);
		List<PublicActivity> expecteds = Arrays.asList(expected);
		
		PublicActivityResource source = new PublicActivityResource();
		source.setId(id);
		source.setName(name);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setPublicActivityTypeId(publicActiveTypeId);
		source.setTimePeriodId(timePeriodId);
		List<PublicActivityResource> sources = Arrays.asList(source);
		
		// When
		List<PublicActivity> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
