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

public class PersonWorkConverterTest {

	private PersonWorkConverter unit = new PersonWorkConverter();
	
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

		PersonWork source = new PersonWork();
		source.setId(id);
		source.setPerson(person);
		source.setJobType(jobType);
		source.setSpecStageType(specStageType);
		source.setOrganizationName(organizationName);
		source.setPostName(postName);
		source.setDescription(description);
		source.setBegDate(begDate);
		source.setEndDate(endDate);

		PersonWorkResource expected = new PersonWorkResource();
		expected.setId(id);
		expected.setPersonId(personId);
		expected.setJobTypeId(jobTypeId);
		expected.setSpecStageTypeId(specStageTypeId);
		expected.setOrganizationName(organizationName);
		expected.setPostName(postName);
		expected.setDescription(description);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		
		// When
		PersonWorkResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonWork source = new PersonWork();
		PersonWorkResource expected = new PersonWorkResource();
		
		// When
		PersonWorkResource actual = unit.convert(source);
		
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
		Long id = 6L;
		
		PersonWork source = new PersonWork();
		source.setId(id);
		source.setPerson(person);
		source.setJobType(jobType);
		source.setSpecStageType(specStageType);
		source.setOrganizationName(organizationName);
		source.setPostName(postName);
		source.setDescription(description);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		List<PersonWork> sources = Arrays.asList(source);
		
		PersonWorkResource expected = new PersonWorkResource();
		expected.setId(id);
		expected.setPersonId(personId);
		expected.setJobTypeId(jobTypeId);
		expected.setSpecStageTypeId(specStageTypeId);
		expected.setOrganizationName(organizationName);
		expected.setPostName(postName);
		expected.setDescription(description);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		List<PersonWorkResource> expecteds = Arrays.asList(expected);
		
		// When
		List<PersonWorkResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
