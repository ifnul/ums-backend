package org.lnu.is.service.eduformtype;

import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Edu Form Type service.
 * @author ivanursul
 *
 */
public interface EduFormTypeService {

	/**
	 * Method for getting edu form types.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<EduFormType> getEduFormTypes(PagedSearch<EduFormType> pagedSearch);

}
