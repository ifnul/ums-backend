package org.lnu.is.converter.asset.address;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.address.type.AddressType;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.address.AssetAddress;
import org.lnu.is.domain.street.type.StreetType;
import org.lnu.is.resource.asset.address.AssetAddressResource;

public class AssetAddressResourceConverterTest {

	private AssetAddressResourceConverter unit = new AssetAddressResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long adminUnitId = 1L;
		AdminUnit adminUnit = new AdminUnit();
		adminUnit.setId(adminUnitId);
		
		Long assetId = 2L;
		Asset asset = new Asset();
		asset.setId(assetId);
		
		
		Long addressTypeId = 3L;
		AddressType addressType = new AddressType();
		addressType.setId(addressTypeId);
		
		Long streetTypeId = 4L;
		StreetType streetType = new StreetType();
		streetType.setId(streetTypeId);
		
		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "apartment";

		AssetAddressResource source = new AssetAddressResource();
		source.setAdminUnitId(adminUnitId);
		source.setAssetId(assetId);
		source.setAddressTypeId(addressTypeId);
		source.setStreetTypeId(streetTypeId);
		source.setZipCode(zipCode);
		source.setStreet(street);
		source.setHouse(house);
		source.setApartment(apartment);

		AssetAddress expected = new AssetAddress();
		expected.setAdminUnit(adminUnit);
		expected.setAsset(asset);
		expected.setAddressType(addressType);
		expected.setStreetType(streetType);
		expected.setZipCode(zipCode);
		expected.setStreet(street);
		expected.setHouse(house);
		expected.setApartment(apartment);
		
		// When
		AssetAddress actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long adminUnitId = 1L;
		AdminUnit adminUnit = new AdminUnit();
		adminUnit.setId(adminUnitId);
		
		Long assetId = 2L;
		Asset asset = new Asset();
		asset.setId(assetId);
		
		
		Long addressTypeId = 3L;
		AddressType addressType = new AddressType();
		addressType.setId(addressTypeId);
		
		Long streetTypeId = 4L;
		StreetType streetType = new StreetType();
		streetType.setId(streetTypeId);
		
		String zipCode = "zip code";
		String street = "street";
		String house = "house";
		String apartment = "apartment";
		
		AssetAddressResource source = new AssetAddressResource();
		source.setAdminUnitId(adminUnitId);
		source.setAssetId(assetId);
		source.setAddressTypeId(addressTypeId);
		source.setStreetTypeId(streetTypeId);
		source.setZipCode(zipCode);
		source.setStreet(street);
		source.setHouse(house);
		source.setApartment(apartment);
		List<AssetAddressResource> sources = Arrays.asList(source);
		
		AssetAddress expected = new AssetAddress();
		expected.setAdminUnit(adminUnit);
		expected.setAsset(asset);
		expected.setAddressType(addressType);
		expected.setStreetType(streetType);
		expected.setZipCode(zipCode);
		expected.setStreet(street);
		expected.setHouse(house);
		expected.setApartment(apartment);
		List<AssetAddress> expecteds = Arrays.asList(expected);
		
		// When
		List<AssetAddress> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		AssetAddressResource source = new AssetAddressResource();
		AssetAddress expected = new AssetAddress();
		
		// When
		AssetAddress actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertALlWithEmptyFields() throws Exception {
		// Given
		List<AssetAddressResource> sources = Collections.emptyList();
		List<AssetAddress> expecteds = Collections.emptyList();
		// When
		List<AssetAddress> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
