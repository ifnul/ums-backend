package org.lnu.is.extractor.specoffer.benefit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecofferBenefit;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferBenefitParametersExtractorTest {

	@Mock
	private Dao<SpecOffer, Long> specOfferDao;

	@Mock
	private Dao<Benefit, Long> benefitDao;
	
	@InjectMocks
	private SpecOfferBenefitParametersExtractor unit;
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		Long specOfferId = 1L;
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(specOfferId);
		
		Long benefitId = 2L;
		Benefit benefit = new Benefit();
		benefit.setId(benefitId);
		
		SpecofferBenefit entity = new SpecofferBenefit();
		entity.setSpecOffer(specOffer);
		entity.setBenefit(benefit);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("specOffer", specOffer);
		expected.put("benefit", benefit);
		
		// When
		when(specOfferDao.findById(anyLong())).thenReturn(specOffer);
		when(benefitDao.findById(anyLong())).thenReturn(benefit);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(specOfferDao).findById(specOfferId);
		verify(benefitDao).findById(benefitId);
		assertEquals(expected, actual);
	}
}
