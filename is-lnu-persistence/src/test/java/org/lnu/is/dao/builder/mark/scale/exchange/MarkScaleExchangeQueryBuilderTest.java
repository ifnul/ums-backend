package org.lnu.is.dao.builder.mark.scale.exchange;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.dao.builder.mark.scale.exchange.MarkScaleExchangeQueryBuilder;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.exchange.MarkScaleExchange;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.pagination.MultiplePagedSearch;

public class MarkScaleExchangeQueryBuilderTest {

	private MarkScaleExchangeQueryBuilder unit = new MarkScaleExchangeQueryBuilder();
	
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
		MarkScaleExchange context = new MarkScaleExchange();
		
		String expected = "SELECT e FROM MarkScaleExchange e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkScaleExchange> pagedSearch = new MultiplePagedSearch<>();
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
		
		MarkScaleExchange context = new MarkScaleExchange();
		
		String expected = "SELECT e FROM MarkScaleExchange e WHERE e.status=:status ";
		MultiplePagedSearch<MarkScaleExchange> pagedSearch = new MultiplePagedSearch<>();
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
		
		MarkScaleExchange context = new MarkScaleExchange();
		
		String expected = "SELECT e FROM MarkScaleExchange e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkScaleExchange> pagedSearch = new MultiplePagedSearch<>();
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
		
		MarkScaleExchange context = new MarkScaleExchange();
		
		String expected = "SELECT e FROM MarkScaleExchange e ";
		MultiplePagedSearch<MarkScaleExchange> pagedSearch = new MultiplePagedSearch<>();
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
		
		MarkScale markscale = new MarkScale();
		markscale.setId(1L);
		MarkScaleValue markscaleValue = new MarkScaleValue();
		markscaleValue.setId(1L);
		MarkScale markscaleExchange = new MarkScale();
		markscaleExchange.setId(2L);
		MarkScaleValue markscaleExchangeValue = new MarkScaleValue();
		markscaleExchangeValue.setId(2L);
		
		MarkScaleExchange context = new MarkScaleExchange();
		
		context.setMarkMin(markMin);
		context.setMarkMax(markMax);
		context.setMarkExchange(markExchange);
		
		context.setMarkScale(markscale);
		context.setMarkScaleValue(markscaleValue);
		context.setMarkScaleExchange(markscaleExchange);
		context.setMarkScaleExchangeValue(markscaleExchangeValue);

		String expected = "SELECT e FROM MarkScaleExchange e WHERE ( e.markScale = :markScale AND e.markScaleValue = :markScaleValue AND e.markScaleExchange = :markScaleExchange AND e.markScaleExchangeValue = :markScaleExchangeValue AND e.markMin = :markMin AND e.markMax = :markMax AND e.markExchange = :markExchange ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkScaleExchange> pagedSearch = new MultiplePagedSearch<>();
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
		
		MarkScale markscale = new MarkScale();
		markscale.setId(1L);
		MarkScaleValue markscaleValue = new MarkScaleValue();
		markscaleValue.setId(1L);
		MarkScale markscaleExchange = new MarkScale();
		markscaleExchange.setId(2L);
		MarkScaleValue markscaleExchangeValue = new MarkScaleValue();
		markscaleExchangeValue.setId(2L);
		
		MarkScaleExchange context = new MarkScaleExchange();
		
		context.setMarkMin(markMin);
		context.setMarkMax(markMax);
		context.setMarkExchange(markExchange);
		
		context.setMarkScale(markscale);
		context.setMarkScaleValue(markscaleValue);
		context.setMarkScaleExchange(markscaleExchange);
		context.setMarkScaleExchangeValue(markscaleExchangeValue);
		
		String expected = "SELECT e FROM MarkScaleExchange e WHERE ( e.markScale = :markScale AND e.markScaleValue = :markScaleValue AND e.markScaleExchange = :markScaleExchange AND e.markScaleExchangeValue = :markScaleExchangeValue AND e.markMin = :markMin AND e.markMax = :markMax AND e.markExchange = :markExchange ) ";
		MultiplePagedSearch<MarkScaleExchange> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
