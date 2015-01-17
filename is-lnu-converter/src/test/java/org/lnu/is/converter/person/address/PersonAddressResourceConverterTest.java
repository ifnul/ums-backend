package org.lnu.is.converter.person.address;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.resource.person.address.PersonAddressResource;


public class PersonAddressResourceConverterTest {

	private PersonAddressResourceConverter unit = new PersonAddressResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long addressTypeId = 1L;
		AddressType addressType = new AddressType();
		addressType.setId(addressTypeId);
		
		Long adminUnitId = 2L;
		AdminUnit adminUnit = new AdminUnit();
		adminUnit.setId(adminUnitId);

		Long assetId = 3L;
		Asset asset = new Asset();
		asset.setId(assetId);
		
		Long personId = 4L;
		Person person = new Person();
		person.setId(personId);

		Long streetTypeId = 5L;
		StreetType streetType = new StreetType();
		streetType.setId(streetTypeId);
		String zipCode = "zip cide";
		String street = "street";
		String apartment = "apartment";
		Date begDate = new Date();
		Date endDate = new Date();
		Long id = 2L;
		String house = "house";
		
		PersonAddress expected = new PersonAddress();
		expected.setAddressType(addressType);
		expected.setAdminUnit(adminUnit);
		expected.setAsset(asset);
		expected.setPerson(person);
		expected.setStreetType(streetType);
		expected.setZipCode(zipCode);
		expected.setStreet(street);
		expected.setApartment(apartment);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setHouse(house);
		expected.setId(id);

		PersonAddressResource source = new PersonAddressResource();
		source.setAddressTypeId(addressTypeId);
		source.setAdminUnitId(adminUnitId);
		source.setAssetId(assetId);
		source.setPersonId(personId);
		source.setStreetTypeId(streetTypeId);
		source.setZipCode(zipCode);
		source.setStreet(street);
		source.setApartment(apartment);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setHouse(house);
		source.setId(id);
		
		// When
		PersonAddress actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String zipCode = "zip cide";
		String street = "street";
		String apartment = "apartment";
		Date begDate = new Date();
		Date endDate = new Date();
		Long id = 2L;
		String house = "house";
		
		PersonAddress expected = new PersonAddress();
		expected.setZipCode(zipCode);
		expected.setStreet(street);
		expected.setApartment(apartment);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setHouse(house);
		expected.setId(id);
		
		PersonAddressResource source = new PersonAddressResource();
		source.setZipCode(zipCode);
		source.setStreet(street);
		source.setApartment(apartment);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setHouse(house);
		source.setId(id);
		
		// When
		PersonAddress actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
