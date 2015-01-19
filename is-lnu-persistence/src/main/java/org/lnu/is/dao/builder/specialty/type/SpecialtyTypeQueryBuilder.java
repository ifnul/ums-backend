package org.lnu.is.dao.builder.specialty.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.specialty.SpecialtyType;

/**
 * Specialty Type query builder.
 * @author ivanursul
 *
 */
@QBuilder("specialtyTypeQueryBuilder")
public class SpecialtyTypeQueryBuilder extends AbstractQueryBuilder<SpecialtyType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM SpecialtyType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final SpecialtyType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
