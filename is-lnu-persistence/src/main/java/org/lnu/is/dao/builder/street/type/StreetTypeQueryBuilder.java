package org.lnu.is.dao.builder.street.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.streettype.StreetType;

/**
 * StreetType query builder.
 * @author ivanursul
 *
 */
@QBuilder("streetTypeQueryBuilder")
public class StreetTypeQueryBuilder extends AbstractQueryBuilder<StreetType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM StreetType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final StreetType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(NAME_CONDITION, context.getName())
					.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
