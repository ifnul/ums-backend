package org.lnu.is.dao.dao.specoffertype;

import org.lnu.is.dao.Dao;
import org.lnu.is.domain.specoffertype.SpecOfferType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Spec Offer Type interface.
 * @author ivanursul
 *
 */
public interface SpecOfferTypeDao extends Dao<SpecOfferType, Long> {

	/**
	 * Method for getting spec offer types.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<SpecOfferType> getSpecOfferTypes(PagedSearch<SpecOfferType> pagedSearch);
}
