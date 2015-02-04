package org.lnu.is.dao.builder.publicactivity.award;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.publicactivity.PublicActivityAward;

/**
 * Public Activity Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("publicActivityAwardQueryBuilder")
public class PublicActivityAwardQueryBuilder extends AbstractQueryBuilder<PublicActivityAward> {
	private static final String PUBLICACTIVITY_CONDITION = "e.publicActivity=:publicActivity ";
	private static final String ENROLMENTSUBJECT_CONDITION = "e.enrolmentSubject=:enrolmentSubject ";
	private static final String AWARDNAME_CONDITION = "e.awardName LIKE CONCAT('%',:awardName,'%') ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PublicActivityAward e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PublicActivityAward context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(PUBLICACTIVITY_CONDITION, context.getPublicActivity())
					.addOrCondition(ENROLMENTSUBJECT_CONDITION, context.getEnrolmentSubject())
					.addOrCondition(AWARDNAME_CONDITION, context.getAwardName())
					.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
					.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.closeBracket();
	}

}
