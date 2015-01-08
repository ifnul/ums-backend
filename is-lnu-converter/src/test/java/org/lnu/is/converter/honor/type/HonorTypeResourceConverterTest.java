package org.lnu.is.converter.honor.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.honorstype.HonorType;
import org.lnu.is.resource.honor.type.HonorTypeResource;

public class HonorTypeResourceConverterTest {

	private HonorTypeResourceConverter unit = new HonorTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		HonorType expected = new HonorType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		HonorTypeResource source = new HonorTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		HonorType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

}
