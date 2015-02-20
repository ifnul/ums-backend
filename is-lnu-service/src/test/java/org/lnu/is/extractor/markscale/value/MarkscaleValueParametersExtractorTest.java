package org.lnu.is.extractor.markscale.value;

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
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MarkscaleValueParametersExtractorTest {

	@Mock(name = "markscaleDao")
	private Dao<Markscale, Long> markscaleDao;
	
	@InjectMocks
	private MarkscaleValueParametersExtractor unit;

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

		Markscale markscale = new Markscale();
		markscale.setId(1L);
		
		MarkscaleValue entity = new MarkscaleValue();
		entity.setStrValue(strValue);
		entity.setMarkscale(markscale);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("strValue", strValue);
		expected.put("markscale", markscale);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(markscaleDao.getEntityById(anyLong())).thenReturn(markscale);
		
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

		Markscale markscale = new Markscale();
		markscale.setId(1L);
		
		MarkscaleValue entity = new MarkscaleValue();
		entity.setStrValue(strValue);
		entity.setMarkscale(markscale);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("strValue", strValue);
		expected.put("markscale", markscale);
		
		// When
		when(markscaleDao.getEntityById(anyLong())).thenReturn(markscale);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		MarkscaleValue entity = new MarkscaleValue();
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
		
		MarkscaleValue entity = new MarkscaleValue();
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
		
		MarkscaleValue entity = new MarkscaleValue();
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
		
		MarkscaleValue entity = new MarkscaleValue();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
