package org.lnu.is.extractor.specoffer;

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
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferParametersExtractorTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private Dao<SpecOffer, SpecOffer, Long> specOfferDao;
	
	@Mock
	private Dao<Specialty, Specialty, Long> specialtyDao;
	
	@Mock
	private Dao<Department, Department, Long> departmentDao;
	
	@Mock
	private Dao<TimePeriod, TimePeriod, Long> timePeriodDao;
	
	@Mock
	private Dao<EducationFormType, EducationFormType, Long> eduFormTypeDao;
	
	@Mock
	private Dao<SpecOfferType, SpecOfferType, Long> specOfferTypeDao;
	
	@InjectMocks
	private SpecOfferParametersExtractor unit;

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
		Long educationFormTypeId = 3L;
		EducationFormType eduFormType = new EducationFormType();
		eduFormType.setId(educationFormTypeId);
		
		Long departmentId = 2L;
		Department department = new Department();
		department.setId(departmentId);
		
		Date begDate = new Date();
		String docNum = "doc num";
		String docSeries = "doc series";
		String duration = "213";

		SpecOffer entity = new SpecOffer();
		entity.setBegDate(begDate);
		entity.setDepartment(department);
		entity.setDocNum(docNum);
		entity.setDocSeries(docSeries);
		entity.setEducationFormType(eduFormType);
		entity.setDuration(duration);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("educationFormType", eduFormType);
		expected.put("department", department);
		expected.put("begDate", begDate);
		expected.put("docNum", docNum);
		expected.put("docSeries", docSeries);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		expected.put("duration", duration);
		
		// When
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(eduFormTypeDao.getEntityById(anyLong())).thenReturn(eduFormType);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(departmentDao).getEntityById(departmentId);
		verify(eduFormTypeDao).getEntityById(educationFormTypeId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long educationFormTypeId = 3L;
		EducationFormType eduFormType = new EducationFormType();
		eduFormType.setId(educationFormTypeId);
		
		Long departmentId = 2L;
		Department department = new Department();
		department.setId(departmentId);
		
		Date begDate = new Date();
		String docNum = "doc num";
		String docSeries = "doc series";
		
		SpecOffer entity = new SpecOffer();
		entity.setBegDate(begDate);
		entity.setDepartment(department);
		entity.setDocNum(docNum);
		entity.setDocSeries(docSeries);
		entity.setEducationFormType(eduFormType);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("educationFormType", eduFormType);
		expected.put("department", department);
		expected.put("begDate", begDate);
		expected.put("docNum", docNum);
		expected.put("docSeries", docSeries);
		
		// When
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(eduFormTypeDao.getEntityById(anyLong())).thenReturn(eduFormType);
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(departmentDao).getEntityById(departmentId);
		verify(eduFormTypeDao).getEntityById(educationFormTypeId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		SpecOffer entity = new SpecOffer();

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
		
		SpecOffer entity = new SpecOffer();
		
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
		
		SpecOffer entity = new SpecOffer();
		
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
		
		SpecOffer entity = new SpecOffer();
		
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
