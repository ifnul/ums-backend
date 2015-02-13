package org.lnu.is.converter.person.work;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.work.PersonWork;
import org.lnu.is.domain.specstagetype.SpecStageType;
import org.lnu.is.resource.person.work.PersonWorkResource;

public class PersonWorkResourceConverterTest {

	private PersonWorkResourceConverter unit = new PersonWorkResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long jobTypeId = 2L;
		JobType jobType = new JobType();
		jobType.setId(jobTypeId);
		
		Long specStageTypeId = 3L;
		SpecStageType specStageType = new SpecStageType();
		specStageType.setId(specStageTypeId);
		
		String organizationName = "Optigra";
		String postName = "java developer";
		String description = "Super big description";
		Date begDate = new Date();
		Date endDate = new Date();
		Long id = 6L;

		PersonWork expected = new PersonWork();
		expected.setId(id);
		expected.setPerson(person);
		expected.setJobType(jobType);
		expected.setSpecStageType(specStageType);
		expected.setOrganizationName(organizationName);
		expected.setPostName(postName);
		expected.setDescription(description);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);

		PersonWorkResource source = new PersonWorkResource();
		source.setId(id);
		source.setPersonId(personId);
		source.setJobTypeId(jobTypeId);
		source.setSpecStageTypeId(specStageTypeId);
		source.setOrganizationName(organizationName);
		source.setPostName(postName);
		source.setDescription(description);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		
		// When
		PersonWork actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonWork expected = new PersonWork();
		PersonWorkResource source = new PersonWorkResource();
		
		// When
		PersonWork actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long jobTypeId = 2L;
		JobType jobType = new JobType();
		jobType.setId(jobTypeId);
		
		Long specStageTypeId = 3L;
		SpecStageType specStageType = new SpecStageType();
		specStageType.setId(specStageTypeId);
		
		String organizationName = "Optigra";
		String postName = "java developer";
		String description = "Super big description";
		Date begDate = new Date();
		Date endDate = new Date();
		
		PersonWork expected = new PersonWork();
		expected.setPerson(person);
		expected.setJobType(jobType);
		expected.setSpecStageType(specStageType);
		expected.setOrganizationName(organizationName);
		expected.setPostName(postName);
		expected.setDescription(description);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		List<PersonWork> expecteds = Arrays.asList(expected);
		
		PersonWorkResource source = new PersonWorkResource();
		source.setPersonId(personId);
		source.setJobTypeId(jobTypeId);
		source.setSpecStageTypeId(specStageTypeId);
		source.setOrganizationName(organizationName);
		source.setPostName(postName);
		source.setDescription(description);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		List<PersonWorkResource> sources = Arrays.asList(source);
		
		// When
		List<PersonWork> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
