package org.lnu.is.converter.order.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.order.OrderType;
import org.lnu.is.resource.order.type.OrderTypeResource;

/**
 * Order type converter.
 * @author ivanursul
 *
 */
@Converter("orderTypeConverter")
public class OrderTypeConverter extends AbstractConverter<OrderType, OrderTypeResource> {

	@Override
	public OrderTypeResource convert(final OrderType source, final OrderTypeResource target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setId(source.getId());
		target.setName(source.getName());
		
		if (source.getParent() != null) {
			target.setParentId(source.getParent().getId());
		}
		
		return target;
	}

	@Override
	public OrderTypeResource convert(final OrderType source) {
		return convert(source, new OrderTypeResource());
	}

}
