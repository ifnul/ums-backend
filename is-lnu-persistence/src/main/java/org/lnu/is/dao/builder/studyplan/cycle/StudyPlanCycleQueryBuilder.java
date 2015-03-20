package org.lnu.is.dao.builder.studyplan.cycle;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.studyplan.cycle.StudyPlanCycle;

/**
 * StudyPlanCycle Query Builder.
 * @author OlehZanevych
 *
 */
@QBuilder("studyPlanCycleQueryBuilder")
public class StudyPlanCycleQueryBuilder extends AbstractQueryBuilder<StudyPlanCycle> {
	private static final String NAME_CONDITION = "d.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "d.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM StudyPlanCycle e %s";
	}

	@Override
	protected BaseQueryBuilder build(final StudyPlanCycle context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(NAME_CONDITION, context.getName())
					.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}


