package org.lnu.is.dao.builder.publicactivity;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.publicactivity.PublicActivity;

/**
 * Public Activity Query Builder.
 * @author ivanursul
 *
 */
@QBuilder
public class PublicActivityQueryBuilder extends AbstractQueryBuilder<PublicActivity> {
	private static final String PUBLICACTIVITYTYPE_CONDITION = "e.publicActivityType=:publicActivityType ";
	private static final String TIMEPERIOD_CONDITION = "e.timePeriod=:timePeriod ";
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PublicActivity e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PublicActivity context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(PUBLICACTIVITYTYPE_CONDITION, context.getPublicActiveType())
					.addOrCondition(TIMEPERIOD_CONDITION, context.getTimePeriod())
					.addOrCondition(NAME_CONDITION, context.getName())
					.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
					.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.closeBracket();
	}

}
