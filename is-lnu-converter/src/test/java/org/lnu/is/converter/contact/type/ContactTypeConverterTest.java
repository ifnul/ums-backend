package org.lnu.is.converter.contact.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.contact.type.ContactTypeConverter;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.resource.contact.type.ContactTypeResource;

public class ContactTypeConverterTest {

	private ContactTypeConverter unit = new ContactTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "AddressN";
		String abbrName = "AN";

		ContactType source = new ContactType();
		source.setName(name);
		source.setAbbrName(abbrName);

		ContactTypeResource expected = new ContactTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		ContactTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
