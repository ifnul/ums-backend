package org.lnu.is.converter.order.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.order.type.OrderType;
import org.lnu.is.resource.order.type.OrderTypeResource;

/**
 * Order type resource converter.
 * @author ivanursul
 *
 */
@Converter("orderTypeResourceConverter")
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
