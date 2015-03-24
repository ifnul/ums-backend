package org.lnu.is.dao.builder.asset.address;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.address.AssetAddress;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class AssetAddressQueryBuilderTest {

	private AssetAddressQueryBuilder unit = new AssetAddressQueryBuilder();
	
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
		AdminUnit adminUnit = new AdminUnit();
		Asset asset = new Asset();
		AddressType addressType = new AddressType();
		StreetType streetType = new StreetType();

		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "apartment";

		AssetAddress context = new AssetAddress();
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setAsset(asset);
		context.setStreetType(streetType);
		context.setZipCode(zipCode);
		context.setStreet(street);
		context.setHouse(house);
		context.setApartment(apartment);

		String expected = "SELECT e FROM AssetAddress e WHERE ( e.adminUnit = :adminUnit AND e.asset = :asset AND e.addressType = :addressType AND e.streetType = :streetType AND e.zipCode LIKE CONCAT('%',:zipCode,'%') AND e.street LIKE CONCAT('%',:street,'%') AND e.house LIKE CONCAT('%',:house,'%') AND e.apartment LIKE CONCAT('%',:apartment,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		AdminUnit adminUnit = new AdminUnit();
		Asset asset = new Asset();
		AddressType addressType = new AddressType();
		StreetType streetType = new StreetType();

		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "apartment";

		AssetAddress context = new AssetAddress();
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setAsset(asset);
		context.setStreetType(streetType);
		context.setZipCode(zipCode);
		context.setStreet(street);
		context.setHouse(house);
		context.setApartment(apartment);

		OrderBy orderBy1 = new OrderBy("zipcode", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("street", OrderByType.ASC);
		OrderBy orderBy3 = new OrderBy("house", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("apartment", OrderByType.ASC);
		
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);

			
		String expected = "SELECT e FROM AssetAddress e WHERE ( e.adminUnit = :adminUnit AND e.asset = :asset AND e.addressType = :addressType AND e.streetType = :streetType AND e.zipCode LIKE CONCAT('%',:zipCode,'%') AND e.street LIKE CONCAT('%',:street,'%') AND e.house LIKE CONCAT('%',:house,'%') AND e.apartment LIKE CONCAT('%',:apartment,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.zipcode ASC, e.street ASC, e.house ASC, e.apartment ASC";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithEmptyFields() throws Exception {
		// Given
		AssetAddress context = new AssetAddress();
		
		String expected = "SELECT e FROM AssetAddress e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithEmptyFieldsWithOrderBy() throws Exception {
		// Given
		AssetAddress context = new AssetAddress();
		
		OrderBy orderBy1 = new OrderBy("zipcode", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("street", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("house", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("apartment", OrderByType.DESC);
		
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);

		String expected = "SELECT e FROM AssetAddress e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.zipcode ASC, e.street DESC, e.house ASC, e.apartment DESC";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithEmptyFieldsAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AssetAddress context = new AssetAddress();
		
		String expected = "SELECT e FROM AssetAddress e ";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithEmptyFieldsAndDisabledDefaultsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AssetAddress context = new AssetAddress();
		
		OrderBy orderBy1 = new OrderBy("zipcode", OrderByType.DESC);
		OrderBy orderBy2 = new OrderBy("street", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("house", OrderByType.DESC);
		OrderBy orderBy4 = new OrderBy("apartment", OrderByType.DESC);
		
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);

		String expected = "SELECT e FROM AssetAddress e ORDER BY e.zipcode DESC, e.street DESC, e.house DESC, e.apartment DESC";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AdminUnit adminUnit = new AdminUnit();
		Asset asset = new Asset();
		AddressType addressType = new AddressType();
		StreetType streetType = new StreetType();
		
		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "apartment";
		
		AssetAddress context = new AssetAddress();
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setAsset(asset);
		context.setStreetType(streetType);
		context.setZipCode(zipCode);
		context.setStreet(street);
		context.setHouse(house);
		context.setApartment(apartment);
		
		String expected = "SELECT e FROM AssetAddress e WHERE ( e.adminUnit = :adminUnit AND e.asset = :asset AND e.addressType = :addressType AND e.streetType = :streetType AND e.zipCode LIKE CONCAT('%',:zipCode,'%') AND e.street LIKE CONCAT('%',:street,'%') AND e.house LIKE CONCAT('%',:house,'%') AND e.apartment LIKE CONCAT('%',:apartment,'%') ) ";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AdminUnit adminUnit = new AdminUnit();
		Asset asset = new Asset();
		AddressType addressType = new AddressType();
		StreetType streetType = new StreetType();
		
		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "apartment";
		
		AssetAddress context = new AssetAddress();
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setAsset(asset);
		context.setStreetType(streetType);
		context.setZipCode(zipCode);
		context.setStreet(street);
		context.setHouse(house);
		context.setApartment(apartment);
		
		OrderBy orderBy1 = new OrderBy("zipcode", OrderByType.ASC);
		
		
		List<OrderBy> orders = Arrays.asList(orderBy1);

		String expected = "SELECT e FROM AssetAddress e WHERE ( e.adminUnit = :adminUnit AND e.asset = :asset AND e.addressType = :addressType AND e.streetType = :streetType AND e.zipCode LIKE CONCAT('%',:zipCode,'%') AND e.street LIKE CONCAT('%',:street,'%') AND e.house LIKE CONCAT('%',:house,'%') AND e.apartment LIKE CONCAT('%',:apartment,'%') ) ORDER BY e.zipcode ASC";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithDisabledStatus() throws Exception {
		// Given
		unit.setActive(false);
		
		AdminUnit adminUnit = new AdminUnit();
		Asset asset = new Asset();
		AddressType addressType = new AddressType();
		StreetType streetType = new StreetType();
		
		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "apartment";
		
		AssetAddress context = new AssetAddress();
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setAsset(asset);
		context.setStreetType(streetType);
		context.setZipCode(zipCode);
		context.setStreet(street);
		context.setHouse(house);
		context.setApartment(apartment);
		
		String expected = "SELECT e FROM AssetAddress e WHERE ( e.adminUnit = :adminUnit AND e.asset = :asset AND e.addressType = :addressType AND e.streetType = :streetType AND e.zipCode LIKE CONCAT('%',:zipCode,'%') AND e.street LIKE CONCAT('%',:street,'%') AND e.house LIKE CONCAT('%',:house,'%') AND e.apartment LIKE CONCAT('%',:apartment,'%') ) AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithDisabledSecurity() throws Exception {
		// Given
		unit.setSecurity(false);
		
		AdminUnit adminUnit = new AdminUnit();
		Asset asset = new Asset();
		AddressType addressType = new AddressType();
		StreetType streetType = new StreetType();
		
		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "apartment";
		
		AssetAddress context = new AssetAddress();
		context.setAddressType(addressType);
		context.setAdminUnit(adminUnit);
		context.setAsset(asset);
		context.setStreetType(streetType);
		context.setZipCode(zipCode);
		context.setStreet(street);
		context.setHouse(house);
		context.setApartment(apartment);
		
		String expected = "SELECT e FROM AssetAddress e WHERE ( e.adminUnit = :adminUnit AND e.asset = :asset AND e.addressType = :addressType AND e.streetType = :streetType AND e.zipCode LIKE CONCAT('%',:zipCode,'%') AND e.street LIKE CONCAT('%',:street,'%') AND e.house LIKE CONCAT('%',:house,'%') AND e.apartment LIKE CONCAT('%',:apartment,'%') ) AND e.status=:status ";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
