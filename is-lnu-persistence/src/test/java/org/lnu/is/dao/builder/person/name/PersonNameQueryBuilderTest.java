package org.lnu.is.dao.builder.person.name;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.language.Language;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonName;

public class PersonNameQueryBuilderTest {

	private PersonNameQueryBuilder unit = new PersonNameQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		PersonName context = new PersonName();

		String expected = "SELECT e FROM PersonName e ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Person person = new Person();
		Language language = new Language();
		String name = "fdsfds";
		String firstName = "fdsfds";
		String fatherName = "rewrtewt";
		String surname = "cvdfgfdh";
		
		PersonName context = new PersonName();
		context.setPerson(person);
		context.setLanguage(language);
		context.setName(name);
		context.setFirstName(firstName);
		context.setFatherName(fatherName);
		context.setSurname(surname);
		
		String expected = "SELECT e FROM PersonName e WHERE e.person = :person OR .language = :languageOR e.name LIKE CONCAT('%',:name,'%') OR e.firstName LIKE CONCAT('%',:name,'%') OR e.fatherName LIKE CONCAT('%',:fatherName,'%') OR e.surname LIKE CONCAT('%',:surname,'%') ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
