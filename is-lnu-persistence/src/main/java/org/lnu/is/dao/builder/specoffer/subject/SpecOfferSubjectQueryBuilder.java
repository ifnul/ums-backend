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
					.addOrCondition(SPECOFFER_CONDITION, context.getSpecOffer())
					.addOrCondition(ENROLMENTSUBJECT_CONDITION, context.getEnrolmentSubject())
					.addOrCondition(MARK_CONDITION, context.getMark())
					.addOrCondition(ISMAJOR_CONDITION, context.getIsMajor())
					.addOrCondition(ALTERNATIVE_CONDITION, context.getAlternative())
					.addOrCondition(WEIGHTSUBJECT_CONDITION, context.getWeightSubject())
				.closeBracket();
	}

}
