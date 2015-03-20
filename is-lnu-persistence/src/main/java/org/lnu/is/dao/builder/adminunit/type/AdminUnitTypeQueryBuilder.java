package org.lnu.is.dao.builder.adminunit.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.adminunit.type.AdminUnitType;

/**
 * Admin Unit Type Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("adminUnitTypeQueryBuilder")
public class AdminUnitTypeQueryBuilder extends AbstractQueryBuilder<AdminUnitType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM AdminUnitType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final AdminUnitType context, final BaseQueryBuilder builder) {
		return	builder
				.where()
				.openBracket()
					.addOrCondition(NAME_CONDITION, context.getName())
					.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}
}
