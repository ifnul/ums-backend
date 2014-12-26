package org.lnu.is.converter.gendertype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.gendertype.GenderTypeResourceConverter;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.resource.gendertype.GenderTypeResource;

public class GenderTypeResourceConverterTest {

	private GenderTypeResourceConverter unit = new GenderTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		GenderType expected = new GenderType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		GenderTypeResource source = new GenderTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		GenderType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

}
