package org.lnu.is.extractor.order;

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
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.optype.OperationType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.order.type.OrderType;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.domain.reason.Reason;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OrderParametersExtractorTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private Dao<OrderType, Long> orderTypeDao;
	
	@Mock
	private Dao<Employee, Long> employeeDao;
	
	@Mock
	private Dao<Asset, Long> assetDao;
	
	@Mock
	private Dao<Partner, Long> partnerDao;
	
	@Mock
	private Dao<OperationType, Long> operationTypeDao;
	
	@Mock
	private Dao<Reason, Long> reasonDao;

	@Mock
	private Dao<Order, Long> orderDao;
	
	@InjectMocks
	private OrderParametersExtractor unit;

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
		Long orderTypeId = 1L;
		OrderType orderType = new OrderType();
		orderType.setId(orderTypeId);
		
		Long employeeId = 2L;
		Employee employee = new Employee();
		employee.setId(employeeId);

		Long assetId = 3L;
		Asset asset = new Asset();
		asset.setId(assetId);
		
		Long partnerId = 4L;
		Partner partner = new Partner();
		partner.setId(partnerId);

		Long operationTypeId = 5L;
		OperationType opType = new OperationType();
		opType.setId(operationTypeId);

		Long reasonId = 6L;
		Reason reason = new Reason();
		reason.setId(reasonId);

		Long parentId = 7L;
		Order parent = new Order();
		parent.setId(parentId);

		String reasonText = "reason text";
		String docSeries = "doc series";
		String docNum = "dco num";
		Date docDate = new Date();
		Date evDate = new Date();
		String docIssued = "doc issued";

		Order entity = new Order();
		entity.setOrderType(orderType);
		entity.setEmployee(employee);
		entity.setAsset(asset);
		entity.setPartner(partner);
		entity.setOpType(opType);
		entity.setReason(reason);
		entity.setParent(parent);

		entity.setReasonText(reasonText);
		entity.setDocSeries(docSeries);
		entity.setDocNum(docNum);
		entity.setDocDate(docDate);
		entity.setDocIssued(docIssued);
		entity.setEvDate(evDate);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("orderType", orderType);
		expected.put("employee", employee);
		expected.put("asset", asset);
		expected.put("partner", partner);
		expected.put("opType", opType);
		expected.put("reason", reason);
		expected.put("parent", parent);
		expected.put("reasonText", reasonText);
		expected.put("docSeries", docSeries);
		expected.put("docNum", docNum);
		expected.put("docDate", docDate);
		expected.put("docIssued", docIssued);
		expected.put("evDate", evDate);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(orderTypeDao.getEntityById(anyLong())).thenReturn(orderType);
		when(employeeDao.getEntityById(anyLong())).thenReturn(employee);
		when(assetDao.getEntityById(anyLong())).thenReturn(asset);
		when(partnerDao.getEntityById(anyLong())).thenReturn(partner);
		when(operationTypeDao.getEntityById(anyLong())).thenReturn(opType);
		when(reasonDao.getEntityById(anyLong())).thenReturn(reason);
		when(orderDao.getEntityById(anyLong())).thenReturn(parent);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(orderTypeDao).getEntityById(orderTypeId);
		verify(employeeDao).getEntityById(employeeId);
		verify(assetDao).getEntityById(assetId);
		verify(partnerDao).getEntityById(partnerId);
		verify(operationTypeDao).getEntityById(operationTypeId);
		verify(reasonDao).getEntityById(reasonId);
		verify(orderDao).getEntityById(parentId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long orderTypeId = 1L;
		OrderType orderType = new OrderType();
		orderType.setId(orderTypeId);
		
		Long employeeId = 2L;
		Employee employee = new Employee();
		employee.setId(employeeId);
		
		Long assetId = 3L;
		Asset asset = new Asset();
		asset.setId(assetId);
		
		Long partnerId = 4L;
		Partner partner = new Partner();
		partner.setId(partnerId);
		
		Long operationTypeId = 5L;
		OperationType opType = new OperationType();
		opType.setId(operationTypeId);
		
		Long reasonId = 6L;
		Reason reason = new Reason();
		reason.setId(reasonId);
		
		Long parentId = 7L;
		Order parent = new Order();
		parent.setId(parentId);
		
		String reasonText = "reason text";
		String docSeries = "doc series";
		String docNum = "dco num";
		Date docDate = new Date();
		Date evDate = new Date();
		String docIssued = "doc issued";
		
		Order entity = new Order();
		entity.setOrderType(orderType);
		entity.setEmployee(employee);
		entity.setAsset(asset);
		entity.setPartner(partner);
		entity.setOpType(opType);
		entity.setReason(reason);
		entity.setParent(parent);
		
		entity.setReasonText(reasonText);
		entity.setDocSeries(docSeries);
		entity.setDocNum(docNum);
		entity.setDocDate(docDate);
		entity.setDocIssued(docIssued);
		entity.setEvDate(evDate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("orderType", orderType);
		expected.put("employee", employee);
		expected.put("asset", asset);
		expected.put("partner", partner);
		expected.put("opType", opType);
		expected.put("reason", reason);
		expected.put("parent", parent);
		expected.put("reasonText", reasonText);
		expected.put("docSeries", docSeries);
		expected.put("docNum", docNum);
		expected.put("docDate", docDate);
		expected.put("docIssued", docIssued);
		expected.put("evDate", evDate);
		
		// When
		when(orderTypeDao.getEntityById(anyLong())).thenReturn(orderType);
		when(employeeDao.getEntityById(anyLong())).thenReturn(employee);
		when(assetDao.getEntityById(anyLong())).thenReturn(asset);
		when(partnerDao.getEntityById(anyLong())).thenReturn(partner);
		when(operationTypeDao.getEntityById(anyLong())).thenReturn(opType);
		when(reasonDao.getEntityById(anyLong())).thenReturn(reason);
		when(orderDao.getEntityById(anyLong())).thenReturn(parent);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(orderTypeDao).getEntityById(orderTypeId);
		verify(employeeDao).getEntityById(employeeId);
		verify(assetDao).getEntityById(assetId);
		verify(partnerDao).getEntityById(partnerId);
		verify(operationTypeDao).getEntityById(operationTypeId);
		verify(reasonDao).getEntityById(reasonId);
		verify(orderDao).getEntityById(parentId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		Order entity = new Order();
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
		
		Order entity = new Order();
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
		
		Order entity = new Order();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledDetaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Order entity = new Order();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
