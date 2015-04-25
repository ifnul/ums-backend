package org.lnu.is.extractor.enrolment.enrolment.subject;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
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
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.enrolment.subject.EnrolmentEnrolmentSubject;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.enrolment.subject.PersonEnrolmentSubject;
import org.lnu.is.extractor.enrolment.enrolment.subject.EnrolmentEnrolmentSubjectParametersExtractor;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EnrolmentEnrolmentSubjectParametersExtractorTest {

    @Mock
    private Dao<EnrolmentSubject, EnrolmentSubject, Long> enrolmentSubjectDao;
    
    @Mock
    private Dao<Enrolment, Enrolment, Long> enrolmentDao;
    
    @Mock
    private Dao<PersonEnrolmentSubject, PersonEnrolmentSubject, Long> personEnrolmentSubjectDao;

    @InjectMocks
    private EnrolmentEnrolmentSubjectParametersExtractor unit;

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
	Long enrolmentSubjectId = 1L;
	EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
	enrolmentSubject.setId(enrolmentSubjectId);

	Long enrolmentId = 2L;
	Enrolment enrolment = new Enrolment();
	enrolment.setId(enrolmentId);

	Long personEnrolmentSubjectId = 3L;
	PersonEnrolmentSubject personEnrolmentSubject = new PersonEnrolmentSubject();
	personEnrolmentSubject.setId(personEnrolmentSubjectId);
	
	Double mark = 4d;
	
	EnrolmentEnrolmentSubject entity = new EnrolmentEnrolmentSubject();
	entity.setEnrolment(enrolment);
	entity.setEnrolmentSubject(enrolmentSubject);
	entity.setPersonEnrolmentSubject(personEnrolmentSubject);
	entity.setMark(mark);
	
	
	Map<String, Object> expected = new HashMap<String, Object>();
	expected.put("enrolmentSubject", enrolmentSubject);
	expected.put("enrolment", enrolment);
	expected.put("personEnrolmentSubject", personEnrolmentSubject);
	expected.put("mark", mark);
	expected.put("status", RowStatus.ACTIVE);
	expected.put("userGroups", groups);

	// When
	when(enrolmentSubjectDao.getEntityById(anyLong())).thenReturn(enrolmentSubject);
	when(enrolmentDao.getEntityById(anyLong())).thenReturn(enrolment);
	when(personEnrolmentSubjectDao.getEntityById(anyLong())).thenReturn(personEnrolmentSubject);
	Map<String, Object> actual = unit.getParameters(entity);

	// Then
	verify(enrolmentSubjectDao).getEntityById(enrolmentSubjectId);
	verify(enrolmentDao).getEntityById(enrolmentId);
	verify(personEnrolmentSubjectDao).getEntityById(personEnrolmentSubjectId);
	assertEquals(expected, actual);
    }

    @Test
    public void testGetParametersWithDisabledDefaults() throws Exception {
	// Given
	unit.setActive(false);
	unit.setSecurity(false);

	Long enrolmentSubjectId = 1L;
	EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
	enrolmentSubject.setId(enrolmentSubjectId);

	Long enrolmentId = 2L;
	Enrolment enrolment = new Enrolment();
	enrolment.setId(enrolmentId);

	Long personEnrolmentSubjectId = 3L;
	PersonEnrolmentSubject personEnrolmentSubject = new PersonEnrolmentSubject();
	personEnrolmentSubject.setId(personEnrolmentSubjectId);
	
	Double mark = 4d;
	
	EnrolmentEnrolmentSubject entity = new EnrolmentEnrolmentSubject();
	entity.setEnrolment(enrolment);
	entity.setEnrolmentSubject(enrolmentSubject);
	entity.setPersonEnrolmentSubject(personEnrolmentSubject);
	entity.setMark(mark);
	
	
	Map<String, Object> expected = new HashMap<String, Object>();
	expected.put("enrolmentSubject", enrolmentSubject);
	expected.put("enrolment", enrolment);
	expected.put("personEnrolmentSubject", personEnrolmentSubject);
	expected.put("mark", mark);

	// When
	when(enrolmentSubjectDao.getEntityById(anyLong())).thenReturn(enrolmentSubject);
	when(enrolmentDao.getEntityById(anyLong())).thenReturn(enrolment);
	when(personEnrolmentSubjectDao.getEntityById(anyLong())).thenReturn(personEnrolmentSubject);
	Map<String, Object> actual = unit.getParameters(entity);

	// Then
	verify(enrolmentSubjectDao).getEntityById(enrolmentSubjectId);
	verify(enrolmentDao).getEntityById(enrolmentId);
	verify(personEnrolmentSubjectDao).getEntityById(personEnrolmentSubjectId);
	assertEquals(expected, actual);
    }

    @Test
    public void testGetParametersWithDefaultEntity() throws Exception {
	// Given
	EnrolmentEnrolmentSubject entity = new EnrolmentEnrolmentSubject();
	Map<String, Object> expected = new HashMap<String, Object>();
	expected.put("status", RowStatus.ACTIVE);
	expected.put("userGroups", groups);

	// When
	Map<String, Object> actual = unit.getParameters(entity);

	// Then
	assertEquals(expected, actual);
    }

    @Test
    public void testGetParametersWithDefaultEntityAndDisabledSecurity()
	    throws Exception {
	// Given
	unit.setSecurity(false);

	EnrolmentEnrolmentSubject entity = new EnrolmentEnrolmentSubject();
	Map<String, Object> expected = new HashMap<String, Object>();
	expected.put("status", RowStatus.ACTIVE);

	// When
	Map<String, Object> actual = unit.getParameters(entity);

	// Then
	assertEquals(expected, actual);
    }

    @Test
    public void testGetParametersWithDefaultEntityAndDIsabledStatus()
	    throws Exception {
	// Given
	unit.setActive(false);

	EnrolmentEnrolmentSubject entity = new EnrolmentEnrolmentSubject();
	Map<String, Object> expected = new HashMap<String, Object>();
	expected.put("userGroups", groups);

	// When
	Map<String, Object> actual = unit.getParameters(entity);

	// Then
	assertEquals(expected, actual);
    }

    @Test
    public void testGetParametersWithDefaultEntityAndDisabledDefaults()
	    throws Exception {
	// Given
	unit.setActive(false);
	unit.setSecurity(false);

	EnrolmentEnrolmentSubject entity = new EnrolmentEnrolmentSubject();
	Map<String, Object> expected = new HashMap<String, Object>();

	// When
	Map<String, Object> actual = unit.getParameters(entity);

	// Then
	assertEquals(expected, actual);
    }
}
