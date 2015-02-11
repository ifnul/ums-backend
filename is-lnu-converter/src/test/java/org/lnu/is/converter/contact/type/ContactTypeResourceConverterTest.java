package org.lnu.is.converter.contact.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.resource.contact.type.ContactTypeResource;

public class ContactTypeResourceConverterTest {

	private ContactTypeResourceConverter unit = new ContactTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "ContactN";
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
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		ContactTypeResource source = new ContactTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<ContactTypeResource> sources = Arrays.asList(source); 
		
		ContactType expected = new ContactType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<ContactType> expecteds = Arrays.asList(expected);
		
		// Where
		List<ContactType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
