package org.lnu.is.converter.marriedtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.marriedtype.MarriedTypeConverter;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.resource.marriedtype.MarriedTypeResource;

public class MarriedTypeConverterTest {
	
	private MarriedTypeConverter unit = new MarriedTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "ConvertItPlease";
		String abbrName = "CIP";

		MarriedType source = new MarriedType();
		source.setAbbrName(abbrName);
		source.setName(name);

		MarriedTypeResource expected = new MarriedTypeResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		// When
		MarriedTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

}
