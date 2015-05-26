package org.lnu.is.dao.builder.admin.unit.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.dao.builder.admin.unit.type.AdminUnitTypeQueryBuilder;
import org.lnu.is.domain.admin.unit.type.AdminUnitType;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class AdminUnitTypeQueryBuilderTest {

	private AdminUnitTypeQueryBuilder unit = new AdminUnitTypeQueryBuilder();
	
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
		AdminUnitType context = new AdminUnitType();

		String expected = "SELECT e FROM AdminUnitType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		AdminUnitType context = new AdminUnitType();

		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("abbrName", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);

		String expected = "SELECT e FROM AdminUnitType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC, e.abbrName DESC";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstr() throws Exception {
		// Given
		unit.setSecurity(false);
		
		AdminUnitType context = new AdminUnitType();
		
		String expected = "SELECT e FROM AdminUnitType e WHERE e.status=:status ";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstrWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		AdminUnitType context = new AdminUnitType();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy2 = new OrderBy("abbrName", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);

		String expected = "SELECT e FROM AdminUnitType e WHERE e.status=:status ORDER BY e.name DESC, e.abbrName ASC";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithDisabledStatusCosntrant() throws Exception {
		// Given
		unit.setActive(false);
		AdminUnitType context = new AdminUnitType();
		
		String expected = "SELECT e FROM AdminUnitType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithDisabledStatusCosntrantWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		AdminUnitType context = new AdminUnitType();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("abbrName", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);

		String expected = "SELECT e FROM AdminUnitType e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC, e.abbrName ASC";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
		
		AdminUnitType context = new AdminUnitType();
		
		String expected = "SELECT e FROM AdminUnitType e ";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
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
		
		AdminUnitType context = new AdminUnitType();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy2 = new OrderBy("abbrName", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);

		String expected = "SELECT e FROM AdminUnitType e ORDER BY e.name DESC, e.abbrName DESC";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
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
		String abbrName = "abb rname";
		String name = "name";
		
		AdminUnitType context = new AdminUnitType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expected = "SELECT e FROM AdminUnitType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		String abbrName = "abb rname";
		String name = "name";
		
		AdminUnitType context = new AdminUnitType();
		context.setAbbrName(abbrName);
		context.setName(name);

		OrderBy orderBy1 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1);
		
		String expected = "SELECT e FROM AdminUnitType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.name DESC";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
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
		
		String abbrName = "abb rname";
		String name = "name";
		
		AdminUnitType context = new AdminUnitType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expected = "SELECT e FROM AdminUnitType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
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
		
		String abbrName = "abb rname";
		String name = "name";
		
		AdminUnitType context = new AdminUnitType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);

		String expected = "SELECT e FROM AdminUnitType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ORDER BY e.abbrName ASC";
		MultiplePagedSearch<AdminUnitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
