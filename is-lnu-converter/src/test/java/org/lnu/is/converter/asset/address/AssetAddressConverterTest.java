package org.lnu.is.converter.asset.address;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.address.AssetAddress;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.resource.asset.address.AssetAddressResource;

public class AssetAddressConverterTest {

	private AssetAddressConverter unit = new AssetAddressConverter();
	
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

		AssetAddressResource expected = new AssetAddressResource();
		expected.setAdminUnitId(adminUnitId);
		expected.setAssetId(assetId);
		expected.setAddressTypeId(addressTypeId);
		expected.setStreetTypeId(streetTypeId);
		expected.setZipCode(zipCode);
		expected.setStreet(street);
		expected.setHouse(house);
		expected.setApartment(apartment);

		AssetAddress source = new AssetAddress();
		source.setAdminUnit(adminUnit);
		source.setAsset(asset);
		source.setAddressType(addressType);
		source.setStreetType(streetType);
		source.setZipCode(zipCode);
		source.setStreet(street);
		source.setHouse(house);
		source.setApartment(apartment);
		
		// When
		AssetAddressResource actual = unit.convert(source);

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
		
		AssetAddressResource expected = new AssetAddressResource();
		expected.setAdminUnitId(adminUnitId);
		expected.setAssetId(assetId);
		expected.setAddressTypeId(addressTypeId);
		expected.setStreetTypeId(streetTypeId);
		expected.setZipCode(zipCode);
		expected.setStreet(street);
		expected.setHouse(house);
		expected.setApartment(apartment);
		List<AssetAddressResource> expecteds = Arrays.asList(expected);
		
		AssetAddress source = new AssetAddress();
		source.setAdminUnit(adminUnit);
		source.setAsset(asset);
		source.setAddressType(addressType);
		source.setStreetType(streetType);
		source.setZipCode(zipCode);
		source.setStreet(street);
		source.setHouse(house);
		source.setApartment(apartment);
		List<AssetAddress> sources = Arrays.asList(source);
		
		// When
		List<AssetAddressResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		AssetAddressResource expected = new AssetAddressResource();
		AssetAddress source = new AssetAddress();
		
		// When
		AssetAddressResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertALlWithEmptyFields() throws Exception {
		// Given
		List<AssetAddressResource> expecteds = Collections.emptyList();
		List<AssetAddress> sources = Collections.emptyList();
		// When
		List<AssetAddressResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
