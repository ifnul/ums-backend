package org.lnu.is.dao.builder.department;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.department.Department;

/**
 * Department Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("departmentQueryBuilder")
public class DepartmentQueryBuilder implements QueryBuilder<Department> {

	private static final String QUERY = "SELECT d FROM Department d %s";

	private static final String NAME_CONDITION = "d.name LIKE CONCAT('%',:name,'%') ";
	private static final String PARENT_CONDITION = "d.parent = :parent ";
	private static final String DEPARTMENTTYPE_CONDITION = "d.departmentType = :departmentType ";
	private static final String ORDER_CONDITION = "d.order = :order ";
	private static final String ABBRNAME_CONDITION = "d.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String MANAGER_CONDITION = "d.manager LIKE CONCAT('%',:manager,'%') ";
	private static final String PHONE_CONDITION = "d.phone LIKE CONCAT('%',:phone,'%') ";
	private static final String EMAIL_CONDITION = "d.email LIKE CONCAT('%',:email,'%') ";
	private static final String BEGDATE_CONDITION = "d.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "d.endDate >= :endDate";
	
	@Override
	public String build(final Department context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(DEPARTMENTTYPE_CONDITION, context.getDepartmentType())
				.addOrCondition(ORDER_CONDITION, context.getOrder())
				.addOrCondition(ABBRNAME_CONDITION, context.getAbbrName())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(MANAGER_CONDITION, context.getManager())
				.addOrCondition(PHONE_CONDITION, context.getPhone())
				.addOrCondition(EMAIL_CONDITION, context.getEmail())
				.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
				.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.build();
		
		return query;
	}


}
