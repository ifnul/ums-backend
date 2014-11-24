package org.lnu.is.extractor.person.address;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.address.type.AddressTypeDao;
import org.lnu.is.dao.dao.adminunit.AdminUnitDao;
import org.lnu.is.dao.dao.asset.AssetDao;
import org.lnu.is.dao.dao.person.PersonDao;
import org.lnu.is.dao.dao.street.type.StreetTypeDao;
import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Person Address parameters extractor. 
 * @author ivanursul
 *
 */
@Component("personAddressParametersExtractor")
public class PersonAddressParametersExtractor extends AbstractParametersExtractor<PersonAddress> {

	@Resource(name = "personDao")
	private PersonDao personDao;
	
	@Resource(name = "addressTypeDao")
	private AddressTypeDao addressTypeDao;
	
	@Resource(name = "adminUnitDao")
	private AdminUnitDao adminUnitDao;
	
	@Resource(name = "streetTypeDao")
	private StreetTypeDao streetTypeDao;
	
	@Resource(name = "assetDao")
	private AssetDao assetDao;
	
	@Override
	public Map<String, Object> getParameters(final PersonAddress entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getAddressType(), addressTypeDao, "addressType", parameters);
		addParameter(entity.getAdminUnit(), adminUnitDao, "adminUnit", parameters);
		addParameter(entity.getStreetType(), streetTypeDao, "streetType", parameters);
		addParameter(entity.getAsset(), assetDao, "asset", parameters);
		
		addParameter(entity.getZipCode(), "zipCode", parameters);
		addParameter(entity.getStreet(), "street", parameters);
		addParameter(entity.getHouse(), "house", parameters);
		addParameter(entity.getApartment(), "apartment", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		
		return parameters;
	}

}
