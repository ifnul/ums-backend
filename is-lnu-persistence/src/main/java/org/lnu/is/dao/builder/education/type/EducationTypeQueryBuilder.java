package org.lnu.is.dao.builder.education.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.educationtype.EducationType;

/**
 * Query builder for Education Type.
 * 
 * @author ivanursul
 *
 */

@QBuilder("educationTypeQueryBuilder")
public class EducationTypeQueryBuilder implements QueryBuilder<EducationType> {
	private static final String QUERY = "SELECT a FROM EducationType a %s";

	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final EducationType context) {

		String query = BaseQueryBuilder.getInstance(QUERY).where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
