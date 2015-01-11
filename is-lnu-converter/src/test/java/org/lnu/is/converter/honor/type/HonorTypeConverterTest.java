package org.lnu.is.converter.honor.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.honorstype.HonorType;
import org.lnu.is.resource.honor.type.HonorTypeResource;

public class HonorTypeConverterTest {

	private HonorTypeConverter unit = new HonorTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		HonorType source = new HonorType();
		source.setName(name);
		source.setAbbrName(abbrName);

		HonorTypeResource expected = new HonorTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		HonorTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
