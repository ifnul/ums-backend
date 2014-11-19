package org.lnu.is.service.person.type;

import org.lnu.is.domain.person.PersonType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Interface for person type service.
 * @author ivanursul
 *
 */
public interface PersonTypeService {

	/**
	 * Method for getting person types.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<PersonType> getPersonTypes(PagedSearch<PersonType> pagedSearch);

}
