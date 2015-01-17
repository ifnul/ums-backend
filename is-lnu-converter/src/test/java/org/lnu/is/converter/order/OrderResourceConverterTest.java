package org.lnu.is.converter.order;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.optype.OperationType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.order.OrderType;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.domain.reason.Reason;
import org.lnu.is.resource.order.OrderResource;

public class OrderResourceConverterTest {

	private OrderResourceConverter unit = new OrderResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
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

		Long departmentId = 6L;
		Department department = new Department();
		department.setId(departmentId);

		Long reasonId = 7L;
		Reason reason = new Reason();
		reason.setId(reasonId);

		Long parentId = 8L;
		Order parent = new Order();
		parent.setId(parentId);
		
		String reasonText = "reasonText";
		String docSeries = "docSeries";
		String docNum = "docnum";
		Date docDate = new Date();
		String docIssued = "docIssued";
		Date evDate = new Date();

		Order expected = new Order();
		expected.setOrderType(orderType);
		expected.setEmployee(employee);
		expected.setAsset(asset);
		expected.setPartner(partner);
		expected.setOpType(opType);
		expected.setDepartment(department);
		expected.setReason(reason);
		expected.setParent(parent);
		expected.setReasonText(reasonText);
		expected.setDocSeries(docSeries);
		expected.setDocNum(docNum);
		expected.setDocDate(docDate);
		expected.setDocIssued(docIssued);
		expected.setEvDate(evDate);
		
		OrderResource source = new OrderResource();
		source.setOrderTypeId(orderTypeId);
		source.setEmployeeId(employeeId);
		source.setAssetId(assetId);
		source.setPartnerId(partnerId);
		source.setOperationTypeId(operationTypeId);
		source.setDepartmentId(departmentId);
		source.setReasonId(reasonId);
		source.setParentId(parentId);
		source.setReasonText(reasonText);
		source.setDocSeries(docSeries);
		source.setDocNum(docNum);
		source.setDocDate(docDate);
		source.setDocIssued(docIssued);
		source.setEvDate(evDate);
		
		// When
		Order actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String reasonText = "reasonText";
		String docSeries = "docSeries";
		String docNum = "docnum";
		Date docDate = new Date();
		String docIssued = "docIssued";
		Date evDate = new Date();
		
		Order expected = new Order();
		expected.setReasonText(reasonText);
		expected.setDocSeries(docSeries);
		expected.setDocNum(docNum);
		expected.setDocDate(docDate);
		expected.setDocIssued(docIssued);
		expected.setEvDate(evDate);
		
		OrderResource source = new OrderResource();
		source.setReasonText(reasonText);
		source.setDocSeries(docSeries);
		source.setDocNum(docNum);
		source.setDocDate(docDate);
		source.setDocIssued(docIssued);
		source.setEvDate(evDate);
		
		// When
		Order actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
