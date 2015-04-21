package org.lnu.is.extractor.mark.scale;

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
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.type.MarkScaleType;
import org.lnu.is.extractor.mark.scale.MarkScaleParametersExtractor;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MarkScaleParametersExtractorTest {

	@Mock(name = "markScaleTypeDao")
	private Dao<MarkScaleType, Long> markScaleTypeDao;
	
	@InjectMocks
	private MarkScaleParametersExtractor unit;

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
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;;

		MarkScaleType markscaleType = new MarkScaleType();
		markscaleType.setId(1L);
		
		MarkScale entity = new MarkScale();
		entity.setAbbrName(abbrName);
		entity.setName(name);
		entity.setMarkMin(markMin);
		entity.setMarkMax(markMax);
		entity.setMarkScaleType(markscaleType);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("abbrName", abbrName);
		expected.put("name", name);
		expected.put("markMin", markMin);
		expected.put("markMax", markMax);
		expected.put("markScaleType", markscaleType);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(markScaleTypeDao.getEntityById(anyLong())).thenReturn(markscaleType);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;;

		MarkScaleType markscaleType = new MarkScaleType();
		markscaleType.setId(1L);
		
		MarkScale entity = new MarkScale();
		entity.setAbbrName(abbrName);
		entity.setName(name);
		entity.setMarkMin(markMin);
		entity.setMarkMax(markMax);
		entity.setMarkScaleType(markscaleType);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("abbrName", abbrName);
		expected.put("name", name);
		expected.put("markMin", markMin);
		expected.put("markMax", markMax);
		expected.put("markScaleType", markscaleType);
		
		// When
		when(markScaleTypeDao.getEntityById(anyLong())).thenReturn(markscaleType);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		MarkScale entity = new MarkScale();
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
		
		MarkScale entity = new MarkScale();
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
		
		MarkScale entity = new MarkScale();
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
		
		MarkScale entity = new MarkScale();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
