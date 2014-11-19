package org.lnu.is.service.specoffer.type;

import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.Service;

/**
 * Spec offer Type Service.
 * @author ivanursul
 *
 */
public interface SpecOfferTypeService extends Service<SpecOfferType> {

	/**
	 * Method for retrieving paged result.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<SpecOfferType> getSpecOfferTypes(PagedSearch<SpecOfferType> pagedSearch);

}
