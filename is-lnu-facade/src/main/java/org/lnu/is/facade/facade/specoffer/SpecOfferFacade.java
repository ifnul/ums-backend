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
	 * @param specOfferResource Resource, that needs to be created.
	 * @return specoffer with generated identifier.
	 */
	SpecOfferResource createSpecOffer(SpecOfferResource specOfferResource);

	/**
	 * Method for updating specoffer.
	 * @param id identifier of specoffer
	 * @param specOfferResource resourcse.
	 */
	void updateSpecOffer(Long id, SpecOfferResource specOfferResource);

	/**
	 * Method for getting spec offer resource by it's identifier.
	 * 
	 * @param id identifier.
	 * @return specoffer.
	 */
	SpecOfferResource getSpecOffer(Long id);

	/**
	 * Method for removing specoffer by it's id.
	 * @param id identifier.
	 */
	void removeSpecOffer(Long id);

	/**
	 * Method for getting paged result for spec offers.
	 * 
	 * @param pagedRequest request.
	 * @return PagedResult resource.
	 */
	PagedResultResource<SpecOfferResource> getSpecOffers(PagedRequest pagedRequest);

}
