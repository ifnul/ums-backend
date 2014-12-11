package org.lnu.is.dao.builder.order.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.order.OrderType;

/**
 * OrderType Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("orderTypeQueryBuilder")
public class OrderTypeQueryBuilder implements QueryBuilder<OrderType> {

	private static final String QUERY = "SELECT o FROM OrderType o %s";

	private static final String NAME_CONDITION = "o.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "o.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String PARENT_CONDITION = "o.parent = :parent ";

	@Override
	public String build(final OrderType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}
}
