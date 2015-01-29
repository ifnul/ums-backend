package org.lnu.is.dao.builder.department.specialty;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.department.specialty.DepartmentSpecialty;

/**
 * Department Specialty Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("departmentSpecialtyQueryBuilder")
public class DepartmentSpecialtyQueryBuilder extends AbstractQueryBuilder<DepartmentSpecialty> {
	
	private static final String DEPARTMENT_CONDITION = "e.department = :department ";
	private static final String SPECIALTY_CONDITION = "e.specialty = :specialty ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM DepartmentSpecialty e %s";
	}

	@Override
	protected BaseQueryBuilder build(final DepartmentSpecialty context, final BaseQueryBuilder builder) {
		return builder	
				.where()
				.openBracket()
					.addOrCondition(DEPARTMENT_CONDITION, context.getDepartment())
					.addOrCondition(SPECIALTY_CONDITION, context.getSpecialty())
				.closeBracket();
	}

}
