package org.lnu.is.dao.builder.enrolment.benefit;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.enrolment.benefit.EnrolmentBenefit;
/**
 * Enrolment Status query builder.
 * @author ivanursul
 *
 */
@QBuilder("enrolmentBenefitQueryBuilder")
public class EnrolmentBenefitQueryBuilder extends AbstractQueryBuilder<EnrolmentBenefit> {
	private static final String ENROLMENT_CONDITION = "e.enrolment = :enrolment ";
	private static final String BENEFIT_CONDITION = "e.benefit =:benefit ";
	private static final String PERSONPAPER_CONDITION = "e.personPaper =:personPaper ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM EnrolmentBenefit e %s";
	}


	@Override
	protected BaseQueryBuilder build(final EnrolmentBenefit context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(ENROLMENT_CONDITION, context.getEnrolment())
					.addAndCondition(BENEFIT_CONDITION, context.getBenefit())
					.addAndCondition(PERSONPAPER_CONDITION, context.getPersonPaper())
				.closeBracket();
	}

}
