package org.lnu.is.extractor.specoffer.subject;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferSubjectParametersExtractorTest {

	@Mock
	private Dao<SpecOffer, Long> specOfferDao;
	
	@Mock
	private Dao<EnrolmentSubject, Long> enrolmenntSubjectDao;
	
	@InjectMocks
	private SpecOfferSubjectParametersExtractor unit;
	
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
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
