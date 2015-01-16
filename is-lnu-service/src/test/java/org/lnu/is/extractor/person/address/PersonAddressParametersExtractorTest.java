package org.lnu.is.extractor.person.address;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.domain.streettype.StreetType;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonAddressParametersExtractorTest {

	@Mock
	private Dao<Person, Long> personDao;
	
	@Mock
	private Dao<AddressType, Long> addressTypeDao;
	
	@Mock
	private Dao<AdminUnit, Long> adminUnitDao;
	
	@Mock
	private Dao<StreetType, Long> streetTypeDao;
	
	@Mock
	private Dao<Asset, Long> assetDao;
	
	@InjectMocks
	private PersonAddressParametersExtractor unit;
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		String zipCode = "zip code";
		String street = "street";
		String house = "house 1";
		String apartment = "appartment 1";
		Date begDate = new Date();
		Date endDate = new Date();

		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long addressTypeId = 2L;
		AddressType addressType = new AddressType();
		addressType.setId(addressTypeId);
		
		Long adminUnitId = 3L;
		AdminUnit adminUnit = new AdminUnit();
		adminUnit.setId(adminUnitId);
		
		Long streetTypeId = 4L;
		StreetType streetType = new StreetType();
		streetType.setId(streetTypeId);
		
		Long assetId = 5L;
		Asset asset = new Asset();
		asset.setId(assetId);

		PersonAddress entity = new PersonAddress();
		entity.setPerson(person);
		entity.setAddressType(addressType);
		entity.setAdminUnit(adminUnit);
		entity.setStreetType(streetType);
		entity.setAsset(asset);
		
		entity.setZipCode(zipCode);
		entity.setStreet(street);
		entity.setHouse(house);
		entity.setApartment(apartment);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("addressType", addressType);
		expected.put("adminUnit", adminUnit);
		expected.put("streetType", streetType);
		expected.put("asset", asset);
		expected.put("zipCode", zipCode);
		expected.put("street", street);
		expected.put("house", house);
		expected.put("apartment", apartment);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		
		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(addressTypeDao.getEntityById(anyLong())).thenReturn(addressType);
		when(adminUnitDao.getEntityById(anyLong())).thenReturn(adminUnit);
		when(streetTypeDao.getEntityById(anyLong())).thenReturn(streetType);
		when(assetDao.getEntityById(anyLong())).thenReturn(asset);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(personDao).getEntityById(personId);
		verify(addressTypeDao).getEntityById(addressTypeId);
		verify(adminUnitDao).getEntityById(adminUnitId);
		verify(streetTypeDao).getEntityById(streetTypeId);
		verify(assetDao).getEntityById(assetId);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		PersonAddress entity = new PersonAddress();
		
		Map<String, Object> expected = Collections.emptyMap();
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
