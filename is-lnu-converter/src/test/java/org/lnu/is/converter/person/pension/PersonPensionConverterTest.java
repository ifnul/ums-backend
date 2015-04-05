package org.lnu.is.converter.person.pension;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.pension.type.PensionType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.pension.PersonPension;
import org.lnu.is.resource.person.pension.PersonPensionResource;

public class PersonPensionConverterTest {

	private PersonPensionConverter unit = new PersonPensionConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long contactTypeId = 3L;
		PensionType contactType = new PensionType();
		contactType.setId(contactTypeId);
		
		Date begDate = new Date();
		Date endDate = new Date();

		PersonPension source = new PersonPension();
		source.setPerson(person);
		source.setPensionType(contactType);
		source.setId(id);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		
		PersonPensionResource expected = new PersonPensionResource();
		expected.setPersonId(personId);
		expected.setPensionTypeId(contactTypeId);
		expected.setId(id);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		
		// When
		PersonPensionResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonPension source = new PersonPension();
		PersonPensionResource expected = new PersonPensionResource();
		
		// When
		PersonPensionResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long contactTypeId = 3L;
		PensionType contactType = new PensionType();
		contactType.setId(contactTypeId);
		
		Date begDate = new Date();
		Date endDate = new Date();

		PersonPension source = new PersonPension();
		source.setPerson(person);
		source.setPensionType(contactType);
		source.setId(id);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		
		PersonPensionResource expected = new PersonPensionResource();
		expected.setPersonId(personId);
		expected.setPensionTypeId(contactTypeId);
		expected.setId(id);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		
		List<PersonPension> sources = Arrays.asList(source);
		List<PersonPensionResource> expecteds = Arrays.asList(expected);

		// When
		List<PersonPensionResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
