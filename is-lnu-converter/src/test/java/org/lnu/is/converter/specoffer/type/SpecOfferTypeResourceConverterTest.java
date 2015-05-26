package org.lnu.is.converter.specoffer.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.resource.specoffer.type.SpecOfferTypeResource;

public class SpecOfferTypeResourceConverterTest {

	private SpecOfferTypeResourceConverter unit = new SpecOfferTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		Long id = 1L;
		Long timePeriodId = 2L;
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setId(timePeriodId);
		
		SpecOfferType expected = new SpecOfferType();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		expected.setTimePeriod(timePeriod);

		SpecOfferTypeResource source = new SpecOfferTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setTimePeriodId(timePeriodId);
		source.setId(id);
		
		// When
		SpecOfferType actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";
		
		Long id = 1L;
		
		SpecOfferType expected = new SpecOfferType();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		
		SpecOfferTypeResource source = new SpecOfferTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setId(id);
		
		// When
		SpecOfferType actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		Long id = 1L;
		Long timePeriodId = 2L;
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setId(timePeriodId);
		
		SpecOfferType expected = new SpecOfferType();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		expected.setTimePeriod(timePeriod);

		SpecOfferTypeResource source = new SpecOfferTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setTimePeriodId(timePeriodId);
		source.setId(id);
		
		List<SpecOfferType> expecteds = Arrays.asList(expected);
		
		List<SpecOfferTypeResource> sources = Arrays.asList(source);
		// When
		List<SpecOfferType> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void testConvertAllWithNoRelations() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";
		
		Long id = 1L;
		
		SpecOfferType expected = new SpecOfferType();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		
		SpecOfferTypeResource source = new SpecOfferTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setId(id);
		
		List<SpecOfferType> expecteds = Arrays.asList(expected);
		
		List<SpecOfferTypeResource> sources = Arrays.asList(source);
		
		// When
		List<SpecOfferType> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
