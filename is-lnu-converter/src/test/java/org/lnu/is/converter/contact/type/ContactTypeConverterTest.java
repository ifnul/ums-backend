package org.lnu.is.converter.contact.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		ContactType source = new ContactType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<ContactType> sources = Arrays.asList(source); 
		
		ContactTypeResource expected = new ContactTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<ContactTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<ContactTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
