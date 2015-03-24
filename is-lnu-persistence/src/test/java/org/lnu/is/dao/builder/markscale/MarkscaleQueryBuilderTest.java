package org.lnu.is.dao.builder.markscale;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.type.MarkscaleType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class MarkscaleQueryBuilderTest {

	private MarkscaleQueryBuilder unit = new MarkscaleQueryBuilder();
	
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
		Markscale context = new Markscale();
		
		String expected = "SELECT e FROM Markscale e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Markscale> pagedSearch = new MultiplePagedSearch<>();
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
		
		Markscale context = new Markscale();
		
		String expected = "SELECT e FROM Markscale e WHERE e.status=:status ";
		MultiplePagedSearch<Markscale> pagedSearch = new MultiplePagedSearch<>();
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
		
		Markscale context = new Markscale();
		
		String expected = "SELECT e FROM Markscale e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Markscale> pagedSearch = new MultiplePagedSearch<>();
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
		
		Markscale context = new Markscale();
		
		String expected = "SELECT e FROM Markscale e ";
		MultiplePagedSearch<Markscale> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;
		
		MarkscaleType markscaleType = new MarkscaleType();
		markscaleType.setId(1L);
		
		Markscale context = new Markscale();
		
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setMarkMin(markMin);
		context.setMarkMax(markMax);
		
		context.setMarkscaleType(markscaleType);

		String expected = "SELECT e FROM Markscale e WHERE ( e.markscaleType = :markscaleType AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') AND e.markMin = :markMin AND e.markMax = :markMax ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Markscale> pagedSearch = new MultiplePagedSearch<>();
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
		
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;
		
		MarkscaleType markscaleType = new MarkscaleType();
		markscaleType.setId(1L);
		
		Markscale context = new Markscale();
		
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setMarkMin(markMin);
		context.setMarkMax(markMax);
		
		context.setMarkscaleType(markscaleType);
		
		String expected = "SELECT e FROM Markscale e WHERE ( e.markscaleType = :markscaleType AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') AND e.markMin = :markMin AND e.markMax = :markMax ) ";
		MultiplePagedSearch<Markscale> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
