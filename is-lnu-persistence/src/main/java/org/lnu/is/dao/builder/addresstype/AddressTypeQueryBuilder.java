package org.lnu.is.dao.builder.addresstype;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Component;

/**
 * Query builder for Address Type.
 * 
 * @author ROMA
 *
 */

@Component("addressTypeQueryBuilder")
public class AddressTypeQueryBuilder implements QueryBuilder<AddressType> {

	private static final String QUERY_NAME = "AddressTypeQueryBuilder";
	private static final String QUERY = "SELECT a FROM AddressType a %s";

	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public Queries build(final AddressType context) {

		String query = BaseQueryBuilder.getInstance(QUERY).where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return new Queries(QUERY_NAME, query);
	}

}
