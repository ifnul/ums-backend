package org.lnu.is.extractor.enrolment;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
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
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.type.EnrolmentType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EnrolmentParametersExtractorTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private Dao<Person, Long> personDao;

	@Mock
	private Dao<SpecOffer, Long> specOfferDao;

	@Mock
	private Dao<Department, Long> departmentDao;

	@Mock
	private Dao<PersonPaper, Long> personPaperDao;

	@Mock
	private Dao<EnrolmentType, Long> enrolmentTypeDao;

	@Mock
	private Dao<Enrolment, Long> enrolmentDao;

	@InjectMocks
	private EnrolmentParametersExtractor unit;

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
		String docNum = "1213344";

		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long specOfferId = 2L;
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(specOfferId);
		
		Long personPaperId = 3L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);
		
		Long enrolmentTypeId = 4L;
		EnrolmentType enrolmentType = new EnrolmentType();
		enrolmentType.setId(enrolmentTypeId);
		
		Long parentId = 5L;
		Enrolment parent = new Enrolment();
		parent.setId(parentId);
		
		Long departmentId = 6L;
		Department department = new Department();
		department.setId(departmentId);
		
		Double mark = 2.1;
		String docSeries = "doc series";
		String docText = "doc text";
		Integer isState = 1;
		Integer isHostel = 2;
		Integer isPrivilege = 3;
		Date evDate = new Date();
		Date begDate = new Date();
		Date endDate = new Date();
		Integer isEducationState = 1;
		Integer isInterview = 11;
		Integer isOriginal = 1;
		
		Enrolment entity = new Enrolment();
		entity.setPerson(person);
		entity.setSpecOffer(specOffer);
		entity.setDepartment(department);
		entity.setPersonPaper(personPaper);
		entity.setEnrolmentType(enrolmentType);
		entity.setParent(parent);
		entity.setIsEducationState(isEducationState);
		entity.setIsInterview(isInterview);
		entity.setIsOriginal(isOriginal);
		
		entity.setMark(mark);
		entity.setDocSeries(docSeries);
		entity.setDocNum(docNum);
		entity.setDocText(docText);
		entity.setIsState(isState);
		entity.setIsHostel(isHostel);
		entity.setIsPrivilege(isPrivilege);
		entity.setEvDate(evDate);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("specOffer", specOffer);
		expected.put("department", department);
		expected.put("personPaper", personPaper);
		expected.put("enrolmentType", enrolmentType);
		expected.put("parent", parent);
		expected.put("mark", mark);
		expected.put("docSeries", docSeries);
		expected.put("docNum", docNum);
		expected.put("docText", docText);
		expected.put("isState", isState);
		expected.put("isHostel", isHostel);
		expected.put("isPrivilege", isPrivilege);
		expected.put("evDate", evDate);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		expected.put("isEducationState", isEducationState);
		expected.put("isInterview", isInterview);
		expected.put("isOriginal", isOriginal);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(personPaperDao.getEntityById(anyLong())).thenReturn(personPaper);
		when(enrolmentTypeDao.getEntityById(anyLong())).thenReturn(enrolmentType);
		when(enrolmentDao.getEntityById(anyLong())).thenReturn(parent);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao).getEntityById(anyLong());
		verify(specOfferDao).getEntityById(specOfferId);
		verify(departmentDao).getEntityById(departmentId);
		verify(personPaperDao).getEntityById(personPaperId);
		verify(enrolmentTypeDao).getEntityById(enrolmentTypeId);
		verify(enrolmentDao).getEntityById(parentId);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String docNum = "1213344";
		
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long specOfferId = 2L;
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(specOfferId);
		
		Long personPaperId = 3L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);
		
		Long enrolmentTypeId = 4L;
		EnrolmentType enrolmentType = new EnrolmentType();
		enrolmentType.setId(enrolmentTypeId);
		
		Long parentId = 5L;
		Enrolment parent = new Enrolment();
		parent.setId(parentId);
		
		Long departmentId = 6L;
		Department department = new Department();
		department.setId(departmentId);
		
		Double mark = 2.1;
		String docSeries = "doc series";
		String docText = "doc text";
		Integer isState = 1;
		Integer isHostel = 2;
		Integer isPrivilege = 3;
		Date evDate = new Date();
		Date begDate = new Date();
		Date endDate = new Date();
		
		Enrolment entity = new Enrolment();
		entity.setPerson(person);
		entity.setSpecOffer(specOffer);
		entity.setDepartment(department);
		entity.setPersonPaper(personPaper);
		entity.setEnrolmentType(enrolmentType);
		entity.setParent(parent);
		
		entity.setMark(mark);
		entity.setDocSeries(docSeries);
		entity.setDocNum(docNum);
		entity.setDocText(docText);
		entity.setIsState(isState);
		entity.setIsHostel(isHostel);
		entity.setIsPrivilege(isPrivilege);
		entity.setEvDate(evDate);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("specOffer", specOffer);
		expected.put("department", department);
		expected.put("personPaper", personPaper);
		expected.put("enrolmentType", enrolmentType);
		expected.put("parent", parent);
		expected.put("mark", mark);
		expected.put("docSeries", docSeries);
		expected.put("docNum", docNum);
		expected.put("docText", docText);
		expected.put("isState", isState);
		expected.put("isHostel", isHostel);
		expected.put("isPrivilege", isPrivilege);
		expected.put("evDate", evDate);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		
		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(personPaperDao.getEntityById(anyLong())).thenReturn(personPaper);
		when(enrolmentTypeDao.getEntityById(anyLong())).thenReturn(enrolmentType);
		when(enrolmentDao.getEntityById(anyLong())).thenReturn(parent);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(personDao).getEntityById(anyLong());
		verify(specOfferDao).getEntityById(specOfferId);
		verify(departmentDao).getEntityById(departmentId);
		verify(personPaperDao).getEntityById(personPaperId);
		verify(enrolmentTypeDao).getEntityById(enrolmentTypeId);
		verify(enrolmentDao).getEntityById(parentId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		Enrolment entity = new Enrolment();
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
		Enrolment entity = new Enrolment();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledStatus() throws Exception {
		// Given
		unit.setActive(false);
		Enrolment entity = new Enrolment();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledDEfaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Enrolment entity = new Enrolment();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}

