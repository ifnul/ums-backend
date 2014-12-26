package org.lnu.is.converter.specoffer.benefit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.specoffer.benefit.SpecOfferBenefitConverter;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecofferBenefit;
import org.lnu.is.resource.specoffer.benefit.SpecOfferBenefitResource;

public class SpecOfferBenefitConverterTest {

	private SpecOfferBenefitConverter unit = new SpecOfferBenefitConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long specOfferId = 1L;
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(specOfferId);
		
		Long benefitId = 2L;
		Benefit benefit = new Benefit();
		benefit.setId(benefitId);
		
		SpecofferBenefit source = new SpecofferBenefit();
		source.setSpecOffer(specOffer);
		source.setBenefit(benefit);

		SpecOfferBenefitResource expected = new SpecOfferBenefitResource();
		expected.setBenefitId(benefitId);
		expected.setSpecOfferId(specOfferId);
		
		// When
		SpecOfferBenefitResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
