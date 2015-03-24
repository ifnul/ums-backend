package org.lnu.is.dao.builder.specoffer.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.specoffer.SpecOfferType;

/**
 * Query Builder for SpecOfferType.
 * @author ivanursul
 *
 */
@QBuilder("specOfferTypeQueryBuilder")
public class SpecOfferTypeQueryBuilder extends AbstractQueryBuilder<SpecOfferType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String TIME_PERIOD_CONDITION = "e.timePeriod = :timePeriod";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM SpecOfferType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final SpecOfferType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
					.addAndCondition(TIME_PERIOD_CONDITION, context.getTimePeriod())
				.closeBracket();
	}

}
