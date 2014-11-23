package org.lnu.is.service.addresstype;

import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.Service;

/**
 * Address Type service.
 * 
 * @author ROMA
 *
 */
public interface AddressTypeService extends Service<AddressType> {

	/**
	 * Method for getting address types.
	 * 
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<AddressType> getAddressTypes(
			PagedSearch<AddressType> pagedSearch);

}
