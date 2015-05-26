package org.lnu.is.dao.builder.education.form.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.education.form.type.EducationFormType;

/**
 * Edu Form Type Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("eduFormTypeQueryBuilder")
public class EducationFormTypeQueryBuilder extends AbstractQueryBuilder<EducationFormType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM EducationFormType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final EducationFormType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
				.closeBracket();
	}

}
