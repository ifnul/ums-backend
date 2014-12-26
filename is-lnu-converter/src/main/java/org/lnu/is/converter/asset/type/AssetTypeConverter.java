package org.lnu.is.converter.asset.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.asset.AssetType;
import org.lnu.is.resource.asset.type.AssetTypeResource;

/**
 * Asset Type Converter.
 * @author ivanursul
 *
 */
@Converter("assetTypeConverter")
public class AssetTypeConverter extends AbstractConverter<AssetType, AssetTypeResource> {

	@Override
	public AssetTypeResource convert(final AssetType source, final AssetTypeResource target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public AssetTypeResource convert(final AssetType source) {
		return convert(source, new AssetTypeResource());
	}

}
