package org.lnu.is.facade.facade.addresstype;

import org.lnu.is.facade.resource.addresstype.AddressTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Interface for address types.
 * 
 * @author ROMA
 *
 */
public interface AddressTypeFacade {

	/**
	 * Method for getting paged result.
	 * 
	 * @param request
	 * @return paged result
	 */
	PagedResultResource<AddressTypeResource> getEntities(
			PagedRequest<AddressTypeResource> request);
}
