package org.lnu.is.dao.builder.sallary.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.salarytype.SallaryType;

/**
 * SallaryType query builder.
 * @author ivanursul
 *
 */
@QBuilder("sallaryTypeQueryBuilder")
public class SallaryTypeQueryBuilder implements QueryBuilder<SallaryType> {

	private static final String QUERY = "SELECT r FROM SallaryType r %s";

	private static final String NAME_CONDITION = "r.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "r.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	
	@Override
	public String build(final SallaryType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
