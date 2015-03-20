package org.lnu.is.dao.builder.adminunit;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.adminunit.type.AdminUnitType;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class AdminUnitQueryBuilderTest {

	private AdminUnitQueryBuilder unit = new AdminUnitQueryBuilder();
	
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
		AdminUnit context = new AdminUnit();
		
		String expected = "SELECT e FROM AdminUnit e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AdminUnit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		AdminUnit context = new AdminUnit();
		
		OrderBy orderBy1 = new OrderBy("identifier", OrderByType.DESC);
		OrderBy orderBy2 = new OrderBy("identifier1", OrderByType.ASC);
		OrderBy orderBy3 = new OrderBy("identifier2", OrderByType.DESC);
		OrderBy orderBy4 = new OrderBy("identifier3", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy7 = new OrderBy("endDate", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("fullName", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8);

		String expected = "SELECT e FROM AdminUnit e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.identifier DESC, e.identifier1 ASC, e.identifier2 DESC, e.identifier3 DESC, e.name ASC, e.begDate ASC, e.endDate ASC, e.fullName DESC";
		MultiplePagedSearch<AdminUnit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraints() throws Exception {
		// Given
		unit.setSecurity(false);
		
		AdminUnit context = new AdminUnit();
		
		String expected = "SELECT e FROM AdminUnit e WHERE e.status=:status ";
		MultiplePagedSearch<AdminUnit> pagedSearch = new MultiplePagedSearch<>();
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
		
		AdminUnit context = new AdminUnit();
		
		OrderBy orderBy1 = new OrderBy("identifier", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("identifier1", OrderByType.ASC);
		OrderBy orderBy3 = new OrderBy("identifier2", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("identifier3", OrderByType.ASC);
		OrderBy orderBy5 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy7 = new OrderBy("endDate", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("fullName", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8);

		String expected = "SELECT e FROM AdminUnit e WHERE e.status=:status ORDER BY e.identifier ASC, e.identifier1 ASC, e.identifier2 ASC, e.identifier3 ASC, e.name ASC, e.begDate ASC, e.endDate ASC, e.fullName ASC";
		MultiplePagedSearch<AdminUnit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);

		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusCOnstraints() throws Exception {
		// Given
		unit.setActive(false);
		
		AdminUnit context = new AdminUnit();
		
		String expected = "SELECT e FROM AdminUnit e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AdminUnit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithDisabledStatusCOnstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		AdminUnit context = new AdminUnit();
		
		OrderBy orderBy1 = new OrderBy("identifier", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("identifier1", OrderByType.ASC);
		OrderBy orderBy3 = new OrderBy("identifier2", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("identifier3", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);

		String expected = "SELECT e FROM AdminUnit e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.identifier ASC, e.identifier1 ASC, e.identifier2 ASC, e.identifier3 ASC";
		MultiplePagedSearch<AdminUnit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDEfaultCOnstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AdminUnit context = new AdminUnit();
		
		String expected = "SELECT e FROM AdminUnit e ";
		MultiplePagedSearch<AdminUnit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithDisabledDEfaultCOnstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AdminUnit context = new AdminUnit();
		
		OrderBy orderBy1 = new OrderBy("identifier", OrderByType.DESC);
		OrderBy orderBy2 = new OrderBy("identifier1", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("identifier2", OrderByType.DESC);
		OrderBy orderBy4 = new OrderBy("identifier3", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy6 = new OrderBy("begDate", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy8 = new OrderBy("fullName", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8);

		String expected = "SELECT e FROM AdminUnit e ORDER BY e.identifier DESC, e.identifier1 DESC, e.identifier2 DESC, e.identifier3 DESC, e.name DESC, e.begDate DESC, e.endDate DESC, e.fullName DESC";
		MultiplePagedSearch<AdminUnit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);

		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithFullEntity() throws Exception {
		// Given
		AdminUnit parent = new AdminUnit();
		AdminUnitType adminUnitType = new AdminUnitType();
		String identifier = "identifgier";
		String identifier1 = "identifier1";
		String identifier2 = "identifeir2";
		String identifier3 = "identifier3";
		String name = "ndasdsa";
		Date begDate = new Date();
		Date endDate = new Date();
		
		AdminUnit context = new AdminUnit();
		context.setAdminUnitType(adminUnitType);
		context.setParent(parent);
		context.setIdentifier(identifier);
		context.setIdentifier1(identifier1);
		context.setIdentifier2(identifier2);
		context.setIdentifier3(identifier3);
		context.setName(name);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
				
		String expected = "SELECT e FROM AdminUnit e WHERE ( e.adminUnitType = :adminUnitTypeOR e.parent = :parent OR e.identifier LIKE CONCAT('%',:identifier,'%') OR e.identifier1 LIKE CONCAT('%',:identifier1,'%') OR e.identifier2 LIKE CONCAT('%',:identifier2,'%') OR e.identifier3 LIKE CONCAT('%',:identifier3,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AdminUnit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
		@Test
	public void testBuildWithFullEntityWithOrderBy() throws Exception {
		// Given
		AdminUnit parent = new AdminUnit();
		AdminUnitType adminUnitType = new AdminUnitType();
		String identifier = "identifgier";
		String identifier1 = "identifier1";
		String identifier2 = "identifeir2";
		String identifier3 = "identifier3";
		String name = "ndasdsa";
		Date begDate = new Date();
		Date endDate = new Date();
		
		AdminUnit context = new AdminUnit();
		context.setAdminUnitType(adminUnitType);
		context.setParent(parent);
		context.setIdentifier(identifier);
		context.setIdentifier1(identifier1);
		context.setIdentifier2(identifier2);
		context.setIdentifier3(identifier3);
		context.setName(name);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
				
		OrderBy orderBy1 = new OrderBy("identifier", OrderByType.DESC);
		OrderBy orderBy2 = new OrderBy("identifier1", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("identifier2", OrderByType.DESC);
		OrderBy orderBy4 = new OrderBy("identifier3", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);

		String expected = "SELECT e FROM AdminUnit e WHERE ( e.adminUnitType = :adminUnitTypeOR e.parent = :parent OR e.identifier LIKE CONCAT('%',:identifier,'%') OR e.identifier1 LIKE CONCAT('%',:identifier1,'%') OR e.identifier2 LIKE CONCAT('%',:identifier2,'%') OR e.identifier3 LIKE CONCAT('%',:identifier3,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.identifier DESC, e.identifier1 DESC, e.identifier2 DESC, e.identifier3 DESC";
		MultiplePagedSearch<AdminUnit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithFullEntityWithDisabledDefaultConstrsaints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AdminUnit parent = new AdminUnit();
		AdminUnitType adminUnitType = new AdminUnitType();
		String identifier = "identifgier";
		String identifier1 = "identifier1";
		String identifier2 = "identifeir12";
		String identifier3 = "identifier3";
		String name = "ndasdsa";
		Date begDate = new Date();
		Date endDate = new Date();
		
		AdminUnit context = new AdminUnit();
		context.setAdminUnitType(adminUnitType);
		context.setParent(parent);
		context.setIdentifier(identifier);
		context.setIdentifier1(identifier1);
		context.setIdentifier2(identifier2);
		context.setIdentifier3(identifier3);
		context.setName(name);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		
		
		String expected = "SELECT e FROM AdminUnit e WHERE ( e.adminUnitType = :adminUnitTypeOR e.parent = :parent OR e.identifier LIKE CONCAT('%',:identifier,'%') OR e.identifier1 LIKE CONCAT('%',:identifier1,'%') OR e.identifier2 LIKE CONCAT('%',:identifier2,'%') OR e.identifier3 LIKE CONCAT('%',:identifier3,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate ) ";
		MultiplePagedSearch<AdminUnit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithFullEntityWithDisabledDefaultConstrsaintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AdminUnit parent = new AdminUnit();
		AdminUnitType adminUnitType = new AdminUnitType();
		String identifier = "identifgier";
		String identifier1 = "identifier1";
		String identifier2 = "identifeir12";
		String identifier3 = "identifier3";
		String name = "ndasdsa";
		Date begDate = new Date();
		Date endDate = new Date();
		
		AdminUnit context = new AdminUnit();
		context.setAdminUnitType(adminUnitType);
		context.setParent(parent);
		context.setIdentifier(identifier);
		context.setIdentifier1(identifier1);
		context.setIdentifier2(identifier2);
		context.setIdentifier3(identifier3);
		context.setName(name);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		
		List<OrderBy> orders = Arrays.asList();
		
		String expected = "SELECT e FROM AdminUnit e WHERE ( e.adminUnitType = :adminUnitTypeOR e.parent = :parent OR e.identifier LIKE CONCAT('%',:identifier,'%') OR e.identifier1 LIKE CONCAT('%',:identifier1,'%') OR e.identifier2 LIKE CONCAT('%',:identifier2,'%') OR e.identifier3 LIKE CONCAT('%',:identifier3,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate ) ";
		MultiplePagedSearch<AdminUnit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
