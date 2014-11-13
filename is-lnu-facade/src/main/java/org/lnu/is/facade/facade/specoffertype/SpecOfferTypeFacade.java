package org.lnu.is.facade.facade.specoffertype;

import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffertype.SpecOfferTypeResource;

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
