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

public class PublicActivityConverterTest {

	private PublicActivityConverter unit = new PublicActivityConverter();
	
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

		PublicActivity source = new PublicActivity();
		source.setId(id);
		source.setName(name);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setPublicActiveType(publicActiveType);
		source.setTimePeriod(timePeriod);

		PublicActivityResource expected = new PublicActivityResource();
		expected.setId(id);
		expected.setName(name);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setPublicActiveTypeId(publicActiveTypeId);
		expected.setTimePeriodId(timePeriodId);
		
		// When
		PublicActivityResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PublicActivity source = new PublicActivity();
		PublicActivityResource expected = new PublicActivityResource();
		
		// When
		PublicActivityResource actual = unit.convert(source);
		
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
		
		PublicActivity source = new PublicActivity();
		source.setId(id);
		source.setName(name);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setPublicActiveType(publicActiveType);
		source.setTimePeriod(timePeriod);
		List<PublicActivity> sources = Arrays.asList(source);
		
		PublicActivityResource expected = new PublicActivityResource();
		expected.setId(id);
		expected.setName(name);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setPublicActiveTypeId(publicActiveTypeId);
		expected.setTimePeriodId(timePeriodId);
		List<PublicActivityResource> expecteds = Arrays.asList(expected);
		
		// When
		List<PublicActivityResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
