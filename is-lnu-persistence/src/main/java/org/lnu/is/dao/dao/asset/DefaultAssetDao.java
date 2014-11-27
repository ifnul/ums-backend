package org.lnu.is.dao.dao.asset;

import org.lnu.is.dao.dao.AbstractDao;
import org.lnu.is.domain.asset.Asset;
import org.springframework.stereotype.Repository;

/**
 * Asset dao default.
 * @author ivanursul
 *
 */
@Repository("assetDao")
public class DefaultAssetDao extends AbstractDao<Asset, Long> implements AssetDao {

	@Override
	public Class<Asset> getEntityClass() {
		return Asset.class;
	}

}
