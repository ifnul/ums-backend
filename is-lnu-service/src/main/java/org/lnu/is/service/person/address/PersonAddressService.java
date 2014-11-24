package org.lnu.is.service.person.address;

import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Person Address service interface.
 * @author ivanursul
 *
 */
public interface PersonAddressService {

	/**
	 * Method for creating person address.
	 * @param address
	 */
	void createAddress(PersonAddress address);

	/**
	 * Methof for getting person address by id.
	 * @author ivanursul
	 * @param addressId
	 * @return person address.
	 */
	PersonAddress getAddress(Long addressId);

	/**
	 * Methof for updating person address.
	 * @author ivanursul
	 * @param address
	 */
	void updateAddress(PersonAddress address);

	/**
	 * Method for getting paged result.
	 * @author ivanursul
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<PersonAddress> getAddresses(PagedSearch<PersonAddress> pagedSearch);

	/**
	 * Method for deleting person address.
	 * @param address
	 */
	void deleteAddress(PersonAddress address);


}
