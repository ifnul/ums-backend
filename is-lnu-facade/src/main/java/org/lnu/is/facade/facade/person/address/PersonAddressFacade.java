package org.lnu.is.facade.facade.person.address;

import org.lnu.is.facade.resource.person.address.PersonAddressResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Person address facade.
 * @author ivanursul
 *
 */
public interface PersonAddressFacade {

	/**
	 * Method for creating person address.
	 * @param resource
	 * @return resource with generated id.
	 */
	PersonAddressResource createEntity(PersonAddressResource resource);

	/**
	 * Method for updating person address.
	 * @param addressId
	 * @param resource
	 */
	void updateEntity(Long addressId, PersonAddressResource resource);

	/**
	 * Method for getting person address.
	 * @param addressId
	 * @return person address.
	 */
	PersonAddressResource getEntity(Long addressId);

	/**
	 * Method for getting paged result.
	 * @param request
	 * @return paged result.
	 */
	PagedResultResource<PersonAddressResource> getEntities(PagedRequest<PersonAddressResource> request);

	/**
	 * Method for deleting person adress.
	 * @param addressId
	 */
	void removeEntity(Long addressId);

}
