package org.lnu.is.dao.builder.person.language;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.person.language.PersonLanguage;

/**
 * PersonLanguage Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("personLanguageQueryBuilder")
public class PersonLanguageQueryBuilder extends AbstractQueryBuilder<PersonLanguage> {

	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String LANGUAGE_CONDITION = "e.language = :language ";
	private static final String LANGUAGELEVEL_CONDITION = "e.languageLevel = :languageLevel ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PersonLanguage e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PersonLanguage context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(PERSON_CONDITION, context.getPerson())
					.addAndCondition(LANGUAGE_CONDITION, context.getLanguage())
					.addAndCondition(LANGUAGELEVEL_CONDITION, context.getLanguageLevel())
				.closeBracket();
	}

}
