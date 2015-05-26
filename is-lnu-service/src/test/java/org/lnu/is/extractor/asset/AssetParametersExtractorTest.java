package org.lnu.is.extractor.asset;

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
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.state.AssetState;
import org.lnu.is.domain.asset.status.AssetStatus;
import org.lnu.is.domain.asset.type.AssetType;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AssetParametersExtractorTest {

	@Mock
	private Dao<Asset, Long> assetDao;

	@Mock
	private Dao<Order, Long> orderDao;

	@Mock
	private Dao<Partner, Long> partnetDao;

	@Mock
	private Dao<Employee, Long> employeeDao;

	@Mock
	private Dao<Department, Long> departmentDao;

	@Mock
	private Dao<AssetType, Long> assetTypeDao;

	@Mock
	private Dao<AssetState, Long> assetStateDao;

	@Mock
	private Dao<AssetStatus, Long> assetStatusDao;
	
	@InjectMocks
	private AssetParametersExtractor unit;

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
		String description = "description";
		Date endDate = new Date();
		Date begDate = new Date();
		Date prodDate = new Date();
		String serialNum = "serial num";
		String invNum = "inv num";
		String name = "name";
		
		Long parentId = 1L;
		Asset parent = new Asset();
		parent.setId(parentId);

		Long orderId = 2L;
		Order order = new Order();
		order.setId(orderId);
		
		Long partnerId = 4L;
		Partner partner = new Partner();
		partner.setId(partnerId);
		
		Long departmentId = 5L;
		Department department = new Department();
		department.setId(departmentId);

		Long assetTypeId = 6L;
		AssetType assetType = new AssetType();
		assetType.setId(assetTypeId);

		Long employeeId = 7L;
		Employee employee = new Employee();
		employee.setId(employeeId);

		Long assetStateId = 8L;
		AssetState assetState = new AssetState();
		assetState.setId(assetStateId);

		Long assetStatusId = 9L;
		AssetStatus assetStatus = new AssetStatus();
		assetStatus.setId(assetStatusId);

		Asset entity = new Asset();
		entity.setDescription(description);
		entity.setEndDate(endDate);
		entity.setBegDate(begDate);
		entity.setProdDate(prodDate);
		entity.setSerialNum(serialNum);
		entity.setInvNum(invNum);
		entity.setName(name);
		entity.setParent(parent);
		entity.setOrder(order);
		entity.setPartner(partner);
		entity.setEmployee(employee);
		entity.setDepartment(department);
		entity.setAssetType(assetType);
		entity.setAssetState(assetState);
		entity.setAssetStatus(assetStatus);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("description", description);
		expected.put("endDate", endDate);
		expected.put("begDate", begDate);
		expected.put("prodDate", prodDate);
		expected.put("serialNum", serialNum);
		expected.put("invNum", invNum);
		expected.put("name", name);
		
		expected.put("parent", parent);
		expected.put("order", order);
		expected.put("partner", partner);
		expected.put("employee", employee);
		expected.put("department", department);
		expected.put("assetType", assetType);
		expected.put("assetState", assetState);
		expected.put("assetStatus", assetStatus);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(assetDao.getEntityById(anyLong())).thenReturn(parent);
		when(orderDao.getEntityById(anyLong())).thenReturn(order);
		when(partnetDao.getEntityById(anyLong())).thenReturn(partner);
		when(employeeDao.getEntityById(anyLong())).thenReturn(employee);
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(assetTypeDao.getEntityById(anyLong())).thenReturn(assetType);
		when(assetStateDao.getEntityById(anyLong())).thenReturn(assetState);
		when(assetStatusDao.getEntityById(anyLong())).thenReturn(assetStatus);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(assetDao).getEntityById(parentId);
		verify(orderDao).getEntityById(orderId);
		verify(partnetDao).getEntityById(partnerId);
		verify(employeeDao).getEntityById(employeeId);
		verify(departmentDao).getEntityById(departmentId);
		verify(assetTypeDao).getEntityById(assetTypeId);
		verify(assetStatusDao).getEntityById(assetStatusId);
		verify(assetStateDao).getEntityById(assetStateId);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDEtauls() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String description = "description";
		Date endDate = new Date();
		Date begDate = new Date();
		Date prodDate = new Date();
		String serialNum = "serial num";
		String invNum = "inv num";
		String name = "name";
		
		Long parentId = 1L;
		Asset parent = new Asset();
		parent.setId(parentId);
		
		Long orderId = 2L;
		Order order = new Order();
		order.setId(orderId);
		
		Long partnerId = 4L;
		Partner partner = new Partner();
		partner.setId(partnerId);
		
		Long departmentId = 5L;
		Department department = new Department();
		department.setId(departmentId);
		
		Long assetTypeId = 6L;
		AssetType assetType = new AssetType();
		assetType.setId(assetTypeId);
		
		Long employeeId = 7L;
		Employee employee = new Employee();
		employee.setId(employeeId);
		
		Long assetStateId = 8L;
		AssetState assetState = new AssetState();
		assetState.setId(assetStateId);
		
		Long assetStatusId = 9L;
		AssetStatus assetStatus = new AssetStatus();
		assetStatus.setId(assetStatusId);
		
		Asset entity = new Asset();
		entity.setDescription(description);
		entity.setEndDate(endDate);
		entity.setBegDate(begDate);
		entity.setProdDate(prodDate);
		entity.setSerialNum(serialNum);
		entity.setInvNum(invNum);
		entity.setName(name);
		entity.setParent(parent);
		entity.setOrder(order);
		entity.setPartner(partner);
		entity.setEmployee(employee);
		entity.setDepartment(department);
		entity.setAssetType(assetType);
		entity.setAssetState(assetState);
		entity.setAssetStatus(assetStatus);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("description", description);
		expected.put("endDate", endDate);
		expected.put("begDate", begDate);
		expected.put("prodDate", prodDate);
		expected.put("serialNum", serialNum);
		expected.put("invNum", invNum);
		expected.put("name", name);
		
		expected.put("parent", parent);
		expected.put("order", order);
		expected.put("partner", partner);
		expected.put("employee", employee);
		expected.put("department", department);
		expected.put("assetType", assetType);
		expected.put("assetState", assetState);
		expected.put("assetStatus", assetStatus);
		
		// When
		when(assetDao.getEntityById(anyLong())).thenReturn(parent);
		when(orderDao.getEntityById(anyLong())).thenReturn(order);
		when(partnetDao.getEntityById(anyLong())).thenReturn(partner);
		when(employeeDao.getEntityById(anyLong())).thenReturn(employee);
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(assetTypeDao.getEntityById(anyLong())).thenReturn(assetType);
		when(assetStateDao.getEntityById(anyLong())).thenReturn(assetState);
		when(assetStatusDao.getEntityById(anyLong())).thenReturn(assetStatus);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(assetDao).getEntityById(parentId);
		verify(orderDao).getEntityById(orderId);
		verify(partnetDao).getEntityById(partnerId);
		verify(employeeDao).getEntityById(employeeId);
		verify(departmentDao).getEntityById(departmentId);
		verify(assetTypeDao).getEntityById(assetTypeId);
		verify(assetStatusDao).getEntityById(assetStatusId);
		verify(assetStateDao).getEntityById(assetStateId);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		Asset entity = new Asset();
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
		
		Asset entity = new Asset();
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
		Asset entity = new Asset();
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
		
		Asset entity = new Asset();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
