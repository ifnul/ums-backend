package org.lnu.is.converter.order;

import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.order.Order;
import org.lnu.is.resource.order.OrderResource;
import org.springframework.stereotype.Component;

/**
 * Order Converter.
 * @author ivanursul
 *
 */
@Component("orderConverter")
public class OrderConverter extends AbstractConverter<Order, OrderResource> {

	@Override
	public OrderResource convert(final Order source, final OrderResource target) {
		
		if (source.getOrderType() != null) {
			target.setOrderTypeId(source.getOrderType().getId());
		}
		
		if (source.getEmployee() != null) {
			target.setEmployeeId(source.getEmployee().getId());
		}
		
		if (source.getAsset() != null) {
			target.setAssetId(source.getAsset().getId());
		}
		
		if (source.getPartner() != null) {
			target.setPartnerId(source.getPartner().getId());
		}
		
		if (source.getOpType() != null) {
			target.setOperationTypeId(source.getOpType().getId());
		}
		
		if (source.getDepartment() != null) {
			target.setDepartmentId(source.getDepartment().getId());
		}
		
		if (source.getReason() != null) {
			target.setReasonId(source.getReason().getId());
		}
		
		if (source.getParent() != null) {
			target.setParentId(source.getParent().getId());
		}
		
		if (source.getTimePeriod() != null) {
			target.setTimePeriodId(source.getTimePeriod().getId());
		}
		
		target.setReasonText(source.getReasonText());
		target.setDocSeries(source.getDocSeries());
		target.setDocNum(source.getDocNum());
		target.setDocDate(source.getDocDate());
		target.setDocIssued(source.getDocIssued());
		target.setEvDate(source.getEvDate());
		target.setDescription(source.getDescription());
		target.setTitle(source.getTitle());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public OrderResource convert(final Order source) {
		return convert(source, new OrderResource());
	}

}
