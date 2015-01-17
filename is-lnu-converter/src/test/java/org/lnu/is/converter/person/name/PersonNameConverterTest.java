package org.lnu.is.converter.person.name;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.language.Language;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonName;
import org.lnu.is.resource.person.name.PersonNameResource;

public class PersonNameConverterTest {

	private PersonNameConverter unit = new PersonNameConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long languageId = 1L;
		Language language = new Language();
		language.setId(languageId);
		
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		String name = "name";
		String firstName = "first name";
		String fatherName = "father name";
		String surname = "surname";

		PersonNameResource expected = new PersonNameResource();
		expected.setFatherName(fatherName);
		expected.setFirstName(firstName);
		expected.setLanguageId(languageId);
		expected.setName(name);
		expected.setPersonId(personId);
		expected.setSurname(surname);

		PersonName source = new PersonName();
		source.setLanguage(language);
		source.setPerson(person);
		source.setFirstName(firstName);
		source.setFatherName(fatherName);
		source.setSurname(surname);
		source.setName(name);

		// When
		PersonNameResource actual = unit.convert(source);

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
		
		PersonNameResource expected = new PersonNameResource();
		expected.setFatherName(fatherName);
		expected.setFirstName(firstName);
		expected.setName(name);
		expected.setSurname(surname);
		
		PersonName source = new PersonName();
		source.setFirstName(firstName);
		source.setFatherName(fatherName);
		source.setSurname(surname);
		source.setName(name);
		
		// When
		PersonNameResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
