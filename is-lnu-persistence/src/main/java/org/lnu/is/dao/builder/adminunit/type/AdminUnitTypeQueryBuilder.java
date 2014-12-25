package org.lnu.is.dao.builder.adminunit.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.adminunit.type.AdminUnitType;

/**
 * Admin Unit Type Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("adminUnitTypeQueryBuilder")
public class AdminUnitTypeQueryBuilder implements QueryBuilder<AdminUnitType> {
	private static final String QUERY = "SELECT a FROM AdminUnitType a %s";

	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final AdminUnitType context) {

		String query = BaseQueryBuilder.getInstance(QUERY).where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}
}
