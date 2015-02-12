package org.lnu.is.converter.person.education;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.educationtype.EducationType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.education.PersonEducation;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.resource.person.education.PersonEducationResource;

public class PersonEducationConverterTest {

	private PersonEducationConverter unit = new PersonEducationConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long educationTypeId = 3L;
		EducationType educationType = new EducationType();
		educationType.setId(educationTypeId);
		
		Long personPaperId = 4L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);
		
		Long id = 1L;
		Date begDate = new Date();
		Date endDate = new Date();

		PersonEducation source = new PersonEducation();
		source.setPerson(person);
		source.setEducationType(educationType);
		source.setPersonPaper(personPaper);
		source.setId(id);
		source.setBegDate(begDate);
		source.setEndDate(endDate);

		PersonEducationResource expected = new PersonEducationResource();
		expected.setPersonId(personId);
		expected.setEducationTypeId(educationTypeId);
		expected.setPersonPaperId(personPaperId);
		expected.setId(id);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		
		// When
		PersonEducationResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonEducation source = new PersonEducation();
		PersonEducationResource expected = new PersonEducationResource();
		
		// When
		PersonEducationResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long educationTypeId = 3L;
		EducationType educationType = new EducationType();
		educationType.setId(educationTypeId);
		
		Long personPaperId = 4L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);
		
		Long id = 1L;
		Date begDate = new Date();
		Date endDate = new Date();
		
		PersonEducation source = new PersonEducation();
		source.setPerson(person);
		source.setEducationType(educationType);
		source.setPersonPaper(personPaper);
		source.setId(id);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		List<PersonEducation> sources = Arrays.asList(source);
		
		PersonEducationResource expected = new PersonEducationResource();
		expected.setPersonId(personId);
		expected.setEducationTypeId(educationTypeId);
		expected.setPersonPaperId(personPaperId);
		expected.setId(id);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		List<PersonEducationResource> expecteds = Arrays.asList(expected);
		
		// When
		List<PersonEducationResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
