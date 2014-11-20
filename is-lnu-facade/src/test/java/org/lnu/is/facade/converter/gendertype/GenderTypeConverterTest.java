package org.lnu.is.facade.converter.gendertype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.facade.resource.gendertype.GenderTypeResource;

public class GenderTypeConverterTest {

	private GenderTypeConverter unit = new GenderTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		GenderType source = new GenderType();
		source.setName(name);
		source.setAbbrName(abbrName);

		GenderTypeResource expected = new GenderTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		GenderTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
