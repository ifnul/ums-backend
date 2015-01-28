package org.lnu.is.converter.specoffer.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.resource.specoffer.type.SpecOfferTypeResource;

public class SpecOfferTypeConverterTest {

	private SpecOfferTypeConverter unit = new SpecOfferTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		Long id = 1L;
		Long specialtyTypeId = 2L;
		SpecialtyType specialType = new SpecialtyType();
		specialType.setId(specialtyTypeId);
		
		SpecOfferType source = new SpecOfferType();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setId(id);
		source.setSpecialtyType(specialType);

		SpecOfferTypeResource expected = new SpecOfferTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setSpecialtyTypeId(specialtyTypeId);
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
		Long specialtyTypeId = 2L;
		SpecialtyType specialType = new SpecialtyType();
		specialType.setId(specialtyTypeId);
		
		SpecOfferType source = new SpecOfferType();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setId(id);
		source.setSpecialtyType(specialType);

		SpecOfferTypeResource expected = new SpecOfferTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setSpecialtyTypeId(specialtyTypeId);
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

		List<SpecOfferType> sources = Arrays.asList(source); 
		
		List<SpecOfferTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<SpecOfferTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
