package org.lnu.is.dao.builder.specialty.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.specialty.SpecialtyType;

/**
 * Specialty Type query builder.
 * @author ivanursul
 *
 */
@QBuilder("specialtyTypeQueryBuilder")
public class SpecialtyTypeQueryBuilder implements QueryBuilder<SpecialtyType> {

	private static final String QUERY = "SELECT s FROM SpecialtyType s %s";

	private static final String NAME_CONDITION = "s.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "s.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	
	@Override
	public String build(final SpecialtyType context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
