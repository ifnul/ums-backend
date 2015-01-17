package org.lnu.is.converter.specoffer.benefit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.specoffer.SpecofferBenefit;
import org.lnu.is.resource.specoffer.benefit.SpecOfferBenefitResource;

public class SpecOfferBenefitConverterTest {

	private SpecOfferBenefitConverter unit = new SpecOfferBenefitConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		SpecofferBenefit source = new SpecofferBenefit();
		SpecOfferBenefitResource expected = new SpecOfferBenefitResource();
		
		// When
		SpecOfferBenefitResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
