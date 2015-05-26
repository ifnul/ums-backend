package org.lnu.is.dao.builder.department.address;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.address.type.AddressType;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.address.DepartmentAddress;
import org.lnu.is.domain.street.type.StreetType;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class DepartmentAddressQueryBuilderTest {

	private DepartmentAddressQueryBuilder unit = new DepartmentAddressQueryBuilder();
	
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
		DepartmentAddress context = new DepartmentAddress();

		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		DepartmentAddress context = new DepartmentAddress();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("addressType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("adminUnit", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("streetType", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("zipCode", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("street", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("house", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("apartment", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8);

		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.department ASC, e.addressType DESC, e.adminUnit ASC, e.streetType DESC, e.zipCode ASC, e.street DESC, e.house ASC, e.apartment DESC";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		DepartmentAddress context = new DepartmentAddress();
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE e.status=:status ";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraintWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		DepartmentAddress context = new DepartmentAddress();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("addressType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("adminUnit", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("streetType", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("zipCode", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("street", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("house", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("apartment", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8);
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE e.status=:status ORDER BY e.department ASC, e.addressType DESC, e.adminUnit ASC, e.streetType DESC, e.zipCode ASC, e.street DESC, e.house ASC, e.apartment DESC";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		DepartmentAddress context = new DepartmentAddress();
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		DepartmentAddress context = new DepartmentAddress();
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("addressType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("adminUnit", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("streetType", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("zipCode", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("street", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("house", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("apartment", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8);
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.department ASC, e.addressType DESC, e.adminUnit ASC, e.streetType DESC, e.zipCode ASC, e.street DESC, e.house ASC, e.apartment DESC";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		DepartmentAddress context = new DepartmentAddress();
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e ";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		DepartmentAddress context = new DepartmentAddress();
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("addressType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("adminUnit", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("streetType", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("zipCode", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("street", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("house", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("apartment", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8);
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e ORDER BY e.department ASC, e.addressType DESC, e.adminUnit ASC, e.streetType DESC, e.zipCode ASC, e.street DESC, e.house ASC, e.apartment DESC";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Department department = new Department();
		AddressType addressType = new AddressType();
		AdminUnit adminUnit = new AdminUnit();
		StreetType streetType = new StreetType();
		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "fsd";

		DepartmentAddress context = new DepartmentAddress();
		context.setDepartment(department);
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setStreetType(streetType);
		context.setZipCode(zipCode);
		context.setStreet(street);
		context.setHouse(house);
		context.setApartment(apartment);
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE ( e.department = :department AND e.addressType = :addressType AND e.adminUnit = :adminUnit AND e.streetType = :streetType AND e.zipCode LIKE CONCAT('%',:zipCode,'%') AND e.street LIKE CONCAT('%',:street,'%') AND e.house LIKE CONCAT('%',:house,'%') AND e.apartment LIKE CONCAT('%',:apartment,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		Department department = new Department();
		AddressType addressType = new AddressType();
		AdminUnit adminUnit = new AdminUnit();
		StreetType streetType = new StreetType();
		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "fsd";

		DepartmentAddress context = new DepartmentAddress();
		context.setDepartment(department);
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setStreetType(streetType);
		context.setZipCode(zipCode);
		context.setStreet(street);
		context.setHouse(house);
		context.setApartment(apartment);
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("addressType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("adminUnit", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("streetType", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("zipCode", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("street", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("house", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("apartment", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8);
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE ( e.department = :department AND e.addressType = :addressType AND e.adminUnit = :adminUnit AND e.streetType = :streetType AND e.zipCode LIKE CONCAT('%',:zipCode,'%') AND e.street LIKE CONCAT('%',:street,'%') AND e.house LIKE CONCAT('%',:house,'%') AND e.apartment LIKE CONCAT('%',:apartment,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.department ASC, e.addressType DESC, e.adminUnit ASC, e.streetType DESC, e.zipCode ASC, e.street DESC, e.house ASC, e.apartment DESC";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Department department = new Department();
		AddressType addressType = new AddressType();
		AdminUnit adminUnit = new AdminUnit();
		StreetType streetType = new StreetType();
		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "fsd";
		
		DepartmentAddress context = new DepartmentAddress();
		context.setDepartment(department);
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setStreetType(streetType);
		context.setZipCode(zipCode);
		context.setStreet(street);
		context.setHouse(house);
		context.setApartment(apartment);
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE ( e.department = :department AND e.addressType = :addressType AND e.adminUnit = :adminUnit AND e.streetType = :streetType AND e.zipCode LIKE CONCAT('%',:zipCode,'%') AND e.street LIKE CONCAT('%',:street,'%') AND e.house LIKE CONCAT('%',:house,'%') AND e.apartment LIKE CONCAT('%',:apartment,'%') ) ";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Department department = new Department();
		AddressType addressType = new AddressType();
		AdminUnit adminUnit = new AdminUnit();
		StreetType streetType = new StreetType();
		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "fsd";
		
		DepartmentAddress context = new DepartmentAddress();
		context.setDepartment(department);
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setStreetType(streetType);
		context.setZipCode(zipCode);
		context.setStreet(street);
		context.setHouse(house);
		context.setApartment(apartment);
		
		OrderBy orderBy1 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("addressType", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("adminUnit", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("streetType", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("zipCode", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("street", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("house", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("apartment", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8);
		
		String expectedQuery = "SELECT e FROM DepartmentAddress e WHERE ( e.department = :department AND e.addressType = :addressType AND e.adminUnit = :adminUnit AND e.streetType = :streetType AND e.zipCode LIKE CONCAT('%',:zipCode,'%') AND e.street LIKE CONCAT('%',:street,'%') AND e.house LIKE CONCAT('%',:house,'%') AND e.apartment LIKE CONCAT('%',:apartment,'%') ) ORDER BY e.department ASC, e.addressType DESC, e.adminUnit ASC, e.streetType DESC, e.zipCode ASC, e.street DESC, e.house ASC, e.apartment DESC";
		MultiplePagedSearch<DepartmentAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
