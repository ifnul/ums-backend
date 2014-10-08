package org.lnu.is.facade.facade.specoffer;

import org.lnu.is.facade.resources.specoffer.SpecOfferResource;

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
	 * @param specOfferResource
	 * @return specoffer with generated identifier.
	 */
	SpecOfferResource createSpecOffer(SpecOfferResource specOfferResource);

}
