package org.lnu.is.facade.converter.contact.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.resource.contact.type.ContactTypeResource;

public class ContactTypeResourceConverterTest {

	private ContactTypeResourceConverter unit = new ContactTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "AddressN";
		String abbrName = "AN";

		ContactType expected = new ContactType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		ContactTypeResource source = new ContactTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		ContactType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
