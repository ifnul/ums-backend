package org.lnu.is.facade.facade.specoffer.type;

import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.type.SpecOfferTypeResource;

/**
 * Interface for specoffer types.
 * @author ivanursul
 *
 */
public interface SpecOfferTypeFacade {

	/**
	 * Method for getting spec offer types.
	 * @param pagedRequest
	 * @return paged result.
	 */
	PagedResultResource<SpecOfferTypeResource> getSpecOfferTypes(PagedRequest<SpecOfferTypeResource> pagedRequest);

}
