package org.lnu.is.dao.builder.specoffer.benefit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferBenefit;
import org.lnu.is.pagination.MultiplePagedSearch;

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
		SpecOfferBenefit context = new SpecOfferBenefit();
		
		String expectedQuery = "SELECT s FROM SpecofferBenefit s WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOfferBenefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		SpecOfferBenefit context = new SpecOfferBenefit();
		
		String expectedQuery = "SELECT s FROM SpecofferBenefit s WHERE e.status=:status ";
		MultiplePagedSearch<SpecOfferBenefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		SpecOfferBenefit context = new SpecOfferBenefit();
		
		String expectedQuery = "SELECT s FROM SpecofferBenefit s WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOfferBenefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		SpecOfferBenefit context = new SpecOfferBenefit();
		
		String expectedQuery = "SELECT s FROM SpecofferBenefit s ";
		MultiplePagedSearch<SpecOfferBenefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithAllParameters() throws Exception {
		// Given
		Benefit benefit = new Benefit();
		SpecOffer specOffer = new SpecOffer();
		SpecOfferBenefit context = new SpecOfferBenefit();
		context.setSpecOffer(specOffer);
		context.setBenefit(benefit);

		String expectedQuery = "SELECT s FROM SpecofferBenefit s WHERE ( e.specOffer = :specOffer OR e.benefit = :benefit ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOfferBenefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithAllParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Benefit benefit = new Benefit();
		SpecOffer specOffer = new SpecOffer();
		SpecOfferBenefit context = new SpecOfferBenefit();
		context.setSpecOffer(specOffer);
		context.setBenefit(benefit);
		
		String expectedQuery = "SELECT s FROM SpecofferBenefit s WHERE ( e.specOffer = :specOffer OR e.benefit = :benefit ) ";
		MultiplePagedSearch<SpecOfferBenefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
