package org.lnu.is.dao.builder.family.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.familytype.FamilyType;

/**
 * Query builder for Family Type.
 * 
 * @author ivanursul
 *
 */

@QBuilder("familyTypeQueryBuilder")
public class FamilyTypeQueryBuilder implements QueryBuilder<FamilyType> {
	private static final String QUERY = "SELECT a FROM FamilyType a %s";

	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final FamilyType context) {

		String query = BaseQueryBuilder.getInstance(QUERY).where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
