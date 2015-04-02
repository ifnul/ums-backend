package org.lnu.is.dao.builder.enrolment;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.enrolment.Enrolment;

/**
 * Enrolment Query Builder.
 * @author kushnir
 *
 */

@QBuilder("enrolmentQueryBuilder")
public class EnrolmentQueryBuilder extends AbstractQueryBuilder<Enrolment> {
	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String SPECOFFER_CONDITION = "e.specOffer LIKE CONCAT('%',:specOffer,'%') ";
	private static final String DEPARTMENT_CONDITION = "e.department = :department ";
	private static final String PERSONPAPER_CONDITION = "e.personPaper = :personPaper ";
	private static final String ENROLMENTTYPE_CONDITION = "e.enrolmentType = :enrolmentType ";
	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String PRIORITY_CONDITION = "e.priority = :priority ";

	private static final String MARK_CONDITION = "e.mark = :mark ";
	private static final String DOCSERIES_CONDITION = "e.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String DOCNUM_CONDITION = "e.docNum LIKE CONCAT('%',:docNum,'%') ";
	private static final String DOCTEXT_CONDITION = "e.docText LIKE CONCAT('%',:docText,'%') ";
	
	private static final String ISSTATE_CONDITION = "e.isState = :isState ";
	private static final String ISCONTRACT_CONDITION = "e.isContract = :isContract ";
	private static final String ISPRIVELEGE_CONDITION = "e.isPrivilege = :isPrivilege ";
	private static final String ISHOSTEL_CONDITION = "e.isHostel = :isHostel ";
	
	private static final String EVDATE_CONDITION = "e.evDate = :evDate ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Enrolment e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Enrolment context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(PERSON_CONDITION, context.getPerson())
					.addAndCondition(SPECOFFER_CONDITION, context.getSpecOffer())
					.addAndCondition(DEPARTMENT_CONDITION, context.getDepartment())
					.addAndCondition(PERSONPAPER_CONDITION, context.getPersonPaper())
					.addAndCondition(ENROLMENTTYPE_CONDITION, context.getEnrolmentType())
					.addAndCondition(PARENT_CONDITION, context.getParent())
					.addAndCondition(PRIORITY_CONDITION, context.getPriority())
					.addAndCondition(MARK_CONDITION, context.getMark())
					.addAndCondition(DOCSERIES_CONDITION, context.getDocSeries())
					.addAndCondition(DOCNUM_CONDITION, context.getDocNum())
					.addAndCondition(DOCTEXT_CONDITION, context.getDocText())
					.addAndCondition(ISSTATE_CONDITION, context.getIsState())
					.addAndCondition(ISCONTRACT_CONDITION, context.getIsContract())
					.addAndCondition(ISPRIVELEGE_CONDITION, context.getIsPrivilege())
					.addAndCondition(ISHOSTEL_CONDITION, context.getIsHostel())
					.addAndCondition(EVDATE_CONDITION, context.getEvDate())
					.addAndCondition(BEGDATE_CONDITION, context.getBegDate())
					.addAndCondition(ENDDATE_CONDITION, context.getEndDate())
				.closeBracket();
	}

}
