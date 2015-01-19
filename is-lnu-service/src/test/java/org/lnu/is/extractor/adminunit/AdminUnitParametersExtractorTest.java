package org.lnu.is.extractor.adminunit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.adminunit.type.AdminUnitType;
import org.lnu.is.domain.common.RowStatus;
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
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
