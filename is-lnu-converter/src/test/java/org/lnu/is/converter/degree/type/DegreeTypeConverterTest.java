package org.lnu.is.converter.degree.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.degree.DegreeType;
import org.lnu.is.resource.degree.type.DegreeTypeResource;

public class DegreeTypeConverterTest {

	private DegreeTypeConverter unit = new DegreeTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "DegreeN";
		String abbrName = "AN";

		DegreeType source = new DegreeType();
		source.setName(name);
		source.setAbbrName(abbrName);

		DegreeTypeResource expected = new DegreeTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		DegreeTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
