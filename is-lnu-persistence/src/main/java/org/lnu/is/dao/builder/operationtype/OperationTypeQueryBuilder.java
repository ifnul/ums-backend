package org.lnu.is.dao.builder.operationtype;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.optype.OperationType;

/**
 * Query builder for operation type.
 * 
 * @author kushnir
 *
 */

@QBuilder("operationTypeQueryBuilder")
public class OperationTypeQueryBuilder implements QueryBuilder<OperationType> {

	private static final String QUERY = "SELECT o FROM OperationType o %s";

	private static final String NAME_CONDITION = "o.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "o.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final OperationType context) {

		String query = BaseQueryBuilder.getInstance(QUERY)
				.where().addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
