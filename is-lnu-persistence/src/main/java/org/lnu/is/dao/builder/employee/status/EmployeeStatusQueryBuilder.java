package org.lnu.is.dao.builder.employee.status;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.employee.EmployeeStatus;

/**
 * Query builder for Employee Status.
 * 
 * @author ivanursul
 *
 */

@QBuilder("employeeStatusQueryBuilder")
public class EmployeeStatusQueryBuilder implements QueryBuilder<EmployeeStatus> {
	private static final String QUERY = "SELECT a FROM EmployeeStatus a %s";

	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final EmployeeStatus context) {

		String query = BaseQueryBuilder.getInstance(QUERY).where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
