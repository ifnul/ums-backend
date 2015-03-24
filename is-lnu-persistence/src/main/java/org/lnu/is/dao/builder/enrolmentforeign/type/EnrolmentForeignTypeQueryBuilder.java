package org.lnu.is.dao.builder.enrolmentforeign.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.enrolmentforeign.type.EnrolmentForeignType;

/**
 * Query builder for EnrolmentForeign Type.
 * 
 * @author OlehZanevych
 *
 */

@QBuilder("enrolmentForeignTypeQueryBuilder")
public class EnrolmentForeignTypeQueryBuilder extends AbstractQueryBuilder<EnrolmentForeignType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM EnrolmentForeignType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final EnrolmentForeignType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
