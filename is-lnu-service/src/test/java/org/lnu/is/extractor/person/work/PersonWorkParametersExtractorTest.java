package org.lnu.is.extractor.person.work;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.work.PersonWork;
import org.lnu.is.domain.specstagetype.SpecStageType;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonWorkParametersExtractorTest {

	@Mock
	private Dao<Person, Long> personDao;

	@Mock
	private Dao<JobType, Long> jobTypeDao;

	@Mock
	private Dao<SpecStageType, Long> specStageTypeDao;

	@InjectMocks
	private PersonWorkParametersExtractor unit;

	@Mock
	private SessionService sessionService;

	private Boolean active = true;
	private Boolean security = true;

	private String group1 = "developers";
	private String group2 = "students";

	private List<String> groups = Arrays.asList(group1, group2);

	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);

		when(sessionService.getGroups()).thenReturn(groups);
	}

	@Test
	public void testGetParameters() throws Exception {
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
		String description = "aladin";
		Date begDate = new Date();
		Date endDate = new Date();

		PersonWork entity = new PersonWork();
		entity.setPerson(person);
		entity.setJobType(jobType);
		entity.setSpecStageType(specStageType);
		entity.setOrganizationName(organizationName);
		entity.setPostName(postName);
		entity.setDescription(description);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("jobType", jobType);
		expected.put("specStageType", specStageType);
		expected.put("organizationName", organizationName);
		expected.put("postName", postName);
		expected.put("description", description);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);

		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(jobTypeDao.getEntityById(anyLong())).thenReturn(jobType);
		when(specStageTypeDao.getEntityById(anyLong())).thenReturn(specStageType);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao).getEntityById(personId);
		verify(jobTypeDao).getEntityById(jobTypeId);
		verify(specStageTypeDao).getEntityById(specStageTypeId);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithEmptyFields() throws Exception {
		// Given
		PersonWork entity = new PersonWork();

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);

		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao, times(0)).getEntityById(anyLong());
		verify(jobTypeDao, times(0)).getEntityById(anyLong());
		verify(specStageTypeDao, times(0)).getEntityById(anyLong());
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithEmptyFieldsAndWithoutDefaults()
			throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);

		PersonWork entity = new PersonWork();
		Map<String, Object> expected = new HashMap<String, Object>();

		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao, times(0)).getEntityById(anyLong());
		verify(jobTypeDao, times(0)).getEntityById(anyLong());
		verify(specStageTypeDao, times(0)).getEntityById(anyLong());
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParamteresWithoutSecurity() throws Exception {
		// Given
		unit.setSecurity(false);

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
		String description = "aladin";
		Date begDate = new Date();
		Date endDate = new Date();

		PersonWork entity = new PersonWork();
		entity.setPerson(person);
		entity.setJobType(jobType);
		entity.setSpecStageType(specStageType);
		entity.setOrganizationName(organizationName);
		entity.setPostName(postName);
		entity.setDescription(description);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("jobType", jobType);
		expected.put("specStageType", specStageType);
		expected.put("organizationName", organizationName);
		expected.put("postName", postName);
		expected.put("description", description);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		expected.put("status", RowStatus.ACTIVE);

		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(jobTypeDao.getEntityById(anyLong())).thenReturn(jobType);
		when(specStageTypeDao.getEntityById(anyLong())).thenReturn(specStageType);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao).getEntityById(personId);
		verify(jobTypeDao).getEntityById(jobTypeId);
		verify(specStageTypeDao).getEntityById(specStageTypeId);
		verify(sessionService, times(0)).getGroups();
		assertEquals(expected, actual);
	}
}
