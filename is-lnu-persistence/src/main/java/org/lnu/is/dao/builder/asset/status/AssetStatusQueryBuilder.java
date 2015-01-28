package org.lnu.is.dao.builder.asset.status;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.asset.status.AssetStatus;

/**
 * Asset status query builder.
 * @author ivanursul
 *
 */
@QBuilder("assetStatusQueryBuilder")
public class AssetStatusQueryBuilder extends AbstractQueryBuilder<AssetStatus> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM AssetStatus e %s";
	}

	@Override
	protected BaseQueryBuilder build(final AssetStatus context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(NAME_CONDITION, context.getName())
				.closeBracket();
	}

}
