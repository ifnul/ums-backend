package org.lnu.is.facade.converter.specialty.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.facade.resource.specialty.type.SpecialtyTypeResource;

public class SpecialtyTypeConverterTest {

	private SpecialtyTypeConverter unit = new SpecialtyTypeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		SpecialtyTypeResource expected = new SpecialtyTypeResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		SpecialtyType source = new SpecialtyType();
		source.setAbbrName(abbrName);
		source.setName(name);
		
		// When
		SpecialtyTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
