package org.lnu.is.converter.person.contact;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.contact.PersonContact;
import org.lnu.is.resource.person.contact.PersonContactResource;

public class PersonContactResourceConverterTest {

	private PersonContactResourceConverter unit = new PersonContactResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String value = "sfas";
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long contactTypeId = 3L;
		ContactType contactType = new ContactType();
		contactType.setId(contactTypeId);
		
		PersonContact expected = new PersonContact();
		expected.setPerson(person);
		expected.setContactType(contactType);
		expected.setValue(value);
		
		PersonContactResource source = new PersonContactResource();
		source.setPersonId(personId);
		source.setContactTypeId(contactTypeId);
		source.setId(id);
		source.setValue(value);
		
		// When
		PersonContact actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonContact expected = new PersonContact();
		PersonContactResource source = new PersonContactResource();

		// When
		PersonContact actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1L;
		String value = "sfas";
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long contactTypeId = 3L;
		ContactType contactType = new ContactType();
		contactType.setId(contactTypeId);
		
		PersonContact expected = new PersonContact();
		expected.setPerson(person);
		expected.setContactType(contactType);
		expected.setValue(value);
		
		PersonContactResource source = new PersonContactResource();
		source.setPersonId(personId);
		source.setContactTypeId(contactTypeId);
		source.setId(id);
		source.setValue(value);
		
		PersonContact expected1 = new PersonContact();
		PersonContactResource source1 = new PersonContactResource();

		List<PersonContactResource> sources = Arrays.asList(source,source1);
		
		List<PersonContact> expecteds = Arrays.asList(expected,expected1);
		// When
		List<PersonContact> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
