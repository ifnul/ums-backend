package org.lnu.is.dao.builder.specoffer.subject;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.specoffer.SpecOfferSubject;

/**
 * Spec Offer Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("specOfferSubjectQueryBuilder")
public class SpecOfferSubjectQueryBuilder extends AbstractQueryBuilder<SpecOfferSubject> {
	private static final String SPECOFFER_CONDITION = "e.specOffer = :specOffer ";
	private static final String ENROLMENTSUBJECT_CONDITION = "e.enrolmentSubject = :enrolmentSubject ";
	private static final String MARK_CONDITION = "e.mark = :mark ";
	private static final String ISMAJOR_CONDITION = "e.isMajor = :isMajor ";
	private static final String ALTERNATIVE_CONDITION = "e.alternative = :alternative ";
	private static final String WEIGHTSUBJECT_CONDITION = "e.weightsubject = :weightsubject ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM SpecOfferSubject e %s";
	}

	@Override
	protected BaseQueryBuilder build(final SpecOfferSubject context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(SPECOFFER_CONDITION, context.getSpecOffer())
					.addAndCondition(ENROLMENTSUBJECT_CONDITION, context.getEnrolmentSubject())
					.addAndCondition(MARK_CONDITION, context.getMark())
					.addAndCondition(ISMAJOR_CONDITION, context.getIsMajor())
					.addAndCondition(ALTERNATIVE_CONDITION, context.getAlternative())
					.addAndCondition(WEIGHTSUBJECT_CONDITION, context.getWeightSubject())
				.closeBracket();
	}

}
