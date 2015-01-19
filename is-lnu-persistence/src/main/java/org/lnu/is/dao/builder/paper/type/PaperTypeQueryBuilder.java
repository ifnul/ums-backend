package org.lnu.is.dao.builder.paper.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.papertype.PaperType;

/**
 * Query builder for Paper Type.
 * 
 * @author ivanursul
 *
 */
@QBuilder("paperTypeQueryBuilder")
public class PaperTypeQueryBuilder extends AbstractQueryBuilder<PaperType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String PAPERUSAGE_CONDITION = "e.paperUsage = :paperUsage ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PaperType e %s";
	}


	@Override
	protected BaseQueryBuilder build(final PaperType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.addOrCondition(PAPERUSAGE_CONDITION, context.getPaperUsage())
				.closeBracket();
	}

}
