package org.lnu.is.facade.converter.asset.status;

import org.lnu.is.domain.asset.AssetStatus;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.asset.status.AssetStatusResource;

/**
 * Asset state resource converter.
 * @author ivanursul
 *
 */
@Converter("assetStatusResourceConverter")
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
