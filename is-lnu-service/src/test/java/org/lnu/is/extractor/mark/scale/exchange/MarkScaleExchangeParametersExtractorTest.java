package org.lnu.is.extractor.mark.scale.exchange;

import static org.junit.Assert.assertEquals;
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
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.exchange.MarkScaleExchange;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.extractor.mark.scale.exchange.MarkScaleExchangeParametersExtractor;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MarkScaleExchangeParametersExtractorTest {

	@Mock(name = "markScaleDao")
	private Dao<MarkScale, MarkScale, Long> markScaleDao;
	
	@Mock(name = "markScaleValueDao")
	private Dao<MarkScaleValue, MarkScaleValue, Long> markScaleValueDao;
	
	@InjectMocks
	private MarkScaleExchangeParametersExtractor unit;

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
		Double markMin = 0.0;
		Double markMax = 10.0;
		Double markExchange = 5.0;
		//String note = "note";
		Long markScaleId = 1L;
		Long markScaleValueId = 1L;
		Long markScaleExchangeId = 2L;
		Long markScaleExchangeValueId = 2L;

		MarkScale markScale = new MarkScale();
		markScale.setId(markScaleId);
		
		MarkScaleValue markScaleValue = new MarkScaleValue();
		markScaleValue.setId(markScaleValueId);
		
		MarkScale markScaleExchange = new MarkScale();
		markScaleExchange.setId(markScaleExchangeId);
		
		MarkScaleValue markScaleExchangeValue = new MarkScaleValue();
		markScaleExchangeValue.setId(markScaleExchangeValueId);
		
		MarkScaleExchange entity = new MarkScaleExchange();
		entity.setMarkMin(markMin);
		entity.setMarkMax(markMax);
		entity.setMarkExchange(markExchange);
		//entity.setNote(note);
		entity.setMarkScale(markScale);
		entity.setMarkScaleValue(markScaleValue);
		entity.setMarkScaleExchange(markScaleExchange);
		entity.setMarkScaleExchangeValue(markScaleExchangeValue);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("markMin", markMin);
		expected.put("markMax", markMax);
		expected.put("markExchange", markExchange);
		//expected.put("note", note);
		expected.put("markScale", markScale);
		expected.put("markScaleValue", markScaleValue);
		expected.put("markScaleExchange", markScaleExchange);
		expected.put("markScaleExchangeValue", markScaleExchangeValue);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
	
		// When
		when(markScaleDao.getEntityById(markScaleId)).thenReturn(markScale);
		when(markScaleDao.getEntityById(markScaleExchangeId)).thenReturn(markScaleExchange);
		when(markScaleValueDao.getEntityById(markScaleValueId)).thenReturn(markScaleValue);
		when(markScaleValueDao.getEntityById(markScaleExchangeValueId)).thenReturn(markScaleExchangeValue);
	
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(markScaleDao).getEntityById(markScaleId);
		verify(markScaleDao).getEntityById(markScaleExchangeId);
		verify(markScaleValueDao).getEntityById(markScaleValueId);
		verify(markScaleValueDao).getEntityById(markScaleExchangeValueId);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Double markMin = 0.0;
		Double markMax = 10.0;
		Double markExchange = 5.0;
		//String note = "note";

		MarkScale markScale = new MarkScale();
		markScale.setId(1L);
		
		MarkScaleValue markScaleValue = new MarkScaleValue();
		markScaleValue.setId(1L);
		
		MarkScale markScaleExchange = new MarkScale();
		markScaleExchange.setId(2L);
		
		MarkScaleValue markScaleExchangeValue = new MarkScaleValue();
		markScaleExchangeValue.setId(2L);
		
		MarkScaleExchange entity = new MarkScaleExchange();
		entity.setMarkMin(markMin);
		entity.setMarkMax(markMax);
		entity.setMarkExchange(markExchange);
		//entity.setNote(note);
		entity.setMarkScale(markScale);
		entity.setMarkScaleValue(markScaleValue);
		entity.setMarkScaleExchange(markScaleExchange);
		entity.setMarkScaleExchangeValue(markScaleExchangeValue);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("markMin", markMin);
		expected.put("markMax", markMax);
		expected.put("markExchange", markExchange);
		//expected.put("note", note);
		expected.put("markScale", markScale);
		expected.put("markScaleValue", markScaleValue);
		expected.put("markScaleExchange", markScaleExchange);
		expected.put("markScaleExchangeValue", markScaleExchangeValue);
		
		// When
		when(markScaleDao.getEntityById(1l)).thenReturn(markScale);
		when(markScaleDao.getEntityById(2l)).thenReturn(markScaleExchange);
		when(markScaleValueDao.getEntityById(1l)).thenReturn(markScaleValue);
		when(markScaleValueDao.getEntityById(2l)).thenReturn(markScaleExchangeValue);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(markScaleDao).getEntityById(1L);
		verify(markScaleDao).getEntityById(2L);
		verify(markScaleValueDao).getEntityById(1L);
		verify(markScaleValueDao).getEntityById(2L);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		MarkScaleExchange entity = new MarkScaleExchange();
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
		
		MarkScaleExchange entity = new MarkScaleExchange();
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
		
		MarkScaleExchange entity = new MarkScaleExchange();
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
		
		MarkScaleExchange entity = new MarkScaleExchange();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
