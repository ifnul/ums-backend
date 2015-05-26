package org.lnu.is.dao.builder.publicactivity.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.publicactivity.PublicActivityType;

/**
 * Query builder for PublicActivity Type.
 * 
 * @author ivanursul
 *
 */
@QBuilder("publicActivityTypeQueryBuilder")
public class PublicActivityTypeQueryBuilder extends AbstractQueryBuilder<PublicActivityType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PublicActivityType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PublicActivityType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
