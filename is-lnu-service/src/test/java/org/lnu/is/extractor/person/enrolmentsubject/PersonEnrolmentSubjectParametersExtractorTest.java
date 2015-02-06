package org.lnu.is.extractor.person.enrolmentsubject;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonEnrolmentSubject;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonEnrolmentSubjectParametersExtractorTest {

	@Mock
	private Dao<Person, Long> personDao;

	@Mock
	private Dao<PersonPaper, Long> personPaperDao;

	@Mock
	private Dao<EnrolmentSubject, Long> enrolmentSubjectDao;

	@InjectMocks
	private PersonEnrolmentSubjectParametersExtractor unit;

	@Mock
	private SessionService sessionService;

	private Boolean active = true;
	private Boolean security = true;

	private String groupOne = "developers";
	private String groupTwo = "students";

	private List<String> groups = Arrays.asList(groupOne, groupTwo);

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

		Long personPaperId = 2L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);

		Long enrolmentSubjectId = 3L;
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		enrolmentSubject.setId(enrolmentSubjectId);

		Double mark = 2.33;

		PersonEnrolmentSubject entity = new PersonEnrolmentSubject();
		entity.setPerson(person);
		entity.setPersonPaper(personPaper);
		entity.setEnrolmentSubject(enrolmentSubject);
		entity.setMark(mark);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		expected.put("person", person);
		expected.put("personPaper", personPaper);
		expected.put("enrolmentSubject", enrolmentSubject);
		expected.put("mark", mark);

		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(personPaperDao.getEntityById(anyLong())).thenReturn(personPaper);
		when(enrolmentSubjectDao.getEntityById(anyLong())).thenReturn(enrolmentSubject);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao).getEntityById(personId);
		verify(personPaperDao).getEntityById(personPaperId);
		verify(enrolmentSubjectDao).getEntityById(enrolmentSubjectId);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithEmptyFields() throws Exception {
		// Given
		PersonEnrolmentSubject entity = new PersonEnrolmentSubject();

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);

		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao, times(0)).getEntityById(anyLong());
		verify(personPaperDao, times(0)).getEntityById(anyLong());
		verify(enrolmentSubjectDao, times(0)).getEntityById(anyLong());
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithEmptyFieldsAndWithoutDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);

		PersonEnrolmentSubject entity = new PersonEnrolmentSubject();
		Map<String, Object> expected = new HashMap<String, Object>();

		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao, times(0)).getEntityById(anyLong());
		verify(personPaperDao, times(0)).getEntityById(anyLong());
		verify(enrolmentSubjectDao, times(0)).getEntityById(anyLong());
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithoutSecurity() throws Exception {
		// Given
		unit.setSecurity(false);

		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);

		Long personPaperId = 2L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);

		Long enrolmentSubjectId = 3L;
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		enrolmentSubject.setId(enrolmentSubjectId);

		Double mark = 2.33;

		PersonEnrolmentSubject entity = new PersonEnrolmentSubject();
		entity.setPerson(person);
		entity.setPersonPaper(personPaper);
		entity.setEnrolmentSubject(enrolmentSubject);
		entity.setMark(mark);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("person", person);
		expected.put("personPaper", personPaper);
		expected.put("enrolmentSubject", enrolmentSubject);
		expected.put("mark", mark);

		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(personPaperDao.getEntityById(anyLong())).thenReturn(personPaper);
		when(enrolmentSubjectDao.getEntityById(anyLong())).thenReturn(enrolmentSubject);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao).getEntityById(personId);
		verify(personPaperDao).getEntityById(personPaperId);
		verify(enrolmentSubjectDao).getEntityById(enrolmentSubjectId);
		verify(sessionService, times(0)).getGroups();
		assertEquals(expected, actual);
	}
}
