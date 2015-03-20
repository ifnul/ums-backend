package org.lnu.is.dao.builder.person.award;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.person.award.PersonAward;
/**
 * Person Award QUery Builder.
 * @author ivanursul
 *
 */
@QBuilder("personAwardQueryBuilder")
public class PersonAwardQueryBuilder extends AbstractQueryBuilder<PersonAward> {
	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String PERSONPAPER_CONDITION = "e.person = :person ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PersonAward e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PersonAward context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(PERSON_CONDITION, context.getPerson())
					.addOrCondition(PERSONPAPER_CONDITION, context.getPersonPaper())
				.closeBracket();
	}
}
