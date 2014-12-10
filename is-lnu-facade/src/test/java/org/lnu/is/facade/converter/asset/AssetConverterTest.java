package org.lnu.is.facade.converter.asset;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.AssetState;
import org.lnu.is.domain.asset.AssetStatus;
import org.lnu.is.domain.asset.AssetType;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.facade.resource.asset.AssetResource;

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
}
