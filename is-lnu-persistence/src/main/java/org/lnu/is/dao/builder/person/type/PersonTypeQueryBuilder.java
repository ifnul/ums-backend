package org.lnu.is.dao.builder.person.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.person.type.PersonType;

/**
 * Query builder for person types.
 * @author ivanursul
 *
 */
@QBuilder("personTypeQueryBuilder")
public class PersonTypeQueryBuilder extends AbstractQueryBuilder<PersonType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBRNAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PersonType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PersonType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addAndCondition(NAME_CONDITION, context.getName())
				.addAndCondition(ABBRNAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}
}
