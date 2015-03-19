package org.lnu.is.dao.builder.asset.address;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.address.AssetAddress;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.pagination.MultiplePagedSearch;

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

		String expected = "SELECT e FROM AssetAddress e WHERE ( e.adminUnit = :adminUnit OR e.asset = :asset OR e.addressType = :addressType OR e.streetType = :streetType OR e.zipCode LIKE CONCAT('%',:zipCode,'%') OR e.street LIKE CONCAT('%',:street,'%') OR e.house LIKE CONCAT('%',:house,'%') OR e.apartment LIKE CONCAT('%',:apartment,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
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
		
		String expected = "SELECT e FROM AssetAddress e WHERE ( e.adminUnit = :adminUnit OR e.asset = :asset OR e.addressType = :addressType OR e.streetType = :streetType OR e.zipCode LIKE CONCAT('%',:zipCode,'%') OR e.street LIKE CONCAT('%',:street,'%') OR e.house LIKE CONCAT('%',:house,'%') OR e.apartment LIKE CONCAT('%',:apartment,'%') ) ";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
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
		
		String expected = "SELECT e FROM AssetAddress e WHERE ( e.adminUnit = :adminUnit OR e.asset = :asset OR e.addressType = :addressType OR e.streetType = :streetType OR e.zipCode LIKE CONCAT('%',:zipCode,'%') OR e.street LIKE CONCAT('%',:street,'%') OR e.house LIKE CONCAT('%',:house,'%') OR e.apartment LIKE CONCAT('%',:apartment,'%') ) AND e.crtUserGroup IN (:userGroups) ";
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
		
		String expected = "SELECT e FROM AssetAddress e WHERE ( e.adminUnit = :adminUnit OR e.asset = :asset OR e.addressType = :addressType OR e.streetType = :streetType OR e.zipCode LIKE CONCAT('%',:zipCode,'%') OR e.street LIKE CONCAT('%',:street,'%') OR e.house LIKE CONCAT('%',:house,'%') OR e.apartment LIKE CONCAT('%',:apartment,'%') ) AND e.status=:status ";
		MultiplePagedSearch<AssetAddress> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
