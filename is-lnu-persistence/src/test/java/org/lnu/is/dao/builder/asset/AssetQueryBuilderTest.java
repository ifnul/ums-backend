package org.lnu.is.dao.builder.asset;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.state.AssetState;
import org.lnu.is.domain.asset.status.AssetStatus;
import org.lnu.is.domain.asset.type.AssetType;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class AssetQueryBuilderTest {

	private AssetQueryBuilder unit = new AssetQueryBuilder();
	
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
		Asset context = new Asset();

		String expectedSql = "SELECT e FROM Asset e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Asset> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedSql, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		Asset context = new Asset();

		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("invnum", OrderByType.ASC);
		OrderBy orderBy3 = new OrderBy("serialnum", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("proddate", OrderByType.ASC);
		OrderBy orderBy5 = new OrderBy("begdate", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("enddate", OrderByType.ASC);
		OrderBy orderBy7 = new OrderBy("price", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("amount", OrderByType.ASC);
		OrderBy orderBy9 = new OrderBy("suma", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10);

		String expectedSql = "SELECT e FROM Asset e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC, e.invnum ASC, e.serialnum ASC, e.proddate ASC, e.begdate ASC, e.enddate ASC, e.price ASC, e.amount ASC, e.suma ASC, e.description ASC";
		MultiplePagedSearch<Asset> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedSql, actualQuery);
	}

	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Asset context = new Asset();
		
		String expectedSql = "SELECT e FROM Asset e WHERE e.status=:status ";
		MultiplePagedSearch<Asset> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedSql, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraintWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Asset context = new Asset();

		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("invnum", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("serialnum", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("proddate", OrderByType.ASC);
		OrderBy orderBy5 = new OrderBy("begdate", OrderByType.DESC);
		OrderBy orderBy6 = new OrderBy("enddate", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("price", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("amount", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("suma", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("description", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10);

		String expectedSql = "SELECT e FROM Asset e WHERE e.status=:status ORDER BY e.name ASC, e.invnum DESC, e.serialnum ASC, e.proddate ASC, e.begdate DESC, e.enddate DESC, e.price ASC, e.amount DESC, e.suma ASC, e.description DESC";
		MultiplePagedSearch<Asset> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedSql, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConsraint() throws Exception {
		// Given
		unit.setActive(false);
		
		Asset context = new Asset();
		
		String expectedSql = "SELECT e FROM Asset e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Asset> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedSql, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConsraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		Asset context = new Asset();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("invnum", OrderByType.ASC);
		OrderBy orderBy3 = new OrderBy("serialnum", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("proddate", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedSql = "SELECT e FROM Asset e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC, e.invnum ASC, e.serialnum ASC, e.proddate ASC";
		MultiplePagedSearch<Asset> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedSql, actualQuery);
	}

	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Asset context = new Asset();
		
		String expectedSql = "SELECT e FROM Asset e ";
		MultiplePagedSearch<Asset> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedSql, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		OrderBy order1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(order1);
		
		Asset context = new Asset();
		
		String expectedSql = "SELECT e FROM Asset e ORDER BY e.name ASC";
		MultiplePagedSearch<Asset> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedSql, actualQuery);
	}

	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		AssetType assetType = new AssetType();
		AssetState assetState = new AssetState();
		AssetStatus assetStatus = new AssetStatus();
		Department department = new Department();
		Employee employee = new Employee();
		Partner partner = new Partner();
		Order order = new Order();

		Asset context = new Asset();
		context.setAssetType(assetType);
		context.setAssetState(assetState);
		context.setAssetStatus(assetStatus);
		context.setDepartment(department);
		context.setEmployee(employee);
		context.setPartner(partner);
		context.setOrder(order);

		List<OrderBy> orders = Arrays.asList();
		
		String expectedSql = "SELECT e FROM Asset e WHERE ( e.order = :order AND e.partner = :partner AND e.employee = :employee AND e.department = :department AND e.assetStatus = :assetStatus AND e.assetState = :assetState AND e.assetType = :assetType ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Asset> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedSql, actualQuery);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		AssetType assetType = new AssetType();
		AssetState assetState = new AssetState();
		AssetStatus assetStatus = new AssetStatus();
		Department department = new Department();
		Employee employee = new Employee();
		Partner partner = new Partner();
		Order order = new Order();

		Asset context = new Asset();
		context.setAssetType(assetType);
		context.setAssetState(assetState);
		context.setAssetStatus(assetStatus);
		context.setDepartment(department);
		context.setEmployee(employee);
		context.setPartner(partner);
		context.setOrder(order);

		String expectedSql = "SELECT e FROM Asset e WHERE ( e.order = :order AND e.partner = :partner AND e.employee = :employee AND e.department = :department AND e.assetStatus = :assetStatus AND e.assetState = :assetState AND e.assetType = :assetType ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Asset> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedSql, actualQuery);
	}

	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AssetType assetType = new AssetType();
		AssetState assetState = new AssetState();
		AssetStatus assetStatus = new AssetStatus();
		Department department = new Department();
		Employee employee = new Employee();
		Partner partner = new Partner();
		Order order = new Order();
		
		Asset context = new Asset();
		context.setAssetType(assetType);
		context.setAssetState(assetState);
		context.setAssetStatus(assetStatus);
		context.setDepartment(department);
		context.setEmployee(employee);
		context.setPartner(partner);
		context.setOrder(order);
		
		String expectedSql = "SELECT e FROM Asset e WHERE ( e.order = :order AND e.partner = :partner AND e.employee = :employee AND e.department = :department AND e.assetStatus = :assetStatus AND e.assetState = :assetState AND e.assetType = :assetType ) ";
		MultiplePagedSearch<Asset> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedSql, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AssetType assetType = new AssetType();
		AssetState assetState = new AssetState();
		AssetStatus assetStatus = new AssetStatus();
		Department department = new Department();
		Employee employee = new Employee();
		Partner partner = new Partner();
		Order order = new Order();
		
		Asset context = new Asset();
		context.setAssetType(assetType);
		context.setAssetState(assetState);
		context.setAssetStatus(assetStatus);
		context.setDepartment(department);
		context.setEmployee(employee);
		context.setPartner(partner);
		context.setOrder(order);
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1);
		
		String expectedSql = "SELECT e FROM Asset e WHERE ( e.order = :order AND e.partner = :partner AND e.employee = :employee AND e.department = :department AND e.assetStatus = :assetStatus AND e.assetState = :assetState AND e.assetType = :assetType ) ORDER BY e.name DESC";
		MultiplePagedSearch<Asset> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedSql, actualQuery);
	}
}
