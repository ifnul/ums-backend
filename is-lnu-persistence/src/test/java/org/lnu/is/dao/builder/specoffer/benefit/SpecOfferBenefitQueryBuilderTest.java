package org.lnu.is.dao.builder.specoffer.benefit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecofferBenefit;

public class SpecOfferBenefitQueryBuilderTest {

	private SpecOfferBenefitQueryBuilder unit = new SpecOfferBenefitQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Benefit benefit = new Benefit();
		SpecOffer specOffer = new SpecOffer();
		SpecofferBenefit context = new SpecofferBenefit();
		context.setSpecOffer(specOffer);
		context.setBenefit(benefit);

		String expectedQuery = "SELECT s FROM SpecofferBenefit s WHERE s.specOffer = :specOffer OR s.benefit = :benefit ";
		
		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
