package org.lnu.is.dao.builder.course.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.coursetype.CourseType;

/**
 * Query builder for Course Type.
 * 
 * @author ivanursul
 *
 */

@QBuilder("courseTypeQueryBuilder")
public class CourseTypeQueryBuilder implements QueryBuilder<CourseType> {
	private static final String QUERY = "SELECT a FROM CourseType a %s";

	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final CourseType context) {

		String query = BaseQueryBuilder.getInstance(QUERY).where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
