package org.lnu.is.dao.builder.employee;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.employee.Employee;

/**
 * Employee Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("employeeQueryBuilder")
public class EmployeeQueryBuilder extends AbstractQueryBuilder<Employee> {

	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String GENDERTYPE_CONDITION = "e.genderType = :genderType ";

	private static final String FIRSTNAME_CONDITION = "e.firstName LIKE CONCAT('%',:firstName,'%') ";
	private static final String FATHERNAME_CONDITION = "e.fatherName LIKE CONCAT('%',:fatherName,'%') ";
	private static final String SURNAME_CONDITION = "e.surname LIKE CONCAT('%',:surname,'%') e";
	private static final String DOCSERIES_CONDITION = "e.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String DOCNUM_CONDITION = "e.docNum LIKE CONCAT('%',:docNum,'%') ";
	
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate";

	private static final String EMPLOYEETYPE_CONDITION = "e.employeeType = :employeeType ";
	private static final String EMPLOYEESTATUS_CONDITION = "e.employeeStatus = :employeeStatus ";
	private static final String BIRTHDATE_CONDITION = "e.birthDate = :birthDate ";
	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String DEPARTMENT_CONDITION = "e.department = :department ";
	private static final String POST_CONDITION = "e.post =:post ";
	private static final String JOBTYPE_CONDITION = "e.jobType = :jobType ";
	private static final String ORDER_CONDITON = "e.order =:order ";
	private static final String INVNUM_CONDITION = "e.invNum = :invNum ";
	private static final String RATE_CONDITION = "e.rate = :rate ";
	private static final String ISPLURALITY_CONDITION = "e.isPlurality =:isPlurality ";
	private static final String ISPENSIONER_CONDITION = "e.isPensioner =:isPensioner ";
	private static final String PHONE_CONDITION = "e.phone LIKE CONCAT('%',:phone,'%') ";
	private static final String EMAIL_CONDITION = "e.email LIKE CONCAT('%',:email,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Employee e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Employee context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(EMPLOYEETYPE_CONDITION, context.getEmployeeType())
					.addOrCondition(PERSON_CONDITION, context.getPerson())
					.addOrCondition(GENDERTYPE_CONDITION, context.getGenderType())
					.addOrCondition(DEPARTMENT_CONDITION, context.getDepartment())
					.addOrCondition(POST_CONDITION, context.getPost())
					.addOrCondition(JOBTYPE_CONDITION, context.getJobType())
					.addOrCondition(EMPLOYEESTATUS_CONDITION, context.getEmployeeStatus())
					.addOrCondition(ORDER_CONDITON, context.getOrder())
					.addOrCondition(PARENT_CONDITION, context.getParent())
					.addOrCondition(NAME_CONDITION, context.getName())
					.addOrCondition(FIRSTNAME_CONDITION, context.getFirstName())
					.addOrCondition(FATHERNAME_CONDITION, context.getFatherName())
					.addOrCondition(SURNAME_CONDITION, context.getSurname())
					.addOrCondition(BIRTHDATE_CONDITION, context.getBirthDate())
					.addOrCondition(INVNUM_CONDITION, context.getInvNum())
					.addOrCondition(RATE_CONDITION, context.getRate())
					.addOrCondition(ISPLURALITY_CONDITION, context.getIsPlurality())
					.addOrCondition(ISPENSIONER_CONDITION, context.getIsPensioner())
					.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
					.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
					.addOrCondition(DOCSERIES_CONDITION, context.getDocSeries())
					.addOrCondition(DOCNUM_CONDITION, context.getDocNum())
					.addOrCondition(PHONE_CONDITION, context.getPhone())
					.addOrCondition(EMAIL_CONDITION, context.getEmail())
				.closeBracket();
	}

}
