package org.lnu.is.extractor.department;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
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
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.DepartmentType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DepartmentParametersExtractorTest {

	@Mock
	private Dao<Department, Long> departmentDao;
	
	@Mock
	private Dao<DepartmentType, Long> departmentTypeDao;
	
	@Mock
	private Dao<Order, Long> orderDao;
	
	@InjectMocks
	private DepartmentParametersExtractor unit;

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
		Long parentId = 1L;
		Department parent = new Department();
		parent.setId(parentId);
		
		Long departmentTypeId = 2L;
		DepartmentType departmentType = new DepartmentType();
		departmentType.setId(departmentTypeId);

		Long orderId = 3L;
		Order order = new Order();
		order.setId(orderId);
		
		String abbrName = "abbr name";
		String name = "name1";
		String manager = "manager1";
		String phone = "542534534";
		String email = "email@email.emao;";
		Date begDate = new Date();
		Date endDate = new Date();

		Department entity = new Department();
		entity.setParent(parent);
		entity.setDepartmentType(departmentType);
		entity.setOrder(order);
		
		entity.setAbbrName(abbrName);
		entity.setName(name);
		entity.setManager(manager);
		entity.setPhone(phone);
		entity.setEmail(email);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("parent", parent);
		expected.put("departmentType", departmentType);
		expected.put("order", order);
		expected.put("abbrName", abbrName);
		expected.put("name", name);
		expected.put("manager", manager);
		expected.put("phone", phone);
		expected.put("email", email);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(departmentDao.getEntityById(anyLong())).thenReturn(parent);
		when(departmentTypeDao.getEntityById(anyLong())).thenReturn(departmentType);
		when(orderDao.getEntityById(anyLong())).thenReturn(order);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(departmentDao).getEntityById(parentId);
		verify(departmentTypeDao).getEntityById(departmentTypeId);
		verify(orderDao).getEntityById(orderId);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long parentId = 1L;
		Department parent = new Department();
		parent.setId(parentId);
		
		Long departmentTypeId = 2L;
		DepartmentType departmentType = new DepartmentType();
		departmentType.setId(departmentTypeId);
		
		Long orderId = 3L;
		Order order = new Order();
		order.setId(orderId);
		
		String abbrName = "abbr name";
		String name = "name1";
		String manager = "manager1";
		String phone = "542534534";
		String email = "email@email.emao;";
		Date begDate = new Date();
		Date endDate = new Date();
		
		Department entity = new Department();
		entity.setParent(parent);
		entity.setDepartmentType(departmentType);
		entity.setOrder(order);
		
		entity.setAbbrName(abbrName);
		entity.setName(name);
		entity.setManager(manager);
		entity.setPhone(phone);
		entity.setEmail(email);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("parent", parent);
		expected.put("departmentType", departmentType);
		expected.put("order", order);
		expected.put("abbrName", abbrName);
		expected.put("name", name);
		expected.put("manager", manager);
		expected.put("phone", phone);
		expected.put("email", email);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		
		// When
		when(departmentDao.getEntityById(anyLong())).thenReturn(parent);
		when(departmentTypeDao.getEntityById(anyLong())).thenReturn(departmentType);
		when(orderDao.getEntityById(anyLong())).thenReturn(order);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(departmentDao).getEntityById(parentId);
		verify(departmentTypeDao).getEntityById(departmentTypeId);
		verify(orderDao).getEntityById(orderId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		Department entity = new Department();
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
		
		Department entity = new Department();
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
		
		Department entity = new Department();
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
		
		Department entity = new Department();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
