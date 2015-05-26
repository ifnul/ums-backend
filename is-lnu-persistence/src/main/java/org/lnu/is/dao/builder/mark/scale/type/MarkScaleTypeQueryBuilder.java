package org.lnu.is.dao.builder.mark.scale.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.mark.scale.type.MarkScaleType;

/**
 * Query builder for MarkScale Type.
 * 
 * @author OlehZanevych
 *
 */

@QBuilder("markScaleTypeQueryBuilder")
public class MarkScaleTypeQueryBuilder extends AbstractQueryBuilder<MarkScaleType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM MarkScaleType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final MarkScaleType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
