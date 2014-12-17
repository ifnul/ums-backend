package org.lnu.is.dao.builder.asset.status;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.asset.AssetStatus;

/**
 * Asset status query builder.
 * @author ivanursul
 *
 */
@QBuilder("assetStatusQueryBuilder")
public class AssetStatusQueryBuilder implements QueryBuilder<AssetStatus> {

	private static final String QUERY = "SELECT a FROM AssetStatus a %s";
	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	
	@Override
	public String build(final AssetStatus context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.build();

		return query;
	}

}
