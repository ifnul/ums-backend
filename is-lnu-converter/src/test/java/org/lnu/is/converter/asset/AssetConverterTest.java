package org.lnu.is.converter.asset;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.state.AssetState;
import org.lnu.is.domain.asset.status.AssetStatus;
import org.lnu.is.domain.asset.type.AssetType;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.resource.asset.AssetResource;

public class AssetConverterTest {

	private AssetConverter unit = new AssetConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 11L;
		Long assetStatusId = 2L;
		Long assetTypeId = 3L;
		Long departmentId = 4L;
		Long employeeId = 5L;
		Long orderId = 6L;
		Long parentId = 7L;
		Long partnerId = 8L;
		Date begDate = new Date();
		Date endDate = new Date();
		Date prodDate = new Date();
		Double amount = 2.0;
		Double price = 1241.0;
		Double suma = 242.0;
		String description = "description";
		String invNum = "invNum";
		String name = "name";
		String serialNum = "serial num";
		
		AssetState assetState = new AssetState();
		Long assetStateId = 1L;
		assetState.setId(assetStateId);
		
		AssetStatus assetStatus = new AssetStatus();
		assetStatus.setId(assetStatusId);

		AssetType assetType = new AssetType();
		assetType.setId(assetTypeId);

		Department department = new Department();
		department.setId(departmentId);
		
		Employee employee = new Employee();
		employee.setId(employeeId);
		
		Order order = new Order();
		order.setId(orderId);
		
		Asset parent = new Asset();
		parent.setId(parentId);
		
		Partner partner = new Partner();
		partner.setId(partnerId);

		Asset source = new Asset();
		source.setAmount(amount);
		source.setAssetState(assetState);
		source.setAssetStatus(assetStatus);
		source.setAssetType(assetType);
		source.setBegDate(begDate);
		source.setDepartment(department);
		source.setDescription(description);
		source.setEmployee(employee);
		source.setEndDate(endDate);
		source.setId(id);
		source.setInvNum(invNum);
		source.setName(name);
		source.setOrder(order);
		source.setParent(parent);
		source.setPartner(partner);
		source.setPrice(price);
		source.setProdDate(prodDate);
		source.setSerialNum(serialNum);
		source.setSuma(suma);
		
		AssetResource expected = new AssetResource();
		expected.setAmount(amount);
		expected.setAssetStateId(assetStateId);
		expected.setAssetStatusId(assetStatusId);
		expected.setAssetTypeId(assetTypeId);
		expected.setBegDate(begDate);
		expected.setDepartmentId(departmentId);
		expected.setDescription(description);
		expected.setEmployeeId(employeeId);
		expected.setEndDate(endDate);
		expected.setId(id);
		expected.setInvNum(invNum);
		expected.setName(name);
		expected.setOrderId(orderId);
		expected.setParentId(parentId);
		expected.setPartnerId(partnerId);
		expected.setPrice(price);
		expected.setProdDate(prodDate);
		expected.setSerialNum(serialNum);
		expected.setSuma(suma);
		
		// When
		AssetResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Long id = 11L;
		Date begDate = new Date();
		Date endDate = new Date();
		Date prodDate = new Date();
		Double amount = 2.0;
		Double price = 1241.0;
		Double suma = 242.0;
		String description = "description";
		String invNum = "invNum";
		String name = "name";
		String serialNum = "serial num";
		
		Asset source = new Asset();
		source.setAmount(amount);
		source.setBegDate(begDate);
		source.setDescription(description);
		source.setEndDate(endDate);
		source.setId(id);
		source.setInvNum(invNum);
		source.setName(name);
		source.setPrice(price);
		source.setProdDate(prodDate);
		source.setSerialNum(serialNum);
		source.setSuma(suma);
		
		AssetResource expected = new AssetResource();
		expected.setAmount(amount);
		expected.setBegDate(begDate);
		expected.setDescription(description);
		expected.setEndDate(endDate);
		expected.setId(id);
		expected.setInvNum(invNum);
		expected.setName(name);
		expected.setPrice(price);
		expected.setProdDate(prodDate);
		expected.setSerialNum(serialNum);
		expected.setSuma(suma);
		
