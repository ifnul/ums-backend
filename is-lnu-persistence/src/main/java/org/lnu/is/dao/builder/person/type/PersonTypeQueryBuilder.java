package org.lnu.is.dao.builder.person.type;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.person.PersonType;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Component;

/**
 * Query builder for person types.
 * @author ivanursul
 *
 */
@Component("personTypeQueryBuilder")
public class PersonTypeQueryBuilder implements QueryBuilder<PersonType> {

	private static final String QUERY_NAME = "PersonQueryBuilder";
	private static final String QUERY = "SELECT p FROM PersonType p %s";

	private static final String NAME_CONDITION = "p.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBRNAME_CONDITION = "p.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	
	@Override
	public Queries build(final PersonType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBRNAME_CONDITION, context.getAbbrName())
				.build();
		
		return new Queries(QUERY_NAME, query);
	}
}
