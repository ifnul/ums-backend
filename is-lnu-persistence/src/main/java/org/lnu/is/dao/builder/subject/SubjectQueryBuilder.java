package org.lnu.is.dao.builder.subject;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.subject.Subject;

/**
 * Subject Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("subjectQueryBuilder")
public class SubjectQueryBuilder extends AbstractQueryBuilder<Subject> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String SUBJECTTYPE_CONDITION = "e.subjectType = :subjectType ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Subject e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Subject context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(NAME_CONDITION, context.getName())
					.addOrCondition(SUBJECTTYPE_CONDITION, context.getSubjectType())
				.closeBracket();
	}

}
