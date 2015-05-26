package org.lnu.is.dao.builder.admin.unit;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.admin.unit.AdminUnit;

/**
 * Admin unit query builder.
 * @author ivanursul
 *
 */
@QBuilder("adminUnitQueryBuilder")
public class AdminUnitQueryBuilder extends AbstractQueryBuilder<AdminUnit> {
	private static final String ADMINUNITTYPE_COND = "e.adminUnitType = :adminUnitType ";
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
				.openBracket()
					.addAndCondition(ADMINUNITTYPE_COND, context.getAdminUnitType())
					.addAndCondition(PARENT_COND, context.getParent())
					.addAndCondition(IDENTIFIER_COND, context.getIdentifier())
					.addAndCondition(IDENTIFIER1_COND, context.getIdentifier1())
					.addAndCondition(IDENTIFIER2_COND, context.getIdentifier2())
					.addAndCondition(IDENTIFIER3_COND, context.getIdentifier3())
					.addAndCondition(NAME_COND, context.getName())
					.addAndCondition(BEGDATE_COND, context.getBegDate())
					.addAndCondition(ENDDATE_COND, context.getEndDate())
				.closeBracket();
	}

}
