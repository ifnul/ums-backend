package org.lnu.is.dao.builder.person.work;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.person.work.PersonWork;

/**
 * Person Work Query builder.
 * @author ivanursul
 *
 */
@QBuilder("personWorkQueryBuilder")
public class PersonWorkQueryBuilder extends AbstractQueryBuilder<PersonWork> {

	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String JOBTYPE_CONDITION = "e.jobType = :jobType ";
	private static final String SPECSTAGETYPE_CONDITION = "e.specStageType = :specStageType ";
	
	private static final String ORGANIZATIONNAME_CONDITION = "e.organizationName LIKE CONCAT('%',:organizationName,'%') ";
	private static final String POSTNAME_CONDITION = "e.postName LIKE CONCAT('%',:postName,'%') ";
	private static final String DESCRIPTION_CONDITION = "e.description LIKE CONCAT('%',:description,'%') ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PersonWork e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PersonWork context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(PERSON_CONDITION, context.getPerson())
					.addAndCondition(JOBTYPE_CONDITION, context.getJobType())
					.addAndCondition(SPECSTAGETYPE_CONDITION, context.getSpecStageType())
					.addAndCondition(ORGANIZATIONNAME_CONDITION, context.getOrganizationName())
					.addAndCondition(POSTNAME_CONDITION, context.getPostName())
					.addAndCondition(DESCRIPTION_CONDITION, context.getDescription())
					.addAndCondition(BEGDATE_CONDITION, context.getBegDate())
					.addAndCondition(ENDDATE_CONDITION, context.getEndDate())
				.closeBracket();
	}

}
