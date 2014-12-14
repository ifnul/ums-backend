package org.lnu.is.dao.builder.partner;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.partner.Partner;

/**
 * Partner query builder.
 * @author ivanursul
 *
 */
@QBuilder("partnerQueryBuilder")
public class PartnerQueryBuilder implements QueryBuilder<Partner> {
	private static final String QUERY = "SELECT p FROM Partner p %s";

	private static final String PARENT_CONDITION = "p.parent = :parent ";
	private static final String NAME_CONDITION = "p.name LIKE CONCAT('%',:name,'%') ";
	private static final String BEGDATE_CONDITION = "p.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "p.endDate >= :endDate";
	private static final String ABBRNAME_CONDITION = "p.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String MANAGER_CONDITION = "p.manager LIKE CONCAT('%',:manager,'%') ";
	private static final String PHONE_CONDITION = "p.phone LIKE CONCAT('%',:phone,'%') ";
	private static final String EMAIL_CONDITION = "p.email LIKE CONCAT('%',:email,'%') ";
	
	
	@Override
	public String build(final Partner context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(ABBRNAME_CONDITION, context.getAbbrName())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(MANAGER_CONDITION, context.getManager())
				.addOrCondition(PHONE_CONDITION, context.getPhone())
				.addOrCondition(EMAIL_CONDITION, context.getEmail())
				.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
				.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.build();
		
		return query;
	}

}
