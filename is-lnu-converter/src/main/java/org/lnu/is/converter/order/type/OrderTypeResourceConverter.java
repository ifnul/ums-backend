package org.lnu.is.converter.order.type;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.order.OrderType;
import org.lnu.is.resource.order.type.OrderTypeResource;

/**
 * Order type resource converter.
 * @author ivanursul
 *
 */
@ResourceConverter("orderTypeResourceConverter")
public class OrderTypeResourceConverter extends AbstractConverter<OrderTypeResource, OrderType> {

	@Override
	public OrderType convert(final OrderTypeResource source, final OrderType target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		if (source.getParentId() != null) {
			OrderType parent = new OrderType();
			parent.setId(source.getParentId());
			target.setParent(parent);
		}
		
		return target;
	}

	@Override
	public OrderType convert(final OrderTypeResource source) {
		return convert(source, new OrderType());
	}

}
