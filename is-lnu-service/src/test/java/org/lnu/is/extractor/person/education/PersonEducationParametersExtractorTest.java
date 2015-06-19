package org.lnu.is.extractor.person.education;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
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
import org.lnu.is.domain.education.type.EducationType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.education.PersonEducation;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonEducationParametersExtractorTest {

	@Mock
	private SessionService sessionService;

	@Mock
	private Dao<Person, Person, Long> personDao;

	@Mock
	private Dao<EducationType, EducationType, Long> educationTypeDao;
	
	@Mock
	private Dao<PersonPaper, PersonPaper, Long> personPaperDao;
	
	@InjectMocks
	private PersonEducationParametersExtractor unit;

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
		
		Long educationTypeId = 2L;
		EducationType educationType = new EducationType();
		educationType.setId(educationTypeId);
		
		Long personPaperId = 3L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);
		
		Date begDate = new Date();
		Date endDate = new Date();

		PersonEducation entity = new PersonEducation();
		entity.setPerson(person);
		entity.setEducationType(educationType);
		entity.setPersonPaper(personPaper);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("educationType", educationType);
		expected.put("personPaper", personPaper);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(educationTypeDao.getEntityById(anyLong())).thenReturn(educationType);
		when(personPaperDao.getEntityById(anyLong())).thenReturn(personPaper);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long educationTypeId = 2L;
		EducationType educationType = new EducationType();
		educationType.setId(educationTypeId);
		
		Long personPaperId = 3L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);
		
		Date begDate = new Date();
		Date endDate = new Date();

		PersonEducation entity = new PersonEducation();
		entity.setPerson(person);
		entity.setEducationType(educationType);
		entity.setPersonPaper(personPaper);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("educationType", educationType);
		expected.put("personPaper", personPaper);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		
		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(educationTypeDao.getEntityById(anyLong())).thenReturn(educationType);
		when(personPaperDao.getEntityById(anyLong())).thenReturn(personPaper);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		PersonEducation entity = new PersonEducation();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledSecurity() throws Exception {
		// Given
		unit.setSecurity(false);
		
		PersonEducation entity = new PersonEducation();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDIsabledStatus() throws Exception {
		// Given
		unit.setActive(false);
		
		PersonEducation entity = new PersonEducation();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		PersonEducation entity = new PersonEducation();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}