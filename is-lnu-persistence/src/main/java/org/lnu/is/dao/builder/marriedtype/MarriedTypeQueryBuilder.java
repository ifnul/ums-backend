package org.lnu.is.dao.builder.marriedtype;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.marriedtype.MarriedType;

/**
 * Query builder for Married Type.
 * @author Bohdan
 *
 */
@QBuilder("marriedTypeQueryBuilder")
public class MarriedTypeQueryBuilder extends AbstractQueryBuilder<MarriedType> {
	private static final String NAME_CONDITION = "m.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "m.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM MarriedType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final MarriedType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(NAME_CONDITION, context.getName())
					.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
