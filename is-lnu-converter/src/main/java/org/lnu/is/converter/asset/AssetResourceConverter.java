package org.lnu.is.converter.asset;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.state.AssetState;
import org.lnu.is.domain.asset.status.AssetStatus;
import org.lnu.is.domain.asset.type.AssetType;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.resource.asset.AssetResource;

/**
 * Converter AssetResource -> Asset.
 * @author ivanursul
 *
 */
@Converter("assetResourceConverter")
public class AssetResourceConverter extends AbstractConverter<AssetResource, Asset> {

	@Override
	public Asset convert(final AssetResource source, final Asset target) {
		
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
		
		if (source.getPartnerId() != null) {
			Partner partner = new Partner();
			partner.setId(source.getPartnerId());
			
			target.setPartner(partner);
		}
		
		if (source.getParentId() != null) {
			Asset parent = new Asset();
			parent.setId(source.getParentId());
			
			target.setParent(parent);
		}
		
		if (source.getOrderId() != null) {
			Order order = new Order();
			order.setId(source.getOrderId());
			
			target.setOrder(order);
		}
		
		if (source.getEmployeeId() != null) {
			Employee employee = new Employee();
			employee.setId(source.getEmployeeId());
			
			target.setEmployee(employee);
		}
		
		if (source.getDepartmentId() != null) {
			Department department = new Department();
			department.setId(source.getDepartmentId());
			
			target.setDepartment(department);
		}
		
		if (source.getAssetTypeId() != null) {
			AssetType assetType = new AssetType();
			assetType.setId(source.getAssetTypeId());
			
			target.setAssetType(assetType);
		}
		
		if (source.getAssetStatusId() != null) {
			AssetStatus assetStatus = new AssetStatus();
			assetStatus.setId(source.getAssetStatusId());
			
			target.setAssetStatus(assetStatus);
		}
		
		if (source.getAssetStateId() != null) {
			AssetState assetState = new AssetState();
			assetState.setId(source.getAssetStateId());
			
			target.setAssetState(assetState);
		}
		
		return target;
	}

	@Override
	public Asset convert(final AssetResource source) {
		return convert(source, new Asset());
	}

}
