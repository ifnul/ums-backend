package org.lnu.is.extractor.order.type;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
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
import org.lnu.is.domain.order.type.OrderType;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OrderTypeParametersExtractorTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private Dao<OrderType, OrderType, Long> orderTypeDao;
	
	@InjectMocks
	private OrderTypeParametersExtractor unit;

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
		Long parentId = 1L;
		String abbrName = "abbrName";
		String name = "name";
		OrderType parent = new OrderType();
		parent.setId(parentId);
		
		OrderType entity = new OrderType();
		entity.setAbbrName(abbrName);
		entity.setName(name);
		entity.setParent(parent);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("abbrName", abbrName);
		expected.put("name", name);
		expected.put("parent", parent);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(orderTypeDao.getEntityById(anyLong())).thenReturn(parent);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(orderTypeDao).getEntityById(parentId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long parentId = 1L;
		String abbrName = "abbrName";
		String name = "name";
		OrderType parent = new OrderType();
		parent.setId(parentId);
		
		OrderType entity = new OrderType();
		entity.setAbbrName(abbrName);
		entity.setName(name);
		entity.setParent(parent);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("abbrName", abbrName);
		expected.put("name", name);
		expected.put("parent", parent);
		
		// When
		when(orderTypeDao.getEntityById(anyLong())).thenReturn(parent);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(orderTypeDao).getEntityById(parentId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		OrderType entity = new OrderType();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityWithDisabledSecuiryt() throws Exception {
		// Given
		unit.setSecurity(false);
		
		OrderType entity = new OrderType();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityWithDisabledStatus() throws Exception {
		// Given
		unit.setActive(false);
		
		OrderType entity = new OrderType();
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
		
		OrderType entity = new OrderType();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
