package org.lnu.is.dao.builder.person.education;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.person.education.PersonEducation;
/**
 * Person Education Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("personEducationQueryBuilder")
public class PersonEducationQueryBuilder extends AbstractQueryBuilder<PersonEducation> {
	
	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String EDUCATIONTYPE_CONDITION = "e.educationType = :educationType ";
	private static final String PERSONPAPER_CONDITION = "e.person = :person ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate";	
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PersonEducation e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PersonEducation context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(PERSON_CONDITION, context.getPerson())
					.addOrCondition(EDUCATIONTYPE_CONDITION, context.getEducationType())
					.addOrCondition(PERSONPAPER_CONDITION, context.getPersonPaper())
					.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
					.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.closeBracket();
	}
}
