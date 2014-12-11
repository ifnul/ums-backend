package org.lnu.is.dao.builder.specoffer.benefit;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.specoffer.SpecofferBenefit;

/**
 * Spec Offer Benefit Query builder.
 * @author ivanursul
 *
 */
@QBuilder("specOfferBenefitQueryBuilder")
public class SpecOfferBenefitQueryBuilder implements QueryBuilder<SpecofferBenefit> {

	private static final String QUERY = "SELECT s FROM SpecofferBenefit s %s";

	private static final String SPECOFFER_CONDITION = "s.specOffer = :specOffer ";
	private static final String BENEFIT_CONDITION = "s.benefit = :benefit ";
	
	@Override
	public String build(final SpecofferBenefit context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(SPECOFFER_CONDITION, context.getSpecOffer())
				.addOrCondition(BENEFIT_CONDITION, context.getBenefit())
				.build();
		
		return query;
	}

}
