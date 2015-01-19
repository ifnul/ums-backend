package org.lnu.is.dao.builder.benefit.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.benefit.BenefitType;

/**
 * Benefit Type query builder.
 * @author ivanursul
 *
 */
@QBuilder("benefitTypeQueryBuilder")
public class BenefitTypeQueryBuilder extends AbstractQueryBuilder<BenefitType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String PRIORITY_CONDITION = "e.priority =:priority ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM BenefitType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final BenefitType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(PRIORITY_CONDITION, context.getPriority())
				.closeBracket();
	}

}
