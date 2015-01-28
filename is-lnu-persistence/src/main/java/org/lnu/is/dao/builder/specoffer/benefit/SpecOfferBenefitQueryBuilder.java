package org.lnu.is.dao.builder.specoffer.benefit;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.specoffer.SpecOfferBenefit;

/**
 * Spec Offer Benefit Query builder.
 * @author ivanursul
 *
 */
@QBuilder("specOfferBenefitQueryBuilder")
public class SpecOfferBenefitQueryBuilder extends AbstractQueryBuilder<SpecOfferBenefit> {
	private static final String SPECOFFER_CONDITION = "e.specOffer = :specOffer ";
	private static final String BENEFIT_CONDITION = "e.benefit = :benefit ";

	@Override
	protected String getBaseQuery() {
		return "SELECT s FROM SpecofferBenefit s %s";
	}

	@Override
	protected BaseQueryBuilder build(final SpecOfferBenefit context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(SPECOFFER_CONDITION, context.getSpecOffer())
				.addOrCondition(BENEFIT_CONDITION, context.getBenefit())
				.closeBracket();
	}

}
