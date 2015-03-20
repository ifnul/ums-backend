package org.lnu.is.dao.builder.specoffer.benefit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferBenefit;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

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
		
		String expectedQuery = "SELECT e FROM SpecOfferBenefit e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOfferBenefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		SpecOfferBenefit context = new SpecOfferBenefit();
		OrderBy orderBy1 = new OrderBy("benefit", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);
		
		String expectedQuery = "SELECT e FROM SpecOfferBenefit e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.benefit ASC";
		MultiplePagedSearch<SpecOfferBenefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
		
		String expectedQuery = "SELECT e FROM SpecOfferBenefit e WHERE e.status=:status ";
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
		
		String expectedQuery = "SELECT e FROM SpecOfferBenefit e WHERE e.crtUserGroup IN (:userGroups) ";
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
		
		String expectedQuery = "SELECT e FROM SpecOfferBenefit e ";
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

		String expectedQuery = "SELECT e FROM SpecOfferBenefit e WHERE ( e.specOffer = :specOffer OR e.benefit = :benefit ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
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
		
		String expectedQuery = "SELECT e FROM SpecOfferBenefit e WHERE ( e.specOffer = :specOffer OR e.benefit = :benefit ) ";
		MultiplePagedSearch<SpecOfferBenefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
