package org.lnu.is.facade.converter.asset.state;

import org.lnu.is.domain.asset.AssetState;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.asset.state.AssetStateResource;

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
