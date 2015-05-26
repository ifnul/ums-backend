package org.lnu.is.extractor.mark.scale.value;

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
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.extractor.mark.scale.value.MarkScaleValueParametersExtractor;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MarkScaleValueParametersExtractorTest {

	@Mock(name = "markScaleDao")
	private Dao<MarkScale, Long> markScaleDao;
	
	@InjectMocks
	private MarkScaleValueParametersExtractor unit;

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
		String strValue = "strValue";

		MarkScale markScale = new MarkScale();
		markScale.setId(1L);
		
		MarkScaleValue entity = new MarkScaleValue();
		entity.setStrValue(strValue);
		entity.setMarkScale(markScale);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("strValue", strValue);
		expected.put("markScale", markScale);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(markScaleDao.getEntityById(anyLong())).thenReturn(markScale);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String strValue = "strValue";

		MarkScale markScale = new MarkScale();
		markScale.setId(1L);
		
		MarkScaleValue entity = new MarkScaleValue();
		entity.setStrValue(strValue);
		entity.setMarkScale(markScale);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("strValue", strValue);
		expected.put("markScale", markScale);
		
		// When
		when(markScaleDao.getEntityById(anyLong())).thenReturn(markScale);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		MarkScaleValue entity = new MarkScaleValue();
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
		
		MarkScaleValue entity = new MarkScaleValue();
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
		
		MarkScaleValue entity = new MarkScaleValue();
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
		
		MarkScaleValue entity = new MarkScaleValue();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
