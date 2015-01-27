package org.lnu.is.dao.builder.department.contact;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.department.contact.DepartmentContact;

/**
 * Department Address Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("departmentContactQueryBuilder")
public class DepartmentContactQueryBuilder extends AbstractQueryBuilder<DepartmentContact> {
	
	private static final String DEPARTMENT_CONDITION = "e.department = :department ";
	private static final String CONTACTTYPE_CONDITION = "e.contactType = :addressType ";
	private static final String VALUE_CONDITION = "e.value LIKE CONCAT('%',:value,'%') ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM DepartmentContact e %s";
	}

	@Override
	protected BaseQueryBuilder build(final DepartmentContact context, final BaseQueryBuilder builder) {
		return builder	
				.where()
				.openBracket()
				.addOrCondition(DEPARTMENT_CONDITION, context.getDepartment())
				.addOrCondition(CONTACTTYPE_CONDITION, context.getContactType())
				.addOrCondition(VALUE_CONDITION, context.getValue())
				.closeBracket();
	}

}
