package org.lnu.is.dao.builder.adminunit;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.adminunit.AdminUnit;

/**
 * Admin unit query builder.
 * @author ivanursul
 *
 */
@QBuilder("adminUnitQueryBuilder")
public class AdminUnitQueryBuilder extends AbstractQueryBuilder<AdminUnit> implements QueryBuilder<AdminUnit> {
	private static final String ADMINUNITTYPE_COND = "e.adminUnitType = :adminUnitType";
	private static final String PARENT_COND = "e.parent = :parent ";
	private static final String IDENTIFIER_COND = "e.identifier LIKE CONCAT('%',:identifier,'%') ";
	private static final String IDENTIFIER1_COND = "e.identifier1 LIKE CONCAT('%',:identifier1,'%') ";
	private static final String IDENTIFIER2_COND = "e.identifier2 LIKE CONCAT('%',:identifier2,'%') ";
	private static final String IDENTIFIER3_COND = "e.identifier3 LIKE CONCAT('%',:identifier3,'%') ";
	private static final String NAME_COND = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String BEGDATE_COND = "e.begDate <= :begDate ";
	private static final String ENDDATE_COND = "e.endDate >= :endDate ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM AdminUnit e %s";
	}

	@Override
	protected BaseQueryBuilder build(final AdminUnit context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.addOrCondition(ADMINUNITTYPE_COND, context.getAdminUnitType())
				.addOrCondition(PARENT_COND, context.getParent())
				.addOrCondition(IDENTIFIER_COND, context.getIdentifier())
				.addOrCondition(IDENTIFIER1_COND, context.getIdentifier1())
				.addOrCondition(IDENTIFIER2_COND, context.getIdentifier2())
				.addOrCondition(IDENTIFIER3_COND, context.getIdentifier3())
				.addOrCondition(NAME_COND, context.getName())
				.addOrCondition(BEGDATE_COND, context.getBegDate())
				.addOrCondition(ENDDATE_COND, context.getEndDate());
	}

}
