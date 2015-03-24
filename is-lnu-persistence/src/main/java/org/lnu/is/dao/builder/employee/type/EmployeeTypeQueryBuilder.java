package org.lnu.is.dao.builder.employee.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.employee.type.EmployeeType;

/**
 * Query builder for Employee Type.
 * 
 * @author ivanursul
 *
 */

@QBuilder("employeeTypeQueryBuilder")
public class EmployeeTypeQueryBuilder extends AbstractQueryBuilder<EmployeeType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM EmployeeType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final EmployeeType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
