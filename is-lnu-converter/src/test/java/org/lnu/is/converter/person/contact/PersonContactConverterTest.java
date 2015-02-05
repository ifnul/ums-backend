package org.lnu.is.converter.person.contact;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.contact.PersonContact;
import org.lnu.is.resource.person.contact.PersonContactResource;

public class PersonContactConverterTest {

	private PersonContactConverter unit = new PersonContactConverter();
	
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
		
		PersonContact source = new PersonContact();
		source.setPerson(person);
		source.setContactType(contactType);
		source.setId(id);
		source.setValue(value);
		
		PersonContactResource expected = new PersonContactResource();
		expected.setPersonId(personId);
		expected.setContactTypeId(contactTypeId);
		expected.setId(id);
		expected.setValue(value);
		
		// When
		PersonContactResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonContact source = new PersonContact();
		PersonContactResource expected = new PersonContactResource();
		
		// When
		PersonContactResource actual = unit.convert(source);
		
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
		
		PersonContact source = new PersonContact();
		source.setPerson(person);
		source.setContactType(contactType);
		source.setId(id);
		source.setValue(value);
		
		PersonContactResource expected = new PersonContactResource();
		expected.setPersonId(personId);
		expected.setContactTypeId(contactTypeId);
		expected.setId(id);
		expected.setValue(value);
		
		PersonContact source1 = new PersonContact();
		PersonContactResource expected1 = new PersonContactResource();
		
		List<PersonContact> sources = Arrays.asList(source,source1);
		
		List<PersonContactResource> expecteds = Arrays.asList(expected,expected1);
		// When
		List<PersonContactResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
