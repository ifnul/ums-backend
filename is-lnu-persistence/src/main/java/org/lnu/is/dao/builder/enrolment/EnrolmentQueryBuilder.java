package org.lnu.is.dao.builder.enrolment;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.enrolment.Enrolment;
import org.springframework.stereotype.Component;

/**
 * Enrolment Query Builder.
 * @author kushnir
 *
 */

@Component("enrolmentQueryBuilder")
public class EnrolmentQueryBuilder implements QueryBuilder<Enrolment> {

	private static final String QUERY = "SELECT e FROM Enrolment e %s";

	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String SPECOFFER_CONDITION = "e.specOffer LIKE CONCAT('%',:specOffer,'%') ";
	private static final String DEPARTMENT_CONDITION = "e.department = :department ";
	private static final String PERSONPAPPER_CONDITION = "e.personPapper = :personPapper ";
	private static final String ENROLMENTTYPE_CONDITION = "e.enrolmentType = :enrolmentType ";
	private static final String PARENT_CONDITION = "e.parent = :parent ";

	private static final String MARK_CONDITION = "e.mark LIKE CONCAT('%',:mark,'%') ";
	private static final String DOCSERIES_CONDITION = "e.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String DOCNUM_CONDITION = "e.docNum LIKE CONCAT('%',:docNum,'%') ";
	private static final String DOCTEXT_CONDITION = "e.docText LIKE CONCAT('%',:docText,'%') ";
	
	private static final String ISSTATE_CONDITION = "e.isState LIKE CONCAT('%',:isState,'%') ";
	private static final String ISCONTRACT_CONDITION = "e.isContract LIKE CONCAT('%',:isContract,'%') ";
	private static final String ISPRIVELEGE_CONDITION = "e.isPrivelege LIKE CONCAT('%',:isPrivelege,'%') ";
	private static final String ISHOSTEL_CONDITION = "e.isHostel LIKE CONCAT('%',:isHostel,'%') ";
	
	private static final String EVDATE_CONDITION = "e.evDate = :evDate ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate";
	
	@Override
	public String build(final Enrolment context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(PERSON_CONDITION, context.getPerson())
				.addOrCondition(SPECOFFER_CONDITION, context.getSpecOffer())
				.addOrCondition(DEPARTMENT_CONDITION, context.getDepartment())
				.addOrCondition(PERSONPAPPER_CONDITION, context.getPersonPaper())
				.addOrCondition(ENROLMENTTYPE_CONDITION, context.getEnrolmentType())
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(MARK_CONDITION, context.getMark())
				.addOrCondition(DOCSERIES_CONDITION, context.getDocSeries())
				.addOrCondition(DOCNUM_CONDITION, context.getDocNum())
				.addOrCondition(DOCTEXT_CONDITION, context.getDocText())
				.addOrCondition(ISSTATE_CONDITION, context.getIsState())
				.addOrCondition(ISCONTRACT_CONDITION, context.getIsContract())
				.addOrCondition(ISPRIVELEGE_CONDITION, context.getIsPrivilege())
				.addOrCondition(ISHOSTEL_CONDITION, context.getIsHostel())
				.addOrCondition(EVDATE_CONDITION, context.getEvDate())
				.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
				.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.build();
		
		return query;
	}

}
