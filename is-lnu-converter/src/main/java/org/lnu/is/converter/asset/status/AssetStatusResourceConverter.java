package org.lnu.is.converter.asset.status;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.asset.AssetStatus;
import org.lnu.is.resource.asset.status.AssetStatusResource;

/**
 * Asset state resource converter.
 * @author ivanursul
 *
 */
@ResourceConverter("assetStatusResourceConverter")
public class AssetStatusResourceConverter extends AbstractConverter<AssetStatusResource, AssetStatus> {

	@Override
	public AssetStatus convert(final AssetStatusResource source, final AssetStatus target) {
		
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public AssetStatus convert(final AssetStatusResource source) {
		return convert(source, new AssetStatus());
	}

}
