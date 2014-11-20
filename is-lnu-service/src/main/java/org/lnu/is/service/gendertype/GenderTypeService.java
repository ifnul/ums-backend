package org.lnu.is.service.gendertype;

import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.Service;

/**
 * Gender Type service.
 * 
 * @author kushnir
 *
 */
public interface GenderTypeService extends Service<GenderType> {

	/**
	 * Method for getting gender types.
	 * 
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<GenderType> getGenderTypes(PagedSearch<GenderType> pagedSearch);

}
