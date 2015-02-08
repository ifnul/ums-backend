package org.lnu.is.extractor.enrolment.status;

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
import org.lnu.is.domain.enrolment.status.EnrolmentStatus;
import org.lnu.is.domain.enrolment.statustype.EnrolmentStatusType;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class EnrolmentStatusParametersExtractorTest {

	@Mock
	private SessionService sessionService;

	@Mock
	private Dao<Enrolment, Long> enrolmentDao;

	@Mock
	private Dao<SpecOfferWave, Long> specOfferWaveDao;

	@Mock
	private Dao<EnrolmentStatusType, Long> enrolmentStatusTypeDao;
	
	@InjectMocks
	private EnrolmentStatusParametersExtractor unit;

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
		Long enrolmentId = 1L;
		Enrolment enrolment = new Enrolment();
		enrolment.setId(enrolmentId);
		
		Long specOfferWaveId = 2L;
		SpecOfferWave specOfferWave = new SpecOfferWave();
		specOfferWave.setId(specOfferWaveId);
		
		Long enrolmentStatusTypeId = 3L;
		EnrolmentStatusType enrolmentStatusType = new EnrolmentStatusType();
		enrolmentStatusType.setId(enrolmentStatusTypeId);
		
		EnrolmentStatus entity = new EnrolmentStatus();
		entity.setEnrolment(enrolment);
		entity.setSpecOfferWave(specOfferWave);
		entity.setEnrolmentStatusType(enrolmentStatusType);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("enrolment", enrolment);
		expected.put("specOfferWave", specOfferWave);
		expected.put("enrolmentStatusType", enrolmentStatusType);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(enrolmentDao.getEntityById(anyLong())).thenReturn(enrolment);
		when(specOfferWaveDao.getEntityById(anyLong())).thenReturn(specOfferWave);
		when(enrolmentStatusTypeDao.getEntityById(anyLong())).thenReturn(enrolmentStatusType);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(enrolmentDao).getEntityById(enrolmentId);
		verify(specOfferWaveDao).getEntityById(specOfferWaveId);
		verify(enrolmentStatusTypeDao).getEntityById(enrolmentStatusTypeId);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long enrolmentId = 1L;
		Enrolment enrolment = new Enrolment();
		enrolment.setId(enrolmentId);
		
		Long specOfferWaveId = 2L;
		SpecOfferWave specOfferWave = new SpecOfferWave();
		specOfferWave.setId(specOfferWaveId);
		
		Long enrolmentStatusTypeId = 3L;
		EnrolmentStatusType enrolmentStatusType = new EnrolmentStatusType();
		enrolmentStatusType.setId(enrolmentStatusTypeId);
		
		EnrolmentStatus entity = new EnrolmentStatus();
		entity.setEnrolment(enrolment);
		entity.setSpecOfferWave(specOfferWave);
		entity.setEnrolmentStatusType(enrolmentStatusType);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("enrolment", enrolment);
		expected.put("specOfferWave", specOfferWave);
		expected.put("enrolmentStatusType", enrolmentStatusType);
		
		// When
		when(enrolmentDao.getEntityById(anyLong())).thenReturn(enrolment);
		when(specOfferWaveDao.getEntityById(anyLong())).thenReturn(specOfferWave);
		when(enrolmentStatusTypeDao.getEntityById(anyLong())).thenReturn(enrolmentStatusType);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(enrolmentDao).getEntityById(enrolmentId);
		verify(specOfferWaveDao).getEntityById(specOfferWaveId);
		verify(enrolmentStatusTypeDao).getEntityById(enrolmentStatusTypeId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		EnrolmentStatus entity = new EnrolmentStatus();
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
		EnrolmentStatus entity = new EnrolmentStatus();
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
		EnrolmentStatus entity = new EnrolmentStatus();
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
		
		EnrolmentStatus entity = new EnrolmentStatus();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
