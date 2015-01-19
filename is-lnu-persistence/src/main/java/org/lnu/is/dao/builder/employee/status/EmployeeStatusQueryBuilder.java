package org.lnu.is.dao.builder.employee.status;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.employee.EmployeeStatus;

/**
 * Query builder for Employee Status.
 * 
 * @author ivanursul
 *
 */

@QBuilder("employeeStatusQueryBuilder")
public class EmployeeStatusQueryBuilder extends AbstractQueryBuilder<EmployeeStatus> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM EmployeeStatus e %s";
	}

	@Override
	protected BaseQueryBuilder build(final EmployeeStatus context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName());
	}

}
