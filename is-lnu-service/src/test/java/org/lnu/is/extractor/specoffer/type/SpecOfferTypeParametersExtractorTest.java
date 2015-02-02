package org.lnu.is.extractor.specoffer.type;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferTypeParametersExtractorTest {
	
	@Mock
	private SessionService sessionService;
	
	@Mock
	private Dao<TimePeriod, Long> timePeriodDao;
	
	@InjectMocks
	private SpecOfferTypeParametersExtractor unit;

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
		Long specialTypeId = 2L;
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setId(specialTypeId);
		String name = "name";
		String abbrName = "abbr name";
		
		SpecOfferType entity = new SpecOfferType();
		entity.setTimePeriod(timePeriod);
		entity.setName(name);
		entity.setAbbrName(abbrName);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("abbrName", abbrName);
		expected.put("timePeriod", timePeriod);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(timePeriodDao.getEntityById(anyLong())).thenReturn(timePeriod);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long timePeriodId = 2L;
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setId(timePeriodId);
		String name = "name";
		String abbrName = "abbr name";
		
		SpecOfferType entity = new SpecOfferType();
		entity.setTimePeriod(timePeriod);
		entity.setName(name);
		entity.setAbbrName(abbrName);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("abbrName", abbrName);
		expected.put("timePeriod", timePeriod);
		
		// When
		when(timePeriodDao.getEntityById(anyLong())).thenReturn(timePeriod);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		SpecOfferType entity = new SpecOfferType();
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
		
		SpecOfferType entity = new SpecOfferType();
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
		
		SpecOfferType entity = new SpecOfferType();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		SpecOfferType entity = new SpecOfferType();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
