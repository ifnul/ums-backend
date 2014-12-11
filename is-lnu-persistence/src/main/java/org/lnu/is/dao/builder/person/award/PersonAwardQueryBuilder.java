package org.lnu.is.dao.builder.person.award;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.person.PersonAward;
/**
 * Person Award QUery Builder.
 * @author ivanursul
 *
 */
@QBuilder("personAwardQueryBuilder")
public class PersonAwardQueryBuilder implements QueryBuilder<PersonAward> {
	private static final String QUERY = "SELECT p FROM PersonAward p %s";

	private static final String PERSON_CONDITION = "p.person = :person ";
	private static final String PERSONPAPER_CONDITION = "p.person = :person ";
	
	@Override
	public String build(final PersonAward context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(PERSON_CONDITION, context.getPerson())
				.addOrCondition(PERSONPAPER_CONDITION, context.getPersonPaper())
				.build();
		
		return query;
	}
}
