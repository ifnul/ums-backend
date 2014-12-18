package org.lnu.is.dao.builder.adminunit;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.adminunit.AdminUnit;

/**
 * Admin unit query builder.
 * @author ivanursul
 *
 */
@QBuilder("adminUnitQueryBuilder")
public class AdminUnitQueryBuilder implements QueryBuilder<AdminUnit> {

	private static final String QUERY = "SELECT a FROM AdminUnit a %s";

	private static final String ADMINUNITTYPE_CONDITION = "a.adminUnitType = :adminUnitType";
	private static final String PARENT_CONDITION = "a.parent = :parent ";
	private static final String IDENTIFIER_CONDITION = "a.identifier LIKE CONCAT('%',:identifier,'%') ";
	private static final String IDENTIFIER1_CONDITION = "a.identifier1 LIKE CONCAT('%',:identifier1,'%') ";
	private static final String IDENTIFIER2_CONDITION = "a.identifier2 LIKE CONCAT('%',:identifier2,'%') ";
	private static final String IDENTIFIER3_CONDITION = "a.identifier3 LIKE CONCAT('%',:identifier3,'%') ";
	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String BEGDATE_CONDITION = "a.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "a.endDate >= :endDate ";

	@Override
	public String build(final AdminUnit context) {
		
	String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(ADMINUNITTYPE_CONDITION, context.getAdminUnitType())
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(IDENTIFIER_CONDITION, context.getIdentifier())
				.addOrCondition(IDENTIFIER1_CONDITION, context.getIdentifier1())
				.addOrCondition(IDENTIFIER2_CONDITION, context.getIdentifier2())
				.addOrCondition(IDENTIFIER3_CONDITION, context.getIdentifier3())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
				.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.build();
		
		return query;
	}
}
