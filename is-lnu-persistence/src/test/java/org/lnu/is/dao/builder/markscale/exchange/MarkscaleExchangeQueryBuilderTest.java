package org.lnu.is.dao.builder.markscale.exchange;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.exchange.MarkscaleExchange;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.pagination.MultiplePagedSearch;

public class MarkscaleExchangeQueryBuilderTest {

	private MarkscaleExchangeQueryBuilder unit = new MarkscaleExchangeQueryBuilder();
	
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
		MarkscaleExchange context = new MarkscaleExchange();
		
		String expected = "SELECT e FROM MarkscaleExchange e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkscaleExchange> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraints() throws Exception {
		// Given
		unit.setSecurity(false);
		
		MarkscaleExchange context = new MarkscaleExchange();
		
		String expected = "SELECT e FROM MarkscaleExchange e WHERE e.status=:status ";
		MultiplePagedSearch<MarkscaleExchange> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		MarkscaleExchange context = new MarkscaleExchange();
		
		String expected = "SELECT e FROM MarkscaleExchange e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkscaleExchange> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		MarkscaleExchange context = new MarkscaleExchange();
		
		String expected = "SELECT e FROM MarkscaleExchange e ";
		MultiplePagedSearch<MarkscaleExchange> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Double markMin = 0.0;
		Double markMax = 10.0;
		Double markExchange = 5.0;
		
		Markscale markscale = new Markscale();
		markscale.setId(1L);
		MarkscaleValue markscaleValue = new MarkscaleValue();
		markscaleValue.setId(1L);
		Markscale markscaleExchange = new Markscale();
		markscaleExchange.setId(2L);
		MarkscaleValue markscaleExchangeValue = new MarkscaleValue();
		markscaleExchangeValue.setId(2L);
		
		MarkscaleExchange context = new MarkscaleExchange();
		
		context.setMarkMin(markMin);
		context.setMarkMax(markMax);
		context.setMarkExchange(markExchange);
		
		context.setMarkscale(markscale);
		context.setMarkscaleValue(markscaleValue);
		context.setMarkscaleExchange(markscaleExchange);
		context.setMarkscaleExchangeValue(markscaleExchangeValue);

		String expected = "SELECT e FROM MarkscaleExchange e WHERE ( e.markscale = :markscale OR e.markscaleValue = :markscaleValue OR e.markscaleExchange = :markscaleExchange OR e.markscaleExchangeValue = :markscaleExchangeValue OR e.markMin = :markMin OR e.markMax = :markMax OR e.markExchange = :markExchange ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkscaleExchange> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Double markMin = 0.0;
		Double markMax = 10.0;
		Double markExchange = 5.0;
		
		Markscale markscale = new Markscale();
		markscale.setId(1L);
		MarkscaleValue markscaleValue = new MarkscaleValue();
		markscaleValue.setId(1L);
		Markscale markscaleExchange = new Markscale();
		markscaleExchange.setId(2L);
		MarkscaleValue markscaleExchangeValue = new MarkscaleValue();
		markscaleExchangeValue.setId(2L);
		
		MarkscaleExchange context = new MarkscaleExchange();
		
		context.setMarkMin(markMin);
		context.setMarkMax(markMax);
		context.setMarkExchange(markExchange);
		
		context.setMarkscale(markscale);
		context.setMarkscaleValue(markscaleValue);
		context.setMarkscaleExchange(markscaleExchange);
		context.setMarkscaleExchangeValue(markscaleExchangeValue);
		
		String expected = "SELECT e FROM MarkscaleExchange e WHERE ( e.markscale = :markscale OR e.markscaleValue = :markscaleValue OR e.markscaleExchange = :markscaleExchange OR e.markscaleExchangeValue = :markscaleExchangeValue OR e.markMin = :markMin OR e.markMax = :markMax OR e.markExchange = :markExchange ) ";
		MultiplePagedSearch<MarkscaleExchange> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
