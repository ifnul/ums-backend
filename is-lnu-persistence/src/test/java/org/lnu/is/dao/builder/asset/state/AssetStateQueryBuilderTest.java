package org.lnu.is.dao.builder.asset.state;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.asset.state.AssetState;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

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
	public void testBuildWithOrderBy() throws Exception {
		// Given
		AssetState context = new AssetState();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);

		String expected = "SELECT e FROM AssetState e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC";
		MultiplePagedSearch<AssetState> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWithDisabledSecurityConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		AssetState context = new AssetState();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);

		String expected = "SELECT e FROM AssetState e WHERE e.status=:status ORDER BY e.name ASC";
		MultiplePagedSearch<AssetState> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);

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
	public void testBuildWithDisabledStatusConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		AssetState context = new AssetState();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);

		String expected = "SELECT e FROM AssetState e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC";
		MultiplePagedSearch<AssetState> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWithDisabledDefaultConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AssetState context = new AssetState();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);

		String expected = "SELECT e FROM AssetState e ORDER BY e.name ASC";
		MultiplePagedSearch<AssetState> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);

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
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		String name = "name";
		AssetState context = new AssetState();
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1);
		
		String expected = "SELECT e FROM AssetState e WHERE ( a.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.name DESC";
		MultiplePagedSearch<AssetState> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String name = "name";
		AssetState context = new AssetState();
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);
		
		String expected = "SELECT e FROM AssetState e WHERE ( a.name LIKE CONCAT('%',:name,'%') ) ORDER BY e.name ASC";
		MultiplePagedSearch<AssetState> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
