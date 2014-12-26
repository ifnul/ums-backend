package org.lnu.is.dao.builder.contact.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.contacttype.ContactType;

/**
 * Query builder for Contact Type.
 * 
 * @author ivanursul
 *
 */

@QBuilder("contactTypeQueryBuilder")
public class ContactTypeQueryBuilder implements QueryBuilder<ContactType> {
	private static final String QUERY = "SELECT a FROM ContactType a %s";

	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final ContactType context) {

		String query = BaseQueryBuilder.getInstance(QUERY).where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}

}
