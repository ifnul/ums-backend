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


public class PersonAddressConverterTest {

	private PersonAddressConverter unit = new PersonAddressConverter();
	
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
		
		PersonAddress source = new PersonAddress();
		source.setAddressType(addressType);
		source.setAdminUnit(adminUnit);
		source.setAsset(asset);
		source.setPerson(person);
		source.setStreetType(streetType);
		source.setZipCode(zipCode);
		source.setStreet(street);
		source.setApartment(apartment);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setHouse(house);
		source.setId(id);

		PersonAddressResource expected = new PersonAddressResource();
		expected.setAddressTypeId(addressTypeId);
		expected.setAdminUnitId(adminUnitId);
		expected.setAssetId(assetId);
		expected.setPersonId(personId);
		expected.setStreetTypeId(streetTypeId);
		expected.setZipCode(zipCode);
		expected.setStreet(street);
		expected.setApartment(apartment);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setHouse(house);
		expected.setId(id);
		
		// When
		PersonAddressResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
