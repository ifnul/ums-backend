package org.lnu.is.dao.builder.honor.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.honorstype.HonorType;

/**
 * Query builder for Honors Type.
 * 
 * @author kushnir
 *
 */
@QBuilder("honorTypeQueryBuilder")
public class HonorTypeQueryBuilder implements QueryBuilder<HonorType> {

	private static final String QUERY = "SELECT g FROM HonorType g %s";

	private static final String NAME_CONDITION = "g.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "g.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final HonorType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
