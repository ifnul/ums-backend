package org.lnu.is.dao.builder.eduformtype;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.eduformtype.EduFormType;

/**
 * Edu Form Type Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("eduFormTypeQueryBuilder")
public class EduFormTypeQueryBuilder extends AbstractQueryBuilder<EduFormType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM EduFormType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final EduFormType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(NAME_CONDITION, context.getName())
				.closeBracket();
	}

}
