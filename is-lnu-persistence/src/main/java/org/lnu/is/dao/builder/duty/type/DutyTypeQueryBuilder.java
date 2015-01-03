package org.lnu.is.dao.builder.duty.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.dutytype.DutyType;

/**
 * Query builder for Duty Type.
 * 
 * @author ivanursul
 *
 */

@QBuilder("dutyTypeQueryBuilder")
public class DutyTypeQueryBuilder implements QueryBuilder<DutyType> {
	private static final String QUERY = "SELECT a FROM DutyType a %s";

	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "a.abbrname LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final DutyType context) {

		String query = BaseQueryBuilder.getInstance(QUERY).where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
