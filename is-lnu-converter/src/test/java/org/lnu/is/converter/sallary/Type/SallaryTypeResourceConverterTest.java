package org.lnu.is.converter.sallary.Type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.sallary.type.SallaryTypeResourceConverter;
import org.lnu.is.domain.salarytype.SallaryType;
import org.lnu.is.resource.sallary.type.SallaryTypeResource;

public class SallaryTypeResourceConverterTest {

	private SallaryTypeResourceConverter unit = new SallaryTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		SallaryType expected = new SallaryType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		SallaryTypeResource source = new SallaryTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		SallaryType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

}
