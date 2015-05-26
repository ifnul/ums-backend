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

public class PersonPensionResourceConverterTest {

	private PersonPensionResourceConverter unit = new PersonPensionResourceConverter();
	
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

		PersonPension expected = new PersonPension();
		expected.setPerson(person);
		expected.setPensionType(contactType);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		
		PersonPensionResource source = new PersonPensionResource();
		source.setPersonId(personId);
		source.setPensionTypeId(contactTypeId);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setId(id);
		
		// When
		PersonPension actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonPension expected = new PersonPension();
		PersonPensionResource source = new PersonPensionResource();

		// When
		PersonPension actual = unit.convert(source);
		
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

		PersonPension expected = new PersonPension();
		expected.setPerson(person);
		expected.setPensionType(contactType);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		
		PersonPensionResource source = new PersonPensionResource();
		source.setPersonId(personId);
		source.setPensionTypeId(contactTypeId);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setId(id);

		List<PersonPensionResource> sources = Arrays.asList(source);
		
		List<PersonPension> expecteds = Arrays.asList(expected);
		
		// When
		List<PersonPension> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
