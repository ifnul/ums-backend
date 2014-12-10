package org.lnu.is.extractor.asset;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.AssetState;
import org.lnu.is.domain.asset.AssetStatus;
import org.lnu.is.domain.asset.AssetType;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Asset Parameters Extractor.
 * @author ivanursul
 *
 */
@Component("assetParametersExtractor")
public class AssetParametersExtractor extends AbstractParametersExtractor<Asset> {

	@Resource(name = "assetDao")
	private Dao<Asset, Long> assetDao;

	@Resource(name = "orderDao")
	private Dao<Order, Long> orderDao;

	@Resource(name = "partnerDao")
	private Dao<Partner, Long> partnetDao;

	@Resource(name = "employeeDao")
	private Dao<Employee, Long> employeeDao;
	
	@Resource(name = "departmentDao")
	private Dao<Department, Long> departmentDao;
	
	@Resource(name = "assetTypeDao")
	private Dao<AssetType, Long> assetTypeDao;

	@Resource(name = "assetStateDao")
	private Dao<AssetState, Long> assetStateDao;

	@Resource(name = "assetStatusDao")
	private Dao<AssetStatus, Long> assetStatusDao;
	
	@Override
	public Map<String, Object> getParameters(final Asset entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();

		addParameter(entity.getDescription(), "description", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getProdDate(), "prodDate", parameters);
		addParameter(entity.getSerialNum(), "serialNum", parameters);
		addParameter(entity.getInvNum(), "invNum", parameters);
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getParent(), assetDao, "parent", parameters);
		addParameter(entity.getOrder(), orderDao, "order", parameters);
		addParameter(entity.getPartner(), partnetDao, "partner", parameters);
		addParameter(entity.getEmployee(), employeeDao, "employee", parameters);
		addParameter(entity.getDepartment(), departmentDao, "department", parameters);
		addParameter(entity.getAssetType(), assetTypeDao, "assetType", parameters);
		addParameter(entity.getAssetState(), assetStateDao, "assetState", parameters);
		addParameter(entity.getAssetStatus(), assetStatusDao, "assetStatus", parameters);
		
		return parameters;
	}

}
