package org.lnu.is.dao.dao;

import org.lnu.is.dao.Dao;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Persistence for SpecOffer dao layer.
 * @author ivanursul
 *
 */
public interface SpecOfferDao extends Dao<SpecOffer, Long> {

	/**
	 * Method for getting paged results.
	 * @param pagedSearch context.
	 * @return paged entities.
	 */
	PagedResult<SpecOffer> getSpecOffers(PagedSearch<SpecOffer> pagedSearch);

}
