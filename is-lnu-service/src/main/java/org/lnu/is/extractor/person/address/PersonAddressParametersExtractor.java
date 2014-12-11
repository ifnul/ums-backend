package org.lnu.is.extractor.person.address;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person Address parameters extractor. 
 * @author ivanursul
 *
 */
@ParametersExtractor("personAddressParametersExtractor")
public class PersonAddressParametersExtractor extends AbstractParametersExtractor<PersonAddress> {

	@Resource(name = "personDao")
	private Dao<Person, Long> personDao;
	
	@Resource(name = "addressTypeDao")
	private Dao<AddressType, Long> addressTypeDao;
	
	@Resource(name = "adminUnitDao")
	private Dao<AdminUnit, Long> adminUnitDao;
	
	@Resource(name = "streetTypeDao")
	private Dao<StreetType, Long> streetTypeDao;
	
	@Resource(name = "assetDao")
	private Dao<Asset, Long> assetDao;
	
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
