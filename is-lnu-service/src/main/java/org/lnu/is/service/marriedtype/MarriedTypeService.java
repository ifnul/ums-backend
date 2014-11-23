package org.lnu.is.service.marriedtype;

import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.Service;

/**
 * Married Type Service Interface.
 * @author Bohdan
 *
 */
public interface MarriedTypeService extends Service<MarriedType> {

	/**
	 * Method for getting Married Types as paged result.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<MarriedType> getMarriedTypes(PagedSearch<MarriedType> pagedSearch);
	
}
