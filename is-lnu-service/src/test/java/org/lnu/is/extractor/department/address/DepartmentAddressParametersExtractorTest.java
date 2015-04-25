package org.lnu.is.extractor.department.address;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
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
import org.lnu.is.dao.exception.EntityNotFoundException;
import org.lnu.is.domain.address.type.AddressType;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.address.DepartmentAddress;
import org.lnu.is.domain.street.type.StreetType;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DepartmentAddressParametersExtractorTest {

	@Mock
	private Dao<Department, Department, Long> departmentDao;

	@Mock
	private Dao<AddressType, AddressType, Long> addressTypeDao;

	@Mock
	private Dao<AdminUnit, AdminUnit, Long> adminUnitDao;

	@Mock
	private Dao<StreetType, StreetType, Long> streetTypeDao;
	
	@InjectMocks
	private DepartmentAddressParametersExtractor unit;

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
		String zipCode = "zip code";
		String street = "Street";
		String apartment = "apartment";
		String house = "house";
		
		Long departmentId = 1L;
		Department department = new Department();
		department.setId(departmentId);
		
		Long addressTypeId = 2L;
		AddressType addressType = new AddressType();
		addressType.setId(addressTypeId);
		
		Long adminUnitId = 3L;
		AdminUnit adminUnit = new AdminUnit();
		adminUnit.setId(adminUnitId);
		
		Long streetTypeId = 4L;
		StreetType streetType = new StreetType();
		streetType.setId(streetTypeId);
		
		DepartmentAddress entity = new DepartmentAddress();
		entity.setDepartment(department);
		entity.setAddressType(addressType);
		entity.setAdminUnit(adminUnit);
		entity.setStreetType(streetType);
		entity.setZipCode(zipCode);
		entity.setStreet(street);
		entity.setHouse(house);
		entity.setApartment(apartment);
		
		Map<String, Object> expected = new HashMap<>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		expected.put("department", department);
		expected.put("addressType", addressType);
		expected.put("streetType", streetType);
		expected.put("adminUnit", adminUnit);
		expected.put("zipCode", zipCode);
		expected.put("street", street);
		expected.put("house", house);
		expected.put("apartment", apartment);
		
		// When
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(addressTypeDao.getEntityById(anyLong())).thenReturn(addressType);
		when(adminUnitDao.getEntityById(anyLong())).thenReturn(adminUnit);
		when(streetTypeDao.getEntityById(anyLong())).thenReturn(streetType);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(departmentDao).getEntityById(departmentId);
		verify(addressTypeDao).getEntityById(addressTypeId);
		verify(adminUnitDao).getEntityById(adminUnitId);
		verify(streetTypeDao).getEntityById(streetTypeId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithEmptyParameters() throws Exception {
		// Given
		
		DepartmentAddress entity = new DepartmentAddress();
		
		Map<String, Object> expected = new HashMap<>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test(expected = EntityNotFoundException.class)
	public void testGetParametersWithException() throws Exception {
		// Given
		String zipCode = "zip code";
		String street = "Street";
		String apartment = "apartment";
		String house = "house";
		
		Long departmentId = 1L;
		Department department = new Department();
		department.setId(departmentId);
		
		DepartmentAddress entity = new DepartmentAddress();
		entity.setDepartment(department);
		entity.setZipCode(zipCode);
		entity.setStreet(street);
		entity.setHouse(house);
		entity.setApartment(apartment);
		
		// When
		doThrow(EntityNotFoundException.class).when(departmentDao).getEntityById(anyLong());
		unit.getParameters(entity);
		
		// Then
		verify(departmentDao).getEntityById(departmentId);
	}
}
