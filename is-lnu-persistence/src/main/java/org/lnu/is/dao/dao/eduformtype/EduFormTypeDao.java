package org.lnu.is.dao.dao.eduformtype;

import org.lnu.is.dao.Dao;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Edu Form Type Dao interface.
 * @author ivanursul
 *
 */
public interface EduFormTypeDao extends Dao<EduFormType, Long> {

	/**
	 * Method for getting edu form types.
	 * @param pagedSearch
	 * @return edu form types.
	 */
	PagedResult<EduFormType> getEduFormTypes(PagedSearch<EduFormType> pagedSearch);

}
