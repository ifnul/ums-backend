package org.lnu.is.converter.person.address;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.address.type.AddressType;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.address.PersonAddress;
import org.lnu.is.domain.street.type.StreetType;
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
		
		PersonAddress source = new PersonAddress();
		source.setZipCode(zipCode);
		source.setStreet(street);
		source.setApartment(apartment);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setHouse(house);
		source.setId(id);
		
		PersonAddressResource expected = new PersonAddressResource();
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
	
	@Test
	public void testConvertAll() throws Exception {

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
		
		String zipCode1 = "zip cide1";
		String street1 = "street1";
		String apartment1 = "apartment1";
		Date begDate1 = new Date();
		Date endDate1 = new Date();
		Long id1 = 3L;
		String house1 = "house1";
		
		PersonAddress source1 = new PersonAddress();
		source1.setZipCode(zipCode1);
		source1.setStreet(street1);
		source1.setApartment(apartment1);
		source1.setBegDate(begDate1);
		source1.setEndDate(endDate1);
		source1.setHouse(house1);
		source1.setId(id1);
		
		PersonAddressResource expected1 = new PersonAddressResource();
		expected1.setZipCode(zipCode1);
		expected1.setStreet(street1);
		expected1.setApartment(apartment1);
		expected1.setBegDate(begDate1);
		expected1.setEndDate(endDate1);
		expected1.setHouse(house1);
		expected1.setId(id1);
		
		List<PersonAddress> sources = Arrays.asList(source,source1);
		
		List<PersonAddressResource> expecteds = Arrays.asList(expected,expected1);
		// When
		List<PersonAddressResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
