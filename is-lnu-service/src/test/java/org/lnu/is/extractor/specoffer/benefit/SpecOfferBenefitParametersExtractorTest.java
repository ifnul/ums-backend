package org.lnu.is.extractor.specoffer.benefit;

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
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferBenefit;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferBenefitParametersExtractorTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private Dao<SpecOffer, SpecOffer, Long> specOfferDao;

	@Mock
	private Dao<Benefit, Benefit, Long> benefitDao;
	
	@InjectMocks
	private SpecOfferBenefitParametersExtractor unit;

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
		
		Long benefitId = 2L;
		Benefit benefit = new Benefit();
		benefit.setId(benefitId);
		
		SpecOfferBenefit entity = new SpecOfferBenefit();
		entity.setSpecOffer(specOffer);
		entity.setBenefit(benefit);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("specOffer", specOffer);
		expected.put("benefit", benefit);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
		when(benefitDao.getEntityById(anyLong())).thenReturn(benefit);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(specOfferDao).getEntityById(specOfferId);
		verify(benefitDao).getEntityById(benefitId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long specOfferId = 1L;
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(specOfferId);
		
		Long benefitId = 2L;
		Benefit benefit = new Benefit();
		benefit.setId(benefitId);
		
		SpecOfferBenefit entity = new SpecOfferBenefit();
		entity.setSpecOffer(specOffer);
		entity.setBenefit(benefit);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("specOffer", specOffer);
		expected.put("benefit", benefit);
		
		// When
		when(specOfferDao.getEntityById(anyLong())).thenReturn(specOffer);
		when(benefitDao.getEntityById(anyLong())).thenReturn(benefit);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(specOfferDao).getEntityById(specOfferId);
		verify(benefitDao).getEntityById(benefitId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		SpecOfferBenefit entity = new SpecOfferBenefit();
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
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
		
		SpecOfferBenefit entity = new SpecOfferBenefit();
		
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledStatus() throws Exception {
		// Given
		unit.setActive(false);
		
		SpecOfferBenefit entity = new SpecOfferBenefit();
		
		Map<String, Object> expected = new HashMap<String, Object>();
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
		
		SpecOfferBenefit entity = new SpecOfferBenefit();
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
