package org.lnu.is.dao.builder.specoffer.subject;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.specoffer.SpecofferSubject;

/**
 * Spec Offer Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("specOfferSubjectQueryBuilder")
public class SpecOfferSubjectQueryBuilder extends AbstractQueryBuilder<SpecofferSubject> {
	private static final String SPECOFFER_CONDITION = "e.specOffer = :specOffer ";
	private static final String ENROLMENTSUBJECT_CONDITION = "e.enrolmentSubject = :enrolmentSubject ";
	private static final String ISMAJOR_CONDITION = "e.isMajor = :isMajor ";
	private static final String ALTERNATIVE_CONDITION = "e.alternative = :alternative ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM SpecofferSubject e %s";
	}

	@Override
	protected BaseQueryBuilder build(final SpecofferSubject context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(SPECOFFER_CONDITION, context.getSpecOffer())
				.addOrCondition(ENROLMENTSUBJECT_CONDITION, context.getEnrolmentSubject())
				.addOrCondition(ISMAJOR_CONDITION, context.getIsMajor())
				.addOrCondition(ALTERNATIVE_CONDITION, context.getAlternative())
				.closeBracket();
	}

}
