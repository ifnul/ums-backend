package org.lnu.is.dao.builder.gendertype;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.gendertype.GenderType;

/**
 * Query builder for Gender Type.
 * 
 * @author kushnir
 *
 */
@QBuilder("genderTypeQueryBuilder")
public class GenderTypeQueryBuilder extends AbstractQueryBuilder<GenderType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM GenderType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final GenderType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
