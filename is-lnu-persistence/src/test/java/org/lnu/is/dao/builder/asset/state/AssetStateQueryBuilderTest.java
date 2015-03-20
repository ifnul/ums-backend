package org.lnu.is.dao.builder.asset.state;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.asset.state.AssetState;
import org.lnu.is.pagination.MultiplePagedSearch;

public class AssetStateQueryBuilderTest {

	private AssetStateQueryBuilder unit = new AssetStateQueryBuilder();
	
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
		AssetState context = new AssetState();
		
		String expected = "SELECT e FROM AssetState e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AssetState> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurituCOnstraitns() throws Exception {
		// Given
		unit.setSecurity(false);
		
		AssetState context = new AssetState();
		
		String expected = "SELECT e FROM AssetState e WHERE e.status=:status ";
		MultiplePagedSearch<AssetState> pagedSearch = new MultiplePagedSearch<>();
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
		
		AssetState context = new AssetState();
		
		String expected = "SELECT e FROM AssetState e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AssetState> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstrqaint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AssetState context = new AssetState();
		
		String expected = "SELECT e FROM AssetState e ";
		MultiplePagedSearch<AssetState> pagedSearch = new MultiplePagedSearch<>();
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
		AssetState context = new AssetState();
		context.setName(name);
		
		String expected = "SELECT e FROM AssetState e WHERE ( a.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AssetState> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithParametersAndDIsabledDEfaultCOnstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String name = "name";
		AssetState context = new AssetState();
		context.setName(name);
		
		String expected = "SELECT e FROM AssetState e WHERE ( a.name LIKE CONCAT('%',:name,'%') ) ";
		MultiplePagedSearch<AssetState> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
