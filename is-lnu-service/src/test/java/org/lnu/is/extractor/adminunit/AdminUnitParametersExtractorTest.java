package org.lnu.is.extractor.adminunit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.adminunit.type.AdminUnitType;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AdminUnitParametersExtractorTest {

	@Mock
	private Dao<AdminUnitType, Long> adminUnitTypeDao;
	
	@Mock
	private Dao<AdminUnit, Long> adminUnitDao;
	
	@InjectMocks
	private AdminUnitParametersExtractor unit;

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
		Long adminUnitTypeId = 1L;
		AdminUnitType adminUnitType = new AdminUnitType();
		adminUnitType.setId(adminUnitTypeId);
		
		String identifier = "identifier";
		String identifier1 = "identifier1";
		String identifier2 = "identifier2";
		String identifier3 = "identifier3";
		String name = "name";
		Date begDate = new Date();
		Date endDate = new Date();
		
		AdminUnit entity = new AdminUnit();
		entity.setAdminUnitType(adminUnitType);
		entity.setIdentifier(identifier);
		entity.setIdentifier1(identifier1);
		entity.setIdentifier2(identifier2);
		entity.setIdentifier3(identifier3);
		entity.setName(name);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("adminUnitType", adminUnitType);
		expected.put("identifier", identifier);
		expected.put("identifier1", identifier1);
		expected.put("identifier2", identifier2);
		expected.put("identifier3", identifier3);
		expected.put("name", name);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(adminUnitTypeDao.getEntityById(anyLong())).thenReturn(adminUnitType);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDEfaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long adminUnitTypeId = 1L;
		AdminUnitType adminUnitType = new AdminUnitType();
		adminUnitType.setId(adminUnitTypeId);
		
		String identifier = "identifier";
		String identifier1 = "identifier1";
		String identifier2 = "identifier2";
		String identifier3 = "identifier3";
		String name = "name";
		Date begDate = new Date();
		Date endDate = new Date();
		
		AdminUnit entity = new AdminUnit();
		entity.setAdminUnitType(adminUnitType);
		entity.setIdentifier(identifier);
		entity.setIdentifier1(identifier1);
		entity.setIdentifier2(identifier2);
		entity.setIdentifier3(identifier3);
		entity.setName(name);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("adminUnitType", adminUnitType);
		expected.put("identifier", identifier);
		expected.put("identifier1", identifier1);
		expected.put("identifier2", identifier2);
		expected.put("identifier3", identifier3);
		expected.put("name", name);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		
		// When
		when(adminUnitTypeDao.getEntityById(anyLong())).thenReturn(adminUnitType);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		AdminUnit entity = new AdminUnit();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledSecurity() throws Exception {
		// Given
		unit.setSecurity(false);
		
		AdminUnit entity = new AdminUnit();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledStatus() throws Exception {
		// Given
		unit.setActive(false);
		
		AdminUnit entity = new AdminUnit();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledDEfaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		AdminUnit entity = new AdminUnit();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
