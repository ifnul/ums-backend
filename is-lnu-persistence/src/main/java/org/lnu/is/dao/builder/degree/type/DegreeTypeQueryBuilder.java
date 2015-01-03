package org.lnu.is.dao.builder.degree.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.degree.DegreeType;

/**
 * Query builder for Degree Type.
 * 
 * @author ivanursul
 *
 */

@QBuilder("degreeTypeQueryBuilder")
public class DegreeTypeQueryBuilder implements QueryBuilder<DegreeType> {
	private static final String QUERY = "SELECT a FROM DegreeType a %s";

	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "a.abbrname LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final DegreeType context) {

		String query = BaseQueryBuilder.getInstance(QUERY).where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
