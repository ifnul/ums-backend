package org.lnu.is.dao.builder.operation.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.optype.OperationType;

/**
 * Query builder for operation type.
 * 
 * @author kushnir
 *
 */

@QBuilder("operationTypeQueryBuilder")
public class OperationTypeQueryBuilder extends AbstractQueryBuilder<OperationType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM OperationType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final OperationType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
