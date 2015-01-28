package org.lnu.is.dao.builder.department.name;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.department.name.DepartmentName;

/**
 * Department Name Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("departmentNameQueryBuilder")
public class DepartmentNameQueryBuilder extends AbstractQueryBuilder<DepartmentName> {
	
	private static final String DEPARTMENT_CONDITION = "e.department = :department ";
	private static final String LANGUAGE_CONDITION = "e.language = :language ";
	private static final String ABBRNAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM DepartmentName e %s";
	}

	@Override
	protected BaseQueryBuilder build(final DepartmentName context, final BaseQueryBuilder builder) {
		return builder	
				.where()
				.openBracket()
				.addOrCondition(DEPARTMENT_CONDITION, context.getDepartment())
				.addOrCondition(LANGUAGE_CONDITION, context.getLanguage())
				.addOrCondition(ABBRNAME_CONDITION, context.getAbbrName())
				.addOrCondition(NAME_CONDITION, context.getName())
				.closeBracket();
	}

}
