package org.lnu.is.facade.converter.addresstype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.facade.resource.addresstype.AddressTypeResource;

public class AddressTypeConverterTest {

	private AddressTypeConverter unit = new AddressTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "AddressN";
		String abbrName = "AN";

		AddressType source = new AddressType();
		source.setName(name);
		source.setAbbrName(abbrName);

		AddressTypeResource expected = new AddressTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		AddressTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
