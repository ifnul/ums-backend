package org.lnu.is.converter.specoffer.benefit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferBenefit;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.resource.specoffer.benefit.SpecOfferBenefitResource;
import org.lnu.is.resource.timeperiod.TimePeriodResource;

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
		
		SpecOfferBenefit source = new SpecOfferBenefit();
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
		
		SpecOfferBenefit source = new SpecOfferBenefit();
		
		// When
		SpecOfferBenefitResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
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
		
		SpecOfferBenefit source = new SpecOfferBenefit();
		source.setBenefit(benefit);
		source.setSpecOffer(specOffer);
		
		SpecOfferBenefitResource expected1 = new SpecOfferBenefitResource();
		
		SpecOfferBenefit source1 = new SpecOfferBenefit();
		
		List<SpecOfferBenefit> sources = Arrays.asList(source,source1);
		
		List<SpecOfferBenefitResource> expecteds = Arrays.asList(expected,expected1);
		
		// When
		List<SpecOfferBenefitResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
