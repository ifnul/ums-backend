package org.lnu.is.facade.converter.specialty.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.resource.specialty.type.SpecialtyTypeResource;

public class SpecialtyTypeResourceConverterTest {

	private SpecialtyTypeResourceConverter unit = new SpecialtyTypeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		SpecialtyTypeResource source = new SpecialtyTypeResource();
		source.setAbbrName(abbrName);
		source.setName(name);

		SpecialtyType expected = new SpecialtyType();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		// When
		SpecialtyType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
