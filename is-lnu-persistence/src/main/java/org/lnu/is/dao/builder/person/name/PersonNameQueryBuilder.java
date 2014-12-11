package org.lnu.is.dao.builder.person.name;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.person.PersonName;

/**
 * Person name Query builder.
 * @author ivanursul
 *
 */
@QBuilder("personNameQueryBuilder")
public class PersonNameQueryBuilder implements QueryBuilder<PersonName> {
	private static final String QUERY = "SELECT p FROM PersonName p %s";

	private static final String PERSON_CONDITION = "p.person = :person ";
	private static final String LANGUAGE_CONDITION = "p.language = :language";
	private static final String NAME_CONDITION = "p.name LIKE CONCAT('%',:name,'%') ";
	private static final String FIRSTNAME_CONDITION = "p.firstName LIKE CONCAT('%',:name,'%') ";
	private static final String LASTNAME_CONDITION = "p.fatherName LIKE CONCAT('%',:fatherName,'%') ";
	private static final String SURNAME_CONDITION = "p.surname LIKE CONCAT('%',:surname,'%') ";
	
	@Override
	public String build(final PersonName context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(PERSON_CONDITION, context.getPerson())
				.addOrCondition(LANGUAGE_CONDITION, context.getLanguage())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(FIRSTNAME_CONDITION, context.getFirstName())
				.addOrCondition(LASTNAME_CONDITION, context.getFatherName())
				.addOrCondition(SURNAME_CONDITION, context.getSurname())
				.build();
		
		return query;
	}

}
