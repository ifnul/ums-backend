package org.lnu.is.converter.specoffer.benefit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecofferBenefit;
import org.lnu.is.resource.specoffer.benefit.SpecOfferBenefitResource;

public class SpecOfferBenefitConverterTest {

	private SpecOfferBenefitConverter unit = new SpecOfferBenefitConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long specOfferId = 2L;
		Long benefitId = 1L;
		SpecOfferBenefitResource expected = new SpecOfferBenefitResource();
		expected.setBenefitId(benefitId);
		expected.setSpecOfferId(specOfferId);

		Benefit benefit = new Benefit();
		benefit.setId(benefitId);
		
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(specOfferId);
		
		SpecofferBenefit source = new SpecofferBenefit();
		source.setBenefit(benefit);
		source.setSpecOffer(specOffer);
		
		// When
		SpecOfferBenefitResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		SpecOfferBenefitResource expected = new SpecOfferBenefitResource();
		
		SpecofferBenefit source = new SpecofferBenefit();
		
		// When
		SpecOfferBenefitResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
