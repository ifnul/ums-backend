package org.lnu.is.extractor.asset.address;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.address.type.AddressType;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.address.AssetAddress;
import org.lnu.is.domain.street.type.StreetType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Asset Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("assetAddressParametersExtractor")
public class AssetAddressParametersExtractor extends AbstractParametersExtractor<AssetAddress> {

	@Resource(name = "adminUnitDao")
	private Dao<AdminUnit, AdminUnit, Long> adminUnitDao;
	
	@Resource(name = "assetDao")
	private Dao<Asset, Asset, Long> assetDao;
	
	@Resource(name = "addressTypeDao")
	private Dao<AddressType, AddressType, Long> addressTypeDao;
	
	@Resource(name = "streetTypeDao")
	private Dao<StreetType, StreetType, Long> streetTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final AssetAddress entity, final Map<String, Object> parameters) {

		addParameter(entity.getAdminUnit(), adminUnitDao, "adminUnit", parameters);
		addParameter(entity.getAsset(), assetDao, "asset", parameters);
		addParameter(entity.getAddressType(), addressTypeDao, "addressType", parameters);
		addParameter(entity.getStreetType(), streetTypeDao, "streetType", parameters);
		
		addParameter(entity.getZipCode(), "zipCode", parameters);
		addParameter(entity.getStreet(), "street", parameters);
		addParameter(entity.getHouse(), "house", parameters);
		addParameter(entity.getApartment(), "apartment", parameters);
		
		return parameters;
	}

}
