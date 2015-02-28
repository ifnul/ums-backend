package org.lnu.is.converter.asset.address;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.address.AssetAddress;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.resource.asset.address.AssetAddressResource;

/**
 * Converter AssetResource -> Asset.
 * @author ivanursul
 *
 */
@Converter("assetAddressResourceConverter")
public class AssetAddressResourceConverter extends AbstractConverter<AssetAddressResource, AssetAddress> {

	@Override
	public AssetAddress convert(final AssetAddressResource source, final AssetAddress target) {

		if (source.getAdminUnitId() != null) {
			AdminUnit adminUnit = new AdminUnit();
			adminUnit.setId(source.getAdminUnitId());
			target.setAdminUnit(adminUnit);
		}
		
		if (source.getAssetId() != null) {
			Asset asset = new Asset();
			asset.setId(source.getAssetId());
			target.setAsset(asset);
		}
		
		if (source.getAddressTypeId() != null) {
			AddressType addressType = new AddressType();
			addressType.setId(source.getAddressTypeId());
			target.setAddressType(addressType);
		}
		
		if (source.getStreetTypeId() != null) {
			StreetType streetType = new StreetType();
			streetType.setId(source.getStreetTypeId());
			target.setStreetType(streetType);
		}
		
		target.setZipCode(source.getZipCode());
		target.setStreet(source.getStreet());
		target.setHouse(source.getHouse());
		target.setApartment(source.getApartment());
		target.setNote(source.getNote());
		
		return target;
	}

	@Override
	public AssetAddress convert(final AssetAddressResource source) {
		return convert(source, new AssetAddress());
	}

}
