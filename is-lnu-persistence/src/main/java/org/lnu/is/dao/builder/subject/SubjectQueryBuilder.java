package org.lnu.is.dao.builder.subject;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.subject.Subject;

/**
 * Subject Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("subjectQueryBuilder")
public class SubjectQueryBuilder implements QueryBuilder<Subject> {

	private static final String QUERY = "SELECT r FROM Subject r %s";

	private static final String NAME_CONDITION = "r.name LIKE CONCAT('%',:name,'%') ";
	private static final String SUBJECTTYPE_CONDITION = "r.subjectType = :subjectType ";
	
	@Override
	public String build(final Subject context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(SUBJECTTYPE_CONDITION, context.getSubjectType())
				.build();

		return query;
	}

}
