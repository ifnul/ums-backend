package org.lnu.is.dao.builder.asset.state;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.asset.state.AssetState;

/**
 * Asset state query builder.
 * @author ivanursul
 *
 */
@QBuilder("assetStateQueryBuilder")
public class AssetStateQueryBuilder extends AbstractQueryBuilder<AssetState> {
	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM AssetState e %s";
	}

	@Override
	protected BaseQueryBuilder build(final AssetState context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(NAME_CONDITION, context.getName())
				.closeBracket();
	}

}
