package org.lnu.is.converter.specoffer.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.resource.specoffer.type.SpecOfferTypeResource;

public class SpecOfferTypeResourceConverterTest {

	private SpecOfferTypeResourceConverter unit = new SpecOfferTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		Long id = 1L;
		Long specialtyTypeId = 2L;
		SpecialtyType specialType = new SpecialtyType();
		specialType.setId(specialtyTypeId);
		
		SpecOfferType expected = new SpecOfferType();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		expected.setSpecialtyType(specialType);

		SpecOfferTypeResource source = new SpecOfferTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setSpecialtyTypeId(specialtyTypeId);
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
}