		// When
		AssetResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 11L;
		Long assetStatusId = 2L;
		Long assetTypeId = 3L;
		Long departmentId = 4L;
		Long employeeId = 5L;
		Long orderId = 6L;
		Long parentId = 7L;
		Long partnerId = 8L;
		Date begDate = new Date();
		Date endDate = new Date();
		Date prodDate = new Date();
		Double amount = 2.0;
		Double price = 1241.0;
		Double suma = 242.0;
		String description = "description";
		String invNum = "invNum";
		String name = "name";
		String serialNum = "serial num";
		
		AssetState assetState = new AssetState();
		Long assetStateId = 1L;
		assetState.setId(assetStateId);
		
		AssetStatus assetStatus = new AssetStatus();
		assetStatus.setId(assetStatusId);

		AssetType assetType = new AssetType();
		assetType.setId(assetTypeId);

		Department department = new Department();
		department.setId(departmentId);
		
		Employee employee = new Employee();
		employee.setId(employeeId);
		
		Order order = new Order();
		order.setId(orderId);
		
		Asset parent = new Asset();
		parent.setId(parentId);
		
		Partner partner = new Partner();
		partner.setId(partnerId);

		Asset source = new Asset();
		source.setAmount(amount);
		source.setAssetState(assetState);
		source.setAssetStatus(assetStatus);
		source.setAssetType(assetType);
		source.setBegDate(begDate);
		source.setDepartment(department);
		source.setDescription(description);
		source.setEmployee(employee);
		source.setEndDate(endDate);
		source.setId(id);
		source.setInvNum(invNum);
		source.setName(name);
		source.setOrder(order);
		source.setParent(parent);
		source.setPartner(partner);
		source.setPrice(price);
		source.setProdDate(prodDate);
		source.setSerialNum(serialNum);
		source.setSuma(suma);
		
		AssetResource expected = new AssetResource();
		expected.setAmount(amount);
		expected.setAssetStateId(assetStateId);
		expected.setAssetStatusId(assetStatusId);
		expected.setAssetTypeId(assetTypeId);
		expected.setBegDate(begDate);
		expected.setDepartmentId(departmentId);
		expected.setDescription(description);
		expected.setEmployeeId(employeeId);
		expected.setEndDate(endDate);
		expected.setId(id);
		expected.setInvNum(invNum);
		expected.setName(name);
		expected.setOrderId(orderId);
		expected.setParentId(parentId);
		expected.setPartnerId(partnerId);
		expected.setPrice(price);
		expected.setProdDate(prodDate);
		expected.setSerialNum(serialNum);
		expected.setSuma(suma);
		
		Long id1 = 12L;
		Date begDate1 = new Date();
		Date endDate1 = new Date();
		Date prodDate1 = new Date();
		Double amount1 = 3.0;
		Double price1 = 1242.0;
		Double suma1 = 212.0;
		String description1 = "description1";
		String invNum1 = "invNum1";
		String name1 = "name1";
		String serialNum1 = "serial num1";
		
		Asset source1 = new Asset();
		source1.setAmount(amount1);
		source1.setBegDate(begDate1);
		source1.setDescription(description1);
		source1.setEndDate(endDate1);
		source1.setId(id1);
		source1.setInvNum(invNum1);
		source1.setName(name1);
		source1.setPrice(price1);
		source1.setProdDate(prodDate1);
		source1.setSerialNum(serialNum1);
		source1.setSuma(suma1);
		
		AssetResource expected1 = new AssetResource();
		expected1.setAmount(amount1);
		expected1.setBegDate(begDate1);
		expected1.setDescription(description1);
		expected1.setEndDate(endDate1);
		expected1.setId(id1);
		expected1.setInvNum(invNum1);
		expected1.setName(name1);
		expected1.setPrice(price1);
		expected1.setProdDate(prodDate1);
		expected1.setSerialNum(serialNum1);
		expected1.setSuma(suma1);
		
		List<Asset> sources = Arrays.asList(source,source1);
		
		List<AssetResource> expecteds = Arrays.asList(expected,expected1);
		// When
		List<AssetResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
