package org.lnu.is.dao.builder.asset.state;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.asset.AssetState;

/**
 * Asset state query builder.
 * @author ivanursul
 *
 */
@QBuilder("assetStateQueryBuilder")
public class AssetStateQueryBuilder implements QueryBuilder<AssetState> {

	private static final String QUERY = "SELECT a FROM AssetState a %s";
	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	
	@Override
	public String build(final AssetState context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.build();

		return query;
	}

}
