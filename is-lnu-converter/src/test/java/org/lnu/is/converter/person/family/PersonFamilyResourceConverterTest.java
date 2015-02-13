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

public class PersonFamilyResourceConverterTest {
	
	private PersonFamilyResourceConverter unit = new PersonFamilyResourceConverter();
	
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

		PersonFamily expected = new PersonFamily();
		expected.setPerson(person);
		expected.setFamilyType(familyType);
		expected.setId(id);
		expected.setName(name);
		expected.setBirthDate(birthdate);
		
		PersonFamilyResource source = new PersonFamilyResource();
		source.setPersonId(personId);
		source.setFamilyTypeId(familyTypeId);
		source.setId(id);
		source.setName(name);
		source.setBirthDate(birthdate);
		
		// When
		PersonFamily actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonFamily expected = new PersonFamily();
		PersonFamilyResource source = new PersonFamilyResource();
		
		// When
		PersonFamily actual = unit.convert(source);
		
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
		
		PersonFamily expected = new PersonFamily();
		expected.setPerson(person);
		expected.setFamilyType(familyType);
		expected.setId(id);
		expected.setName(name);
		expected.setBirthDate(birthdate);
		List<PersonFamily> expecteds = Arrays.asList(expected);
		
		PersonFamilyResource source = new PersonFamilyResource();
		source.setPersonId(personId);
		source.setFamilyTypeId(familyTypeId);
		source.setId(id);
		source.setName(name);
		source.setBirthDate(birthdate);
		List<PersonFamilyResource> sources = Arrays.asList(source);
		
		// When
		List<PersonFamily> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
