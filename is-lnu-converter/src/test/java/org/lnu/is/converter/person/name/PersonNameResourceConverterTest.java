package org.lnu.is.converter.person.name;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.language.language;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.name.PersonName;
import org.lnu.is.resource.person.name.PersonNameResource;


public class PersonNameResourceConverterTest {

	private PersonNameResourceConverter unit = new PersonNameResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long languageId = 1L;
		language language = new language();
		language.setId(languageId);
		
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		String name = "name";
		String firstName = "first name";
		String fatherName = "father name";
		String surname = "surname";

		PersonNameResource source = new PersonNameResource();
		source.setFatherName(fatherName);
		source.setFirstName(firstName);
		source.setLanguageId(languageId);
		source.setName(name);
		source.setPersonId(personId);
		source.setSurname(surname);

		PersonName expected = new PersonName();
		expected.setLanguage(language);
		expected.setPerson(person);
		expected.setFirstName(firstName);
		expected.setFatherName(fatherName);
		expected.setSurname(surname);
		expected.setName(name);
		
		// When
		PersonName actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String name = "name";
		String firstName = "first name";
		String fatherName = "father name";
		String surname = "surname";
		
		PersonNameResource source = new PersonNameResource();
		source.setFatherName(fatherName);
		source.setFirstName(firstName);
		source.setName(name);
		source.setSurname(surname);
		
		PersonName expected = new PersonName();
		expected.setFirstName(firstName);
		expected.setFatherName(fatherName);
		expected.setSurname(surname);
		expected.setName(name);
		
		// When
		PersonName actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
