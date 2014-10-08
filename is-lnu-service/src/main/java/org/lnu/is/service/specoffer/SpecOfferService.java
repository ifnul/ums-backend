package org.lnu.is.service.specoffer;

import org.lnu.is.domain.specoffer.SpecOffer;

/**
 * Interface, that describes specoffer
 * functionality for service layer.
 * @author ivanursul
 *
 */
public interface SpecOfferService {

	/**
	 * Method for creating specoffer in service layer.
	 * @param specOffer
	 */
	void createSpecOffer(SpecOffer specOffer);

}
