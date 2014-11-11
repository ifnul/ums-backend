package org.lnu.is.service.specoffer;

import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.Service;

/**
 * Interface, that describes specoffer
 * functionality for service layer.
 * @author ivanursul
 *
 */
public interface SpecOfferService extends Service<SpecOffer> {

	/**
	 * Method for creating specoffer in service layer.
	 * @param specOffer
	 */
	void createSpecOffer(SpecOffer specOffer);

	/**
	 * Method for getting specoffer by it's identifier.
	 * @param id identifier.
	 * @return Specoffer entity.
	 */
	SpecOffer getSpecOffer(Long id);

	/**
	 * Method for updating specoffer.
	 * @param specOffer entity.
	 */
	void updateSpecOffer(SpecOffer specOffer);

	/**
	 * Method for removing specoffer by it's identifier.
	 * 
	 * @param specOffer specoffer.
	 */
	void removeSpecOffer(SpecOffer specOffer);

	/**
	 * Method for getting spec offers as paged result.
	 * @param pagedSearch search context.
	 * @return Paged Entities.
	 */
	PagedResult<SpecOffer> getSpecOffers(PagedSearch<SpecOffer> pagedSearch);

}
