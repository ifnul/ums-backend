package org.lnu.is.converter.street.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.resource.street.type.StreetTypeResource;

public class StreetTypeConverterTest {

	private StreetTypeConverter unit = new StreetTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		
		StreetType source = new StreetType();
		source.setName(name);
		source.setAbbrName(abbrName);

		StreetTypeResource expected = new StreetTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		StreetTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
