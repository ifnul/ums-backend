package org.lnu.is.extractor.asset.address;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.address.type.AddressType;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.address.AssetAddress;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.street.type.StreetType;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AssetAddressParametersExtractorTest {

	@Mock
	private Dao<AdminUnit, AdminUnit, Long> adminUnitDao;

	@Mock
	private Dao<Asset, Asset, Long> assetDao;
	
	@Mock
	private Dao<AddressType, AddressType, Long> addressTypeDao;
	
	@Mock
	private Dao<StreetType, StreetType, Long> streetTypeDao;
	
	@InjectMocks
	private AssetAddressParametersExtractor unit;

	@Mock
	private SessionService sessionService;

	private Boolean active = true;
	private Boolean security = true;

	private String group1 = "developers";
	private String group2 = "students";
	
	private List<String> groups = Arrays.asList(group1, group2);
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
		
		when(sessionService.getGroups()).thenReturn(groups);
	}
	
	@Test
	public void testGetParameters() throws Exception {
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

		AssetAddress entity = new AssetAddress();
		entity.setAdminUnit(adminUnit);
		entity.setAsset(asset);
		entity.setAddressType(addressType);
		entity.setStreetType(streetType);
		entity.setZipCode(zipCode);
		entity.setStreet(street);
		entity.setHouse(house);
		entity.setApartment(apartment);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		expected.put("adminUnit", adminUnit);
		expected.put("asset", asset);
		expected.put("addressType", addressType);
		expected.put("streetType", streetType);
		expected.put("zipCode", zipCode);
		expected.put("street", street);
		expected.put("house", house);
		expected.put("apartment", apartment);
		
		// When
		when(adminUnitDao.getEntityById(anyLong())).thenReturn(adminUnit);
		when(assetDao.getEntityById(anyLong())).thenReturn(asset);
		when(addressTypeDao.getEntityById(anyLong())).thenReturn(addressType);
		when(streetTypeDao.getEntityById(anyLong())).thenReturn(streetType);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(adminUnitDao).getEntityById(adminUnitId);
		verify(assetDao).getEntityById(assetId);
		verify(addressTypeDao).getEntityById(addressTypeId);
		verify(streetTypeDao).getEntityById(streetTypeId);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledSecurity() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
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
		
		AssetAddress entity = new AssetAddress();
		entity.setAdminUnit(adminUnit);
		entity.setAsset(asset);
		entity.setAddressType(addressType);
		entity.setStreetType(streetType);
		entity.setZipCode(zipCode);
		entity.setStreet(street);
		entity.setHouse(house);
		entity.setApartment(apartment);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("adminUnit", adminUnit);
		expected.put("asset", asset);
		expected.put("addressType", addressType);
		expected.put("streetType", streetType);
		expected.put("zipCode", zipCode);
		expected.put("street", street);
		expected.put("house", house);
		expected.put("apartment", apartment);
		
		// When
		when(adminUnitDao.getEntityById(anyLong())).thenReturn(adminUnit);
		when(assetDao.getEntityById(anyLong())).thenReturn(asset);
		when(addressTypeDao.getEntityById(anyLong())).thenReturn(addressType);
		when(streetTypeDao.getEntityById(anyLong())).thenReturn(streetType);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(adminUnitDao).getEntityById(adminUnitId);
		verify(assetDao).getEntityById(assetId);
		verify(addressTypeDao).getEntityById(addressTypeId);
		verify(streetTypeDao).getEntityById(streetTypeId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithEmptyFields() throws Exception {
		// Given
		AssetAddress entity = new AssetAddress();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(adminUnitDao, times(0)).getEntityById(anyLong());
		verify(assetDao, times(0)).getEntityById(anyLong());
		verify(addressTypeDao, times(0)).getEntityById(anyLong());
		verify(streetTypeDao, times(0)).getEntityById(anyLong());
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithEmptyFieldsAnd() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AssetAddress entity = new AssetAddress();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(adminUnitDao, times(0)).getEntityById(anyLong());
		verify(assetDao, times(0)).getEntityById(anyLong());
		verify(addressTypeDao, times(0)).getEntityById(anyLong());
		verify(streetTypeDao, times(0)).getEntityById(anyLong());
		assertEquals(expected, actual);
	}
}
