package org.lnu.is.dao.builder.timesheet.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.timesheettype.TimeSheetType;

/**
 * TimesheetType query builder.
 * @author OlehZanevych
 *
 */
@QBuilder("timesheetTypeQueryBuilder")
public class TimesheetTypeQueryBuilder extends AbstractQueryBuilder<TimeSheetType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM TimeSheetType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final TimeSheetType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
