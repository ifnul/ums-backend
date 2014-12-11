package org.lnu.is.dao.builder.marriedtype;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.marriedtype.MarriedType;

/**
 * Query builder for Married Type.
 * @author Bohdan
 *
 */
@QBuilder("marriedTypeQueryBuilder")
public class MarriedTypeQueryBuilder implements QueryBuilder<MarriedType> {

	private static final String QUERY = "SELECT m FROM MarriedType m %s";

	private static final String NAME_CONDITION = "m.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "m.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	
	@Override
	public String build(final MarriedType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
