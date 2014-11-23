package org.lnu.is.facade.converter.addresstype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.facade.resource.addresstype.AddressTypeResource;

public class AddressTypeResourceConverterTest {

	private AddressTypeResourceConverter unit = new AddressTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "AddressN";
		String abbrName = "AN";

		AddressType expected = new AddressType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		AddressTypeResource source = new AddressTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		AddressType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
