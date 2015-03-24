package org.lnu.is.dao.builder.timeperiod;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.timeperiod.TimePeriod;

/**
 * Query Builder for Time Period.
 * @author ivanursul
 *
 */
@QBuilder("timePeriodQueryBuilder")
public class TimePeriodQueryBuilder extends AbstractQueryBuilder<TimePeriod> {
	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String TIMEPERIOD_CONDITION = "e.timePeriodType = :timePeriodType ";
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%', :name,'%') ";
	private static final String NUMVALUE_CONDITION = "e.numValue = :numValue ";
	private static final String BEG_DATE_CONDITION = "e.begDate <= :begDate ";
	private static final String END_DATE_CONDITION = "e.endDate >= :endDate";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM TimePeriod e %s";
	}

	@Override
	protected BaseQueryBuilder build(final TimePeriod context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(PARENT_CONDITION, context.getParent())
					.addAndCondition(TIMEPERIOD_CONDITION, context.getTimePeriodType())
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(NUMVALUE_CONDITION, context.getNumValue())
					.addAndCondition(BEG_DATE_CONDITION, context.getBegDate())
					.addAndCondition(END_DATE_CONDITION, context.getBegDate())
				.closeBracket();
	}

}
