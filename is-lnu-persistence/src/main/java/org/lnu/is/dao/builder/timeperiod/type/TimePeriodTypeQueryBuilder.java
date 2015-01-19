package org.lnu.is.dao.builder.timeperiod.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.timeperiod.TimePeriodType;

/**
 * Time Period Type Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("timePeriodTypeQueryBuilder")
public class TimePeriodTypeQueryBuilder extends AbstractQueryBuilder<TimePeriodType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM TimePeriodType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final TimePeriodType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName());
	}

}
