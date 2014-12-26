package org.lnu.is.facade.converter.order;

import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.optype.OperationType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.order.OrderType;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.domain.reason.Reason;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.resource.order.OrderResource;
import org.springframework.stereotype.Component;

/**
 * Order resource converter.
 * @author ivanursul
 *
 */
@Component("orderResourceConverter")
public class OrderResourceConverter extends AbstractConverter<OrderResource, Order> {

	@Override
	public Order convert(final OrderResource source, final Order target) {
		
		if (source.getOrderTypeId() != null) {
			OrderType orderType = new OrderType();
			orderType.setId(source.getOrderTypeId());
			target.setOrderType(orderType);
		}
		
		if (source.getEmployeeId() != null) {
			Employee employee = new Employee();
			employee.setId(source.getEmployeeId());
			target.setEmployee(employee);
		}
		
		if (source.getAssetId() != null) {
			Asset asset = new Asset();
			asset.setId(source.getAssetId());
			target.setAsset(asset);
		}
		
		if (source.getPartnerId() != null) {
			Partner partner = new Partner();
			partner.setId(source.getPartnerId());
			target.setPartner(partner);
		}
		
		if (source.getOperationTypeId() != null) {
			OperationType operationType = new OperationType();
			operationType.setId(source.getOperationTypeId());
			target.setOpType(operationType);
		}
		
		if (source.getDepartmentId() != null) {
			Department department = new Department();
			department.setId(source.getDepartmentId());
			target.setDepartment(department);
		}
		
		if (source.getReasonId() != null) {
			Reason reason = new Reason();
			reason.setId(source.getReasonId());
			target.setReason(reason);
		}
		
		if (source.getParentId() != null) {
			Order parent = new Order();
			parent.setId(source.getParentId());
			target.setParent(parent);
		}
		
		target.setReasonText(source.getReasonText());
		target.setDocSeries(source.getDocSeries());
		target.setDocNum(source.getDocNum());
		target.setDocDate(source.getDocDate());
		target.setDocIssued(source.getDocIssued());
		target.setEvDate(source.getEvDate());
		
		return target;
	}
	
	@Override
	public Order convert(final OrderResource source) {
		return convert(source, new Order());
	}

}
