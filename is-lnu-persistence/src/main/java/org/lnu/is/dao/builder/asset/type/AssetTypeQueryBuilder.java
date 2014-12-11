package org.lnu.is.dao.builder.asset.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.asset.AssetType;

/**
 * Asset Type Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("assetTypeQueryBuilder")
public class AssetTypeQueryBuilder implements QueryBuilder<AssetType> {
	private static final String QUERY = "SELECT a FROM AssetType a %s";

	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "a.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	public String build(final AssetType context) {

		String query = BaseQueryBuilder.getInstance(QUERY).where()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.build();

		return query;
	}
}
