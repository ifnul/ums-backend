package org.lnu.is.converter.street.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.resource.street.type.StreetTypeResource;

public class StreetTypeResourceConverterTest {

	private StreetTypeResourceConverter unit = new StreetTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		StreetType expected = new StreetType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		StreetTypeResource source = new StreetTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		StreetType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

}
