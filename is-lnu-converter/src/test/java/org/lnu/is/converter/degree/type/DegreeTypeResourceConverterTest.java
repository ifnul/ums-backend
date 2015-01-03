package org.lnu.is.converter.degree.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.degree.DegreeType;
import org.lnu.is.resource.degree.type.DegreeTypeResource;

public class DegreeTypeResourceConverterTest {

	private DegreeTypeResourceConverter unit = new DegreeTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "DegreeN";
		String abbrName = "AN";

		DegreeType expected = new DegreeType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		DegreeTypeResource source = new DegreeTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		DegreeType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
