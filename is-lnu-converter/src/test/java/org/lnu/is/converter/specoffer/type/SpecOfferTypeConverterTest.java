package org.lnu.is.converter.specoffer.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.resource.specoffer.type.SpecOfferTypeResource;

public class SpecOfferTypeConverterTest {

	private SpecOfferTypeConverter unit = new SpecOfferTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		Long id = 1L;
		Long timePeriodId = 2L;
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setId(timePeriodId);
		
		SpecOfferType source = new SpecOfferType();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setId(id);
		source.setTimePeriod(timePeriod);

		SpecOfferTypeResource expected = new SpecOfferTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setTimePeriodId(timePeriodId);
		expected.setId(id);
		
		// When
		SpecOfferTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";
		
		Long id = 1L;
		SpecOfferType source = new SpecOfferType();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setId(id);
		
		SpecOfferTypeResource expected = new SpecOfferTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		
		// When
		SpecOfferTypeResource actual = unit.convert(source);
		
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
		
		SpecOfferType source = new SpecOfferType();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setId(id);
		source.setTimePeriod(timePeriod);

		SpecOfferTypeResource expected = new SpecOfferTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setTimePeriodId(timePeriodId);
		expected.setId(id);
		
		List<SpecOfferType> sources = Arrays.asList(source); 
		
		List<SpecOfferTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<SpecOfferTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void testConvertAllWithNoRelations() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";
		
		Long id = 1L;
		SpecOfferType source = new SpecOfferType();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setId(id);
		
		SpecOfferTypeResource expected = new SpecOfferTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		
		String name1 = "first blood1";
		String abbrName1 = "fb1";
		
		Long id1 = 2L;
		SpecOfferType source1 = new SpecOfferType();
		source1.setName(name1);
		source1.setAbbrName(abbrName1);
		source1.setId(id1);
		
		SpecOfferTypeResource expected1 = new SpecOfferTypeResource();
		expected1.setName(name1);
		expected1.setAbbrName(abbrName1);
		expected1.setId(id1);

		List<SpecOfferType> sources = Arrays.asList(source,source1); 
		
		List<SpecOfferTypeResource> expecteds = Arrays.asList(expected,expected1);
		
		// Where
		List<SpecOfferTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
