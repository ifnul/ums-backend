package org.lnu.is.dao.builder.specoffer.subject;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.specoffer.SpecofferSubject;

/**
 * Spec Offer Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("specOfferSubjectQueryBuilder")
public class SpecOfferSubjectQueryBuilder implements QueryBuilder<SpecofferSubject> {

	private static final String QUERY = "SELECT s FROM SpecOfferSubject s %s";

	private static final String SPECOFFER_CONDITION = "s.specOffer = :specOffer ";
	private static final String ENROLMENTSUBJECT_CONDITION = "s.enrolmentSubject = :enrolmentSubject ";
	private static final String ISMAJOR_CONDITION = "s.isMajor = :isMajor ";
	private static final String ALTERNATIVE_CONDITION = "s.alternative = :alternative ";
	
	@Override
	public String build(final SpecofferSubject context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(SPECOFFER_CONDITION, context.getSpecOffer())
				.addOrCondition(ENROLMENTSUBJECT_CONDITION, context.getEnrolmentSubject())
				.addOrCondition(ISMAJOR_CONDITION, context.getIsMajor())
				.addOrCondition(ALTERNATIVE_CONDITION, context.getAlternative())
				.build();
		
		return query;
	}

}
