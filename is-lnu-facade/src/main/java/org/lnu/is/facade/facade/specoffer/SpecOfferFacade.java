package org.lnu.is.facade.facade.specoffer;

import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.SpecOfferResource;

/**
 * Interface, that describes all operations
 * with specoffers.
 * 
 * @author ivanursul
 *
 */
public interface SpecOfferFacade {

	/**
	 * Method for creating specoffer resource.
	 * @param resource Resource, that needs to be created.
	 * @return specoffer with generated identifier.
	 */
	SpecOfferResource createEntity(SpecOfferResource resource);

	/**
	 * Method for updating specoffer.
	 * @param id identifier of specoffer
	 * @param resource resourcse.
	 */
	void updateEntity(Long id, SpecOfferResource resource);

	/**
	 * Method for getting spec offer resource by it's identifier.
	 * 
	 * @param id identifier.
	 * @return specoffer.
	 */
	SpecOfferResource getEntity(Long id);

	/**
	 * Method for removing specoffer by it's id.
	 * @param id identifier.
	 */
	void removeEntity(Long id);

	/**
	 * Method for getting paged result for spec offers.
	 * 
	 * @param request request.
	 * @return PagedResult resource.
	 */
	PagedResultResource<SpecOfferResource> getEntities(PagedRequest<SpecOfferResource> request);

}
