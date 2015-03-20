package org.lnu.is.dao.builder.asset.status;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.asset.status.AssetStatus;
import org.lnu.is.pagination.MultiplePagedSearch;

public class AssetStatusQueryBuilderTest {
	
	private AssetStatusQueryBuilder unit = new AssetStatusQueryBuilder();
	
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
		AssetStatus context = new AssetStatus();

		String expected = "SELECT e FROM AssetStatus e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AssetStatus> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		AssetStatus context = new AssetStatus();
		
		String expected = "SELECT e FROM AssetStatus e WHERE e.status=:status ";
		MultiplePagedSearch<AssetStatus> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledActiveStatus() throws Exception {
		// Given
		unit.setActive(false);
		
		AssetStatus context = new AssetStatus();
		
		String expected = "SELECT e FROM AssetStatus e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AssetStatus> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AssetStatus context = new AssetStatus();
		
		String expected = "SELECT e FROM AssetStatus e ";
		MultiplePagedSearch<AssetStatus> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "name";
		
		AssetStatus context = new AssetStatus();
		context.setName(name);
		
		String expected = "SELECT e FROM AssetStatus e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AssetStatus> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String name = "name";
		
		AssetStatus context = new AssetStatus();
		context.setName(name);
		
		String expected = "SELECT e FROM AssetStatus e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) ";
		MultiplePagedSearch<AssetStatus> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
