package org.lnu.is.dao.builder.paper.usage;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.paper.usage.PaperUsage;

/**
 * Query builder for Paper Usage.
 * 
 * @author illay
 *
 */
@QBuilder("paperUsageQueryBuilder")
public class PaperUsageQueryBuilder extends AbstractQueryBuilder<PaperUsage> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PaperUsage e %s";
	}


	@Override
	protected BaseQueryBuilder build(final PaperUsage context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
