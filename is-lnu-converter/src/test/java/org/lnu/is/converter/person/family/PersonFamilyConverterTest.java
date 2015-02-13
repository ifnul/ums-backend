package org.lnu.is.converter.person.family;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.familytype.FamilyType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.family.PersonFamily;
import org.lnu.is.resource.person.family.PersonFamilyResource;

public class PersonFamilyConverterTest {
	
	private PersonFamilyConverter unit = new PersonFamilyConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long familyTypeId = 3L;
		FamilyType familyType = new FamilyType();
		familyType.setId(familyTypeId);
		
		Long id = 1L;
		String name = "name";
		Date birthdate = new Date();

		PersonFamily source = new PersonFamily();
		source.setPerson(person);
		source.setFamilyType(familyType);
		source.setId(id);
		source.setName(name);
		source.setBirthDate(birthdate);
		
		PersonFamilyResource expected = new PersonFamilyResource();
		expected.setPersonId(personId);
		expected.setFamilyTypeId(familyTypeId);
		expected.setId(id);
		expected.setName(name);
		expected.setBirthDate(birthdate);
		
		// When
		PersonFamilyResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonFamily source = new PersonFamily();
		PersonFamilyResource expected = new PersonFamilyResource();
		
		// When
		PersonFamilyResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long familyTypeId = 3L;
		FamilyType familyType = new FamilyType();
		familyType.setId(familyTypeId);
		
		Long id = 1L;
		String name = "name";
		Date birthdate = new Date();
		
		PersonFamily source = new PersonFamily();
		source.setPerson(person);
		source.setFamilyType(familyType);
		source.setId(id);
		source.setName(name);
		source.setBirthDate(birthdate);
		List<PersonFamily> sources = Arrays.asList(source);
		
		PersonFamilyResource expected = new PersonFamilyResource();
		expected.setPersonId(personId);
		expected.setFamilyTypeId(familyTypeId);
		expected.setId(id);
		expected.setName(name);
		expected.setBirthDate(birthdate);
		List<PersonFamilyResource> expecteds = Arrays.asList(expected);
		
		// When
		List<PersonFamilyResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
