package org.lnu.is.dao.builder.enrolment.statustype;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.enrolment.statustype.EnrolmentStatusType;
/**
 * Enrolment Status Type query builder.
 * @author OlehZanevych
 *
 */
@QBuilder("enrolmentStatusTypeQueryBuilder")
public class EnrolmentStatusTypeQueryBuilder extends AbstractQueryBuilder<EnrolmentStatusType> {
	private static final String ABBRNAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String DESCRIPTION_CONDITION = "e.description LIKE CONCAT('%', :description,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM EnrolmentStatusType e %s";
	}


	@Override
	protected BaseQueryBuilder build(final EnrolmentStatusType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(ABBRNAME_CONDITION, context.getAbbrName())
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(DESCRIPTION_CONDITION, context.getDescription())
				.closeBracket();
	}

}
