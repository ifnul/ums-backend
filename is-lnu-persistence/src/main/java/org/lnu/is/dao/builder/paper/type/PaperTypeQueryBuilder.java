package org.lnu.is.dao.builder.paper.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.papertype.PaperType;

/**
 * Query builder for Paper Type.
 * 
 * @author ivanursul
 *
 */
@QBuilder("paperTypeQueryBuilder")
public class PaperTypeQueryBuilder implements QueryBuilder<PaperType> {

	private static final String QUERY = "SELECT g FROM PaperType g %s";

	private static final String NAME_CONDITION = "g.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "g.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String PAPERUSAGE_CONDITION = "g.paperUsage = :paperUsage ";


	@Override
	public String build(final PaperType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.addOrCondition(PAPERUSAGE_CONDITION, context.getPaperUsage())
				.build();

		return query;
	}

}
