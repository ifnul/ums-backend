package org.lnu.is.service.person.address;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.person.address.PersonAddressDao;
import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default person address service.
 * @author ivanursul
 *
 */
@Service("personAddressService")
public class DefaultPersonAddressService implements PersonAddressService {

	@Resource(name = "personAddressParametersExtractor")
	private ParametersExtractor<PersonAddress> parametersExtractor;
	
	@Resource(name = "personAddressDao")
	private PersonAddressDao defaultDao;
	
	@Override
	public void createAddress(final PersonAddress address) {
		defaultDao.save(address);
	}

	@Override
	public PersonAddress getAddress(final Long addressId) {
		return defaultDao.findById(addressId);
	}

	@Override
	public void updateAddress(final PersonAddress address) {
		defaultDao.update(address);
	}

	@Override
	public PagedResult<PersonAddress> getAddresses(final PagedSearch<PersonAddress> pagedSearch) {
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);
		
		return defaultDao.getEntities(pagedSearch);
	}

	@Override
	public void deleteAddress(final PersonAddress address) {
		defaultDao.delete(address);
	}

}
