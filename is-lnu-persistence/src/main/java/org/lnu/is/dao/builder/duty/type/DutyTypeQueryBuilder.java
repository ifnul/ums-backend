package org.lnu.is.dao.builder.duty.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.dutytype.DutyType;

/**
 * Query builder for Duty Type.
 * 
 * @author ivanursul
 *
 */

@QBuilder("dutyTypeQueryBuilder")
public class DutyTypeQueryBuilder extends AbstractQueryBuilder<DutyType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM DutyType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final DutyType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
