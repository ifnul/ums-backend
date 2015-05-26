package org.lnu.is.extractor.publicactivity;

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
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.publicactivity.PublicActivity;
import org.lnu.is.domain.publicactivity.PublicActivityType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PublicActivityParametersExtractorTest {

	@Mock
	private Dao<PublicActivityType, Long> publicActivityTypeDao;

	@Mock
	private Dao<TimePeriod, Long> timePeriodDao;
	
	@Mock
	private SessionService sessionService;
	
	@InjectMocks
	private PublicActivityParametersExtractor unit;

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
		Long publicActiveTypeId = 1L;
		PublicActivityType publicActiveType = new PublicActivityType();
		publicActiveType.setId(publicActiveTypeId);
		
		Long timePeriodId = 2L;
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setId(timePeriodId);

		String name = "name";
		Date begDate = new Date();
		Date endDate = new Date();

		PublicActivity entity = new PublicActivity();
		entity.setPublicActivityType(publicActiveType);
		entity.setTimePeriod(timePeriod);
		entity.setName(name);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("publicActivityType", publicActiveType);
		expected.put("timePeriod", timePeriod);
		expected.put("name", name);
		expected.put("begDate", begDate);
		expected.put("endDate", begDate);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(publicActivityTypeDao.getEntityById(anyLong())).thenReturn(publicActiveType);
		when(timePeriodDao.getEntityById(anyLong())).thenReturn(timePeriod);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long publicActiveTypeId = 1L;
		PublicActivityType publicActiveType = new PublicActivityType();
		publicActiveType.setId(publicActiveTypeId);
		
		Long timePeriodId = 2L;
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setId(timePeriodId);

		String name = "name";
		Date begDate = new Date();
		Date endDate = new Date();

		PublicActivity entity = new PublicActivity();
		entity.setPublicActivityType(publicActiveType);
		entity.setTimePeriod(timePeriod);
		entity.setName(name);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("publicActivityType", publicActiveType);
		expected.put("timePeriod", timePeriod);
		expected.put("name", name);
		expected.put("begDate", begDate);
		expected.put("endDate", begDate);
		
		// When
		when(publicActivityTypeDao.getEntityById(anyLong())).thenReturn(publicActiveType);
		when(timePeriodDao.getEntityById(anyLong())).thenReturn(timePeriod);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		PublicActivity entity = new PublicActivity();
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
		
		PublicActivity entity = new PublicActivity();
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
		
		PublicActivity entity = new PublicActivity();
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
		
		PublicActivity entity = new PublicActivity();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}