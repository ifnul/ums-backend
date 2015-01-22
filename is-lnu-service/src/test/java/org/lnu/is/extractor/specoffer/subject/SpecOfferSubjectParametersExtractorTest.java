package org.lnu.is.extractor.specoffer.subject;

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
import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferSubjectParametersExtractorTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private Dao<SpecOffer, Long> specOfferDao;
	
	@Mock
	private Dao<EnrolmentSubject, Long> enrolmenntSubjectDao;
	
	@InjectMocks
	private SpecOfferSubjectParametersExtractor unit;

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
		Long specOfferId = 1L;
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(specOfferId);
		
		Long enrolmentSubjectId = 2L;
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		enrolmentSubject.setId(enrolmentSubjectId);

		Boolean isMajor = false;
		Boolean alternative = true;
		
		SpecofferSubject entity = new SpecofferSubject();
		entity.setSpecOffer(specOffer);
		entity.setEnrolmentSubject(enrolmentSubject);
		entity.setIsMajor(isMajor);
		entity.setAlternative(alternative);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("specOffer", specOffer);
		expected.put("enrolmentSubject", enrolmentSubject);
		expected.put("isMajor", isMajor);
		expected.put("alternative", alternative);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
		when(enrolmenntSubjectDao.getEntityById(anyLong())).thenReturn(enrolmentSubject);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(specOfferDao).getEntityById(specOfferId);
		verify(enrolmenntSubjectDao).getEntityById(enrolmentSubjectId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDisabledDefauts() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long specOfferId = 1L;
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(specOfferId);
		
		Long enrolmentSubjectId = 2L;
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		enrolmentSubject.setId(enrolmentSubjectId);
		
		Boolean isMajor = false;
		Boolean alternative = true;
		
		SpecofferSubject entity = new SpecofferSubject();
		entity.setSpecOffer(specOffer);
		entity.setEnrolmentSubject(enrolmentSubject);
		entity.setIsMajor(isMajor);
		entity.setAlternative(alternative);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("specOffer", specOffer);
		expected.put("enrolmentSubject", enrolmentSubject);
		expected.put("isMajor", isMajor);
		expected.put("alternative", alternative);
		
		// When
		when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
		when(enrolmenntSubjectDao.getEntityById(anyLong())).thenReturn(enrolmentSubject);
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(specOfferDao).getEntityById(specOfferId);
		verify(enrolmenntSubjectDao).getEntityById(enrolmentSubjectId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		SpecofferSubject entity = new SpecofferSubject();

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
		
		SpecofferSubject entity = new SpecofferSubject();
		
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
		
		SpecofferSubject entity = new SpecofferSubject();
		
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
		
		SpecofferSubject entity = new SpecofferSubject();
		
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
