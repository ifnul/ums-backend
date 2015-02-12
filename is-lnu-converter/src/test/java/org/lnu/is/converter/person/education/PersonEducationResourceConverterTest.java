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

public class PersonEducationResourceConverterTest {

	private PersonEducationResourceConverter unit = new PersonEducationResourceConverter();
	
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

		PersonEducation expected = new PersonEducation();
		expected.setPerson(person);
		expected.setEducationType(educationType);
		expected.setPersonPaper(personPaper);
		expected.setId(id);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);

		PersonEducationResource source = new PersonEducationResource();
		source.setPersonId(personId);
		source.setEducationTypeId(educationTypeId);
		source.setPersonPaperId(personPaperId);
		source.setId(id);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		
		// When
		PersonEducation actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonEducation expected = new PersonEducation();
		PersonEducationResource source = new PersonEducationResource();
		
		// When
		PersonEducation actual = unit.convert(source);
		
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
		
		PersonEducation expected = new PersonEducation();
		expected.setPerson(person);
		expected.setEducationType(educationType);
		expected.setPersonPaper(personPaper);
		expected.setId(id);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		List<PersonEducation> expecteds = Arrays.asList(expected);
		
		PersonEducationResource source = new PersonEducationResource();
		source.setPersonId(personId);
		source.setEducationTypeId(educationTypeId);
		source.setPersonPaperId(personPaperId);
		source.setId(id);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		List<PersonEducationResource> sources = Arrays.asList(source);
		
		// When
		List<PersonEducation> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
