package org.lnu.is.dao.builder.language;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.language.Language;
import org.springframework.stereotype.Component;

/**
 * Language query builder.
 * @author ivanursul
 *
 */
@Component("languageQueryBuilder")
public class LanguageQueryBuilder implements QueryBuilder<Language> {

	private static final String QUERY = "SELECT l FROM Language l %s";

	private static final String NAME_CONDITION = "l.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "l.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final Language context) {

		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
