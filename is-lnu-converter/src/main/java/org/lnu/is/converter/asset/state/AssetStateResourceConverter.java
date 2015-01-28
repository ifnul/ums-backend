package org.lnu.is.converter.asset.state;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.asset.state.AssetState;
import org.lnu.is.resource.asset.state.AssetStateResource;

/**
 * Asset state resource converter.
 * @author ivanursul
 *
 */
@Converter("assetStateResourceConverter")
public class AssetStateResourceConverter extends AbstractConverter<AssetStateResource, AssetState> {

	@Override
	public AssetState convert(final AssetStateResource source, final AssetState target) {
		
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public AssetState convert(final AssetStateResource source) {
		return convert(source, new AssetState());
	}

}
