package org.lnu.is.converter.sallary.Type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.sallary.type.SallaryTypeConverter;
import org.lnu.is.domain.salarytype.SallaryType;
import org.lnu.is.resource.sallary.type.SallaryTypeResource;

public class SallaryTypeConverterTest {

	private SallaryTypeConverter unit = new SallaryTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		
		SallaryType source = new SallaryType();
		source.setName(name);
		source.setAbbrName(abbrName);

		SallaryTypeResource expected = new SallaryTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		SallaryTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
