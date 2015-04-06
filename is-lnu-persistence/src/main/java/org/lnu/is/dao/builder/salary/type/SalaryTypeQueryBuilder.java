package org.lnu.is.dao.builder.salary.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.salary.type.SalaryType;

/**
 * SalaryType query builder.
 * @author ivanursul
 *
 */
@QBuilder("salaryTypeQueryBuilder")
public class SalaryTypeQueryBuilder extends AbstractQueryBuilder<SalaryType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM SalaryType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final SalaryType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
