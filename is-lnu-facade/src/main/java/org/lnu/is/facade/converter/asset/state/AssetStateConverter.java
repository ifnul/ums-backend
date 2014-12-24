package org.lnu.is.facade.converter.asset.state;

import org.lnu.is.domain.asset.AssetState;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.asset.state.AssetStateResource;

/**
 * Asset state converter.
 * @author ivanursul
 *
 */
@Converter("assetStateConverter")
public class AssetStateConverter extends AbstractConverter<AssetState, AssetStateResource> {

	@Override
	public AssetStateResource convert(final AssetState source, final AssetStateResource target) {
		
		target.setName(source.getName());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public AssetStateResource convert(final AssetState source) {
		return convert(source, new AssetStateResource());
	}

}