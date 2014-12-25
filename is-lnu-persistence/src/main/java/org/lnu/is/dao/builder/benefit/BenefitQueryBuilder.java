package org.lnu.is.dao.builder.benefit;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.benefit.Benefit;

/**
 * Benefit Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("benefitQueryBuilder")
public class BenefitQueryBuilder implements QueryBuilder<Benefit>  {

	private static final String QUERY = "SELECT b FROM Benefit b %s";

	private static final String NAME_CONDITION = "b.name LIKE CONCAT('%',:name,'%') ";
	private static final String DESCRIPTION_CONDITION = "b.description LIKE CONCAT('%',:description,'%') ";
	private static final String PARENT_CONDITION = "b.parent = :parent ";
	private static final String BEGDATE_CONDITION = "b.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "b.endDate >= :endDate ";
	private static final String BENEFITTYPE_CONDITION = "b.benefitType = :benefitType ";
	private static final String ABBRNAME_CONDITION = "b.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final Benefit context) {
		
	String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(BENEFITTYPE_CONDITION, context.getBenefitType())
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBRNAME_CONDITION, context.getName())
				.addOrCondition(DESCRIPTION_CONDITION, context.getDescription())
				.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
				.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.build();
		
		return query;
	}

}
