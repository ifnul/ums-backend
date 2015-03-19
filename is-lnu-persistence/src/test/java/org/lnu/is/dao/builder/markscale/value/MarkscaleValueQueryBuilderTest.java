package org.lnu.is.dao.builder.markscale.value;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.pagination.MultiplePagedSearch;

public class MarkscaleValueQueryBuilderTest {

	private MarkscaleValueQueryBuilder unit = new MarkscaleValueQueryBuilder();
	
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
		MarkscaleValue context = new MarkscaleValue();
		
		String expected = "SELECT e FROM MarkscaleValue e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkscaleValue> pagedSearch = new MultiplePagedSearch<>();
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
		
		MarkscaleValue context = new MarkscaleValue();
		
		String expected = "SELECT e FROM MarkscaleValue e WHERE e.status=:status ";
		MultiplePagedSearch<MarkscaleValue> pagedSearch = new MultiplePagedSearch<>();
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
		
		MarkscaleValue context = new MarkscaleValue();
		
		String expected = "SELECT e FROM MarkscaleValue e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkscaleValue> pagedSearch = new MultiplePagedSearch<>();
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
		
		MarkscaleValue context = new MarkscaleValue();
		
		String expected = "SELECT e FROM MarkscaleValue e ";
		MultiplePagedSearch<MarkscaleValue> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String strValue = "strValue";
		
		Markscale markscale = new Markscale();
		markscale.setId(1L);
		
		MarkscaleValue context = new MarkscaleValue();
		
		context.setStrValue(strValue);
		
		context.setMarkscale(markscale);

		String expected = "SELECT e FROM MarkscaleValue e WHERE ( e.markscale = :markscale OR e.strValue LIKE CONCAT('%',:strValue,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkscaleValue> pagedSearch = new MultiplePagedSearch<>();
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
		
		String strValue = "strValue";
		
		Markscale markscale = new Markscale();
		markscale.setId(1L);
		
		MarkscaleValue context = new MarkscaleValue();
		
		context.setStrValue(strValue);
		
		context.setMarkscale(markscale);
		
		String expected = "SELECT e FROM MarkscaleValue e WHERE ( e.markscale = :markscale OR e.strValue LIKE CONCAT('%',:strValue,'%') ) ";
		MultiplePagedSearch<MarkscaleValue> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
