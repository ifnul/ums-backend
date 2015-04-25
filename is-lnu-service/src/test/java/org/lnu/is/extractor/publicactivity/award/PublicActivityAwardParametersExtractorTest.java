package org.lnu.is.extractor.publicactivity.award;

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
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.publicactivity.PublicActivity;
import org.lnu.is.domain.publicactivity.PublicActivityAward;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PublicActivityAwardParametersExtractorTest {

	@Mock
	private Dao<PublicActivity, PublicActivity, Long> publicActivityDao;

	@Mock
	private Dao<EnrolmentSubject, EnrolmentSubject, Long> enrolmentSubjectDao;
	
	@Mock
	private SessionService sessionService;
	
	@InjectMocks
	private PublicActivityAwardParametersExtractor unit;

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
		Long publicActivityId = 1L;
		PublicActivity publicActivity = new PublicActivity();
		publicActivity.setId(publicActivityId);
		
		Long enrolmentSubjectId = 2L;
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		enrolmentSubject.setId(enrolmentSubjectId);
		
		String awardname = "award name";
		Double bonus = 45.1;
		Date begDate = new Date();
		Date endDate = new Date();

		PublicActivityAward entity = new PublicActivityAward();
		entity.setPublicActivity(publicActivity);
		entity.setEnrolmentSubject(enrolmentSubject);
		entity.setAwardName(awardname);
		entity.setBonus(bonus);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("publicActivity", publicActivity);
		expected.put("enrolmentSubject", enrolmentSubject);
		expected.put("awardName", awardname);
		expected.put("begDate", begDate);
		expected.put("endDate", begDate);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(publicActivityDao.getEntityById(anyLong())).thenReturn(publicActivity);
		when(enrolmentSubjectDao.getEntityById(anyLong())).thenReturn(enrolmentSubject);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long publicActivityId = 1L;
		PublicActivity publicActivity = new PublicActivity();
		publicActivity.setId(publicActivityId);
		
		Long enrolmentSubjectId = 2L;
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		enrolmentSubject.setId(enrolmentSubjectId);
		
		String awardname = "award name";
		Double bonus = 45.1;
		Date begDate = new Date();
		Date endDate = new Date();

		PublicActivityAward entity = new PublicActivityAward();
		entity.setPublicActivity(publicActivity);
		entity.setEnrolmentSubject(enrolmentSubject);
		entity.setAwardName(awardname);
		entity.setBonus(bonus);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("publicActivity", publicActivity);
		expected.put("enrolmentSubject", enrolmentSubject);
		expected.put("awardName", awardname);
		expected.put("begDate", begDate);
		expected.put("endDate", begDate);
		
		// When
		when(publicActivityDao.getEntityById(anyLong())).thenReturn(publicActivity);
		when(enrolmentSubjectDao.getEntityById(anyLong())).thenReturn(enrolmentSubject);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		PublicActivityAward entity = new PublicActivityAward();
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
		
		PublicActivityAward entity = new PublicActivityAward();
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
		
		PublicActivityAward entity = new PublicActivityAward();
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
		
		PublicActivityAward entity = new PublicActivityAward();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}