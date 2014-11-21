package org.lnu.is.service.person.address;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.person.address.PersonAddressDao;
import org.lnu.is.domain.person.PersonAddress;
import org.springframework.stereotype.Service;

/**
 * Default person address service.
 * @author ivanursul
 *
 */
@Service("personAddressService")
public class DefaultPersonAddressService implements PersonAddressService {

	@Resource(name = "personAddressDao")
	private PersonAddressDao personAddressDao;
	
	@Override
	public void createAddress(final PersonAddress address) {
		personAddressDao.save(address);
	}

}
