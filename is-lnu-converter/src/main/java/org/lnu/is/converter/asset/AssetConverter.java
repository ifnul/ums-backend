package org.lnu.is.converter.asset;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.resource.asset.AssetResource;

/**
 * Converter Asset AssetResource.
 * @author ivanursul
 *
 */
@Converter("assetConverter")
public class AssetConverter extends AbstractConverter<Asset, AssetResource> {

	@Override
	public AssetResource convert(final Asset source, final AssetResource target) {
		
		target.setId(source.getId());
		target.setAmount(source.getAmount());
		target.setBegDate(source.getBegDate());
		target.setDescription(source.getDescription());
		target.setEndDate(source.getEndDate());
		target.setInvNum(source.getInvNum());
		target.setName(source.getName());
		target.setPrice(source.getPrice());
		target.setProdDate(source.getProdDate());
		target.setSerialNum(source.getSerialNum());
		target.setSuma(source.getSuma());
		
		if (source.getPartner() != null) {
			target.setPartnerId(source.getPartner().getId());
		}
		
		if (source.getParent() != null) {
			target.setParentId(source.getParent().getId());
		}
		
		if (source.getOrder() != null) {
			target.setOrderId(source.getOrder().getId());
		}
		
		if (source.getEmployee() != null) {
			target.setEmployeeId(source.getEmployee().getId());
		}
		
		if (source.getDepartment() != null) {
			target.setDepartmentId(source.getDepartment().getId());
		}
		
		if (source.getAssetType() != null) {
			target.setAssetTypeId(source.getAssetType().getId());
		}
		
		if (source.getAssetStatus() != null) {
			target.setAssetStatusId(source.getAssetStatus().getId());
		}
		
		if (source.getAssetState() != null) {
			target.setAssetStateId(source.getAssetState().getId());
		}
		
		return target;
	}

	@Override
	public AssetResource convert(final Asset source) {
		return convert(source, new AssetResource());
	}

}
