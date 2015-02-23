package org.lnu.is.extractor.markscale.exchange;

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
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.exchange.MarkscaleExchange;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MarkscaleExchangeParametersExtractorTest {

	@Mock(name = "markscaleDao")
	private Dao<Markscale, Long> markscaleDao;
	
	@Mock(name = "markscaleValueDao")
	private Dao<MarkscaleValue, Long> markscaleValueDao;
	
	@InjectMocks
	private MarkscaleExchangeParametersExtractor unit;

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
		Long markscaleId = 1L;
		Long markscaleValueId = 1L;
		Long markscaleExchangeId = 2L;
		Long markscaleExchangeValueId = 2L;

		Markscale markscale = new Markscale();
		markscale.setId(markscaleId);
		
		MarkscaleValue markscaleValue = new MarkscaleValue();
		markscaleValue.setId(markscaleValueId);
		
		Markscale markscaleExchange = new Markscale();
		markscaleExchange.setId(markscaleExchangeId);
		
		MarkscaleValue markscaleExchangeValue = new MarkscaleValue();
		markscaleExchangeValue.setId(markscaleExchangeValueId);
		
		MarkscaleExchange entity = new MarkscaleExchange();
		entity.setMarkMin(markMin);
		entity.setMarkMax(markMax);
		entity.setMarkExchange(markExchange);
		//entity.setNote(note);
		entity.setMarkscale(markscale);
		entity.setMarkscaleValue(markscaleValue);
		entity.setMarkscaleExchange(markscaleExchange);
		entity.setMarkscaleExchangeValue(markscaleExchangeValue);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("markMin", markMin);
		expected.put("markMax", markMax);
		expected.put("markExchange", markExchange);
		//expected.put("note", note);
		expected.put("markscale", markscale);
		expected.put("markscaleValue", markscaleValue);
		expected.put("markscaleExchange", markscaleExchange);
		expected.put("markscaleExchangeValue", markscaleExchangeValue);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
	
		// When
		when(markscaleDao.getEntityById(markscaleId)).thenReturn(markscale);
		when(markscaleDao.getEntityById(markscaleExchangeId)).thenReturn(markscaleExchange);
		when(markscaleValueDao.getEntityById(markscaleValueId)).thenReturn(markscaleValue);
		when(markscaleValueDao.getEntityById(markscaleExchangeValueId)).thenReturn(markscaleExchangeValue);
	
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(markscaleDao).getEntityById(markscaleId);
		verify(markscaleDao).getEntityById(markscaleExchangeId);
		verify(markscaleValueDao).getEntityById(markscaleValueId);
		verify(markscaleValueDao).getEntityById(markscaleExchangeValueId);
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

		Markscale markscale = new Markscale();
		markscale.setId(1L);
		
		MarkscaleValue markscaleValue = new MarkscaleValue();
		markscaleValue.setId(1L);
		
		Markscale markscaleExchange = new Markscale();
		markscaleExchange.setId(2L);
		
		MarkscaleValue markscaleExchangeValue = new MarkscaleValue();
		markscaleExchangeValue.setId(2L);
		
		MarkscaleExchange entity = new MarkscaleExchange();
		entity.setMarkMin(markMin);
		entity.setMarkMax(markMax);
		entity.setMarkExchange(markExchange);
		//entity.setNote(note);
		entity.setMarkscale(markscale);
		entity.setMarkscaleValue(markscaleValue);
		entity.setMarkscaleExchange(markscaleExchange);
		entity.setMarkscaleExchangeValue(markscaleExchangeValue);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("markMin", markMin);
		expected.put("markMax", markMax);
		expected.put("markExchange", markExchange);
		//expected.put("note", note);
		expected.put("markscale", markscale);
		expected.put("markscaleValue", markscaleValue);
		expected.put("markscaleExchange", markscaleExchange);
		expected.put("markscaleExchangeValue", markscaleExchangeValue);
		
		// When
		when(markscaleDao.getEntityById(1l)).thenReturn(markscale);
		when(markscaleDao.getEntityById(2l)).thenReturn(markscaleExchange);
		when(markscaleValueDao.getEntityById(1l)).thenReturn(markscaleValue);
		when(markscaleValueDao.getEntityById(2l)).thenReturn(markscaleExchangeValue);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(markscaleDao).getEntityById(1L);
		verify(markscaleDao).getEntityById(2L);
		verify(markscaleValueDao).getEntityById(1L);
		verify(markscaleValueDao).getEntityById(2L);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		MarkscaleExchange entity = new MarkscaleExchange();
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
		
		MarkscaleExchange entity = new MarkscaleExchange();
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
		
		MarkscaleExchange entity = new MarkscaleExchange();
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
		
		MarkscaleExchange entity = new MarkscaleExchange();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
