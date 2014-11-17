package org.lnu.is.facade.facade.persontypes;

import org.lnu.is.facade.resource.persontype.PersonTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Interface for person types.
 * @author ivanursul
 *
 */
public interface PersonTypeFacade {

	/**
	 * Method for getting paged result resource.
	 * @param pagedRequest
	 * @return paged result.
	 */
	PagedResultResource<PersonTypeResource> getPersonTypes(PagedRequest<PersonTypeResource> pagedRequest);

}
