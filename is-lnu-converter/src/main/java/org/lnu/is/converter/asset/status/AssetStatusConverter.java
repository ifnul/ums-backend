package org.lnu.is.converter.asset.status;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.asset.AssetStatus;
import org.lnu.is.resource.asset.status.AssetStatusResource;

/**
 * Asset state converter.
 * @author ivanursul
 *
 */
@ResourceConverter("assetStatusConverter")
public class AssetStatusConverter extends AbstractConverter<AssetStatus, AssetStatusResource> {

	@Override
	public AssetStatusResource convert(final AssetStatus source, final AssetStatusResource target) {
		
		target.setName(source.getName());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public AssetStatusResource convert(final AssetStatus source) {
		return convert(source, new AssetStatusResource());
	}

}
