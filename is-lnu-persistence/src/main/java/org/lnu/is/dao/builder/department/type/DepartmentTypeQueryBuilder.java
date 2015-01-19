package org.lnu.is.dao.builder.department.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.department.DepartmentType;

/**
 * Department Type Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("departmentTypeQueryBuilder")
public class DepartmentTypeQueryBuilder extends AbstractQueryBuilder<DepartmentType> {
	private static final String NAME_CONDITION = "d.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "d.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM DepartmentType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final DepartmentType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
