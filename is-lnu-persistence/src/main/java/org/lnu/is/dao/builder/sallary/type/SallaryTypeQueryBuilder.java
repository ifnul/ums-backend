package org.lnu.is.dao.builder.sallary.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.salarytype.SallaryType;

/**
 * SallaryType query builder.
 * @author ivanursul
 *
 */
@QBuilder("sallaryTypeQueryBuilder")
public class SallaryTypeQueryBuilder extends AbstractQueryBuilder<SallaryType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM SallaryType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final SallaryType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(NAME_CONDITION, context.getName())
					.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
