package org.lnu.is.dao.builder.specoffer.benefit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecofferBenefit;

public class SpecOfferBenefitQueryBuilderTest {

	private SpecOfferBenefitQueryBuilder unit = new SpecOfferBenefitQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}
	

	@Test
	public void testBuild() throws Exception {
		// Given
		SpecofferBenefit context = new SpecofferBenefit();
		
		String expectedQuery = "SELECT s FROM SpecofferBenefit s WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithAllParameters() throws Exception {
		// Given
		Benefit benefit = new Benefit();
		SpecOffer specOffer = new SpecOffer();
		SpecofferBenefit context = new SpecofferBenefit();
		context.setSpecOffer(specOffer);
		context.setBenefit(benefit);

		String expectedQuery = "SELECT s FROM SpecofferBenefit s WHERE ( e.specOffer = :specOffer OR e.benefit = :benefit ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
