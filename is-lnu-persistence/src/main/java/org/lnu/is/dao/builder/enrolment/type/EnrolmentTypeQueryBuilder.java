package org.lnu.is.dao.builder.enrolment.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.enrolment.EnrolmentType;

/**
 * Enrolment Type Query Builder.
 * @author kushnir
 *
 */
@QBuilder("enrolmentTypeQueryBuilder")
public class EnrolmentTypeQueryBuilder implements QueryBuilder<EnrolmentType> {

	private static final String QUERY = "SELECT e FROM EnrolmentType e %s";

	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";

	@Override
	public String build(final EnrolmentType context) {
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.build();

		return query;
	}

}
