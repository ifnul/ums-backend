package org.lnu.is.dao.builder.language;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.language.Language;

/**
 * Language query builder.
 * @author ivanursul
 *
 */
@QBuilder("languageQueryBuilder")
public class LanguageQueryBuilder extends AbstractQueryBuilder<Language> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Language e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Language context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(NAME_CONDITION, context.getName())
					.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
