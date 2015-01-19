package org.lnu.is.extractor.specoffer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferParametersExtractorTest {

	@Mock
	private Dao<SpecOffer, Long> specOfferDao;
	
	@Mock
	private Dao<Specialty, Long> specialtyDao;
	
	@Mock
	private Dao<Department, Long> departmentDao;
	
	@Mock
	private Dao<TimePeriod, Long> timePeriodDao;
	
	@Mock
	private Dao<EduFormType, Long> eduFormTypeDao;
	
	@Mock
	private Dao<SpecOfferType, Long> specOfferTypeDao;
	
	@InjectMocks
	private SpecOfferParametersExtractor unit;
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		Long eduFormTypeId = 3L;
		EduFormType eduFormType = new EduFormType();
		eduFormType.setId(eduFormTypeId);
		
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
		entity.setEduFormType(eduFormType);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("eduFormType", eduFormType);
		expected.put("department", department);
		expected.put("begDate", begDate);
		expected.put("docNum", docNum);
		expected.put("docSeries", docSeries);
		expected.put("status", RowStatus.ACTIVE);
		// When
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(eduFormTypeDao.getEntityById(anyLong())).thenReturn(eduFormType);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(departmentDao).getEntityById(departmentId);
		verify(eduFormTypeDao).getEntityById(eduFormTypeId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		SpecOffer entity = new SpecOffer();

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
