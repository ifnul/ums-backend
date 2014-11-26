package org.lnu.is.dao.builder.timeperiod;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.springframework.stereotype.Component;

/**
 * Query Builder for Time Period.
 * @author ivanursul
 *
 */
@Component("timePeriodQueryBuilder")
public class TimePeriodQueryBuilder implements QueryBuilder<TimePeriod> {
	private static final String QUERY = "SELECT t FROM TimePeriod t %s";

	private static final String PARENT_CONDITION = "t.parent = :parent ";
	private static final String TIMEPERIOD_CONDITION = "t.timePeriodType = :timePeriodType ";
	private static final String NAME_CONDITION = "t.name LIKE CONCAT('%', :name,'%') ";
	private static final String NUMVALUE_CONDITION = "t.numValue = :numValue ";
	private static final String BEG_DATE_CONDITION = "t.begDate <= :begDate ";
	private static final String END_DATE_CONDITION = "t.endDate >= :endDate";

	@Override
	public String build(final TimePeriod context) {
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(TIMEPERIOD_CONDITION, context.getTimePeriodType())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(NUMVALUE_CONDITION, context.getNumValue())
				.addOrCondition(BEG_DATE_CONDITION, context.getBegDate())
				.addOrCondition(END_DATE_CONDITION, context.getBegDate())
				.build();
		
		return query;
	}

}
