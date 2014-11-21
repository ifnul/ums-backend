package org.lnu.is.facade.facade.person.address;

import org.lnu.is.facade.resource.person.address.PersonAddressResource;

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
	PersonAddressResource createAddress(PersonAddressResource resource);

}
