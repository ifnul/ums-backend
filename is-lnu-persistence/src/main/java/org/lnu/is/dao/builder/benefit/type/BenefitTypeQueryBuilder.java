package org.lnu.is.dao.builder.benefit.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.benefit.BenefitType;

/**
 * Benefit Type query builder.
 * @author ivanursul
 *
 */
@QBuilder("benefitTypeQueryBuilder")
public class BenefitTypeQueryBuilder implements QueryBuilder<BenefitType> {
	private static final String QUERY = "SELECT b FROM BenefitType b %s";

	private static final String NAME_CONDITION = "b.name LIKE CONCAT('%',:name,'%') ";
	private static final String PRIORITY_CONDITION = "b.priority =:priority ";

	@Override
	public String build(final BenefitType context) {
		
	String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(PRIORITY_CONDITION, context.getPriority())
				.build();
		
		return query;
	}

}
