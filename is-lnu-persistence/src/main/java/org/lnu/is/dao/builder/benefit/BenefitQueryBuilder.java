package org.lnu.is.dao.builder.benefit;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.benefit.Benefit;

/**
 * Benefit Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("benefitQueryBuilder")
public class BenefitQueryBuilder extends AbstractQueryBuilder<Benefit> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String DESCRIPTION_CONDITION = "e.description LIKE CONCAT('%',:description,'%') ";
	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate ";
	private static final String BENEFITTYPE_CONDITION = "e.benefitType = :benefitType ";
	private static final String ABBRNAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Benefit e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Benefit context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(BENEFITTYPE_CONDITION, context.getBenefitType())
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBRNAME_CONDITION, context.getAbbrName())
				.addOrCondition(DESCRIPTION_CONDITION, context.getDescription())
				.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
				.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.closeBracket();
	}

}
