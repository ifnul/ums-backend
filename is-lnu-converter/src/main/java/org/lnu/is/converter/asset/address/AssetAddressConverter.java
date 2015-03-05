package org.lnu.is.converter.asset.address;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.asset.address.AssetAddress;
import org.lnu.is.resource.asset.address.AssetAddressResource;

/**
 * Converter AssetAddress -> AssetAddressResource.
 * @author ivanursul
 *
 */
@Converter("assetAddressConverter")
public class AssetAddressConverter extends AbstractConverter<AssetAddress, AssetAddressResource> {

	@Override
	public AssetAddressResource convert(final AssetAddress source, final AssetAddressResource target) {

		if (source.getAdminUnit() != null) {
			target.setAdminUnitId(source.getAdminUnit().getId());
		}
		
		if (source.getAsset() != null) {
			target.setAssetId(source.getAsset().getId());
		}
		
		if (source.getAddressType() != null) {
			target.setAddressTypeId(source.getAddressType().getId());
		}
		
		if (source.getStreetType() != null) {
			target.setStreetTypeId(source.getStreetType().getId());
		}
		
		target.setId(source.getId());
		target.setZipCode(source.getZipCode());
		target.setStreet(source.getStreet());
		target.setHouse(source.getHouse());
		target.setApartment(source.getApartment());
		target.setNote(source.getNote());
		
		return target;
	}

	@Override
	public AssetAddressResource convert(final AssetAddress source) {
		return convert(source, new AssetAddressResource());
	}

}
