package org.lnu.is.dao.builder.gendertype;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Component;

/**
 * Query builder for Gender Type.
 * 
 * @author kushnir
 *
 */
@Component("genderTypeQueryBuilder")
public class GenderTypeQueryBuilder implements QueryBuilder<GenderType> {

	private static final String QUERY_NAME = "GenderTypeQueryBuilder";
	private static final String QUERY = "SELECT g FROM GenderType g %s";

	private static final String NAME_CONDITION = "g.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "g.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public Queries build(final GenderType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return new Queries(QUERY_NAME, query);
	}

}
