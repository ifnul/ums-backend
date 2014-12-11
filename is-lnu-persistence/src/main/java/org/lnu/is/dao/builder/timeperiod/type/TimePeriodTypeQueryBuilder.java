package org.lnu.is.dao.builder.timeperiod.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.timeperiod.TimePeriodType;

/**
 * Time Period Type Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("timePeriodTypeQueryBuilder")
public class TimePeriodTypeQueryBuilder implements QueryBuilder<TimePeriodType> {
	
	private static final String QUERY = "SELECT t FROM TimePeriodType t %s";

	private static final String NAME_CONDITION = "t.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "t.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final TimePeriodType context) {

		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
