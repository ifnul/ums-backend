package org.lnu.is.facade.facade.person.types;

import org.lnu.is.facade.resource.person.type.PersonTypeResource;
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
