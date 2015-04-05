package org.lnu.is.dao.builder.family.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.family.type.FamilyType;

/**
 * Query builder for Family Type.
 * 
 * @author ivanursul
 *
 */

@QBuilder("familyTypeQueryBuilder")
public class FamilyTypeQueryBuilder extends AbstractQueryBuilder<FamilyType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM FamilyType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final FamilyType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
