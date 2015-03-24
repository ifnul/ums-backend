package org.lnu.is.dao.builder.addresstype;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.addresstype.AddressType;

/**
 * Query builder for Address Type.
 * 
 * @author ROMA
 *
 */

@QBuilder("addressTypeQueryBuilder")
public class AddressTypeQueryBuilder extends AbstractQueryBuilder<AddressType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM AddressType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final AddressType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
