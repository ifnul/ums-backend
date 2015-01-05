package org.lnu.is.dao.builder.employee.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.employee.EmployeeType;

/**
 * Query builder for Employee Type.
 * 
 * @author ivanursul
 *
 */

@QBuilder("employeeTypeQueryBuilder")
public class EmployeeTypeQueryBuilder implements QueryBuilder<EmployeeType> {
	private static final String QUERY = "SELECT a FROM EmployeeType a %s";

	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final EmployeeType context) {

		String query = BaseQueryBuilder.getInstance(QUERY).where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
