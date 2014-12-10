package org.lnu.is.dao.builder.department.type;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.department.DepartmentType;
import org.springframework.stereotype.Component;

/**
 * Department Type Query Builder.
 * @author ivanursul
 *
 */
@Component("departmentTypeQueryBuilder")
public class DepartmentTypeQueryBuilder implements QueryBuilder<DepartmentType> {

	private static final String QUERY = "SELECT d FROM DepartmentType d %s";

	private static final String NAME_CONDITION = "d.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "d.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final DepartmentType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
