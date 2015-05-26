package org.lnu.is.converter.asset.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.asset.type.AssetType;
import org.lnu.is.resource.asset.type.AssetTypeResource;

/**
 * Asset Type resource converter.
 * @author ivanursul
 *
 */
@Converter("assetTypeResourceConverter")
public class AssetTypeResourceConverter extends AbstractConverter<AssetTypeResource, AssetType> {

	@Override
	public AssetType convert(final AssetTypeResource source, final AssetType target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public AssetType convert(final AssetTypeResource source) {
		return convert(source, new AssetType());
	}

}
