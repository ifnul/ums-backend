package org.lnu.is.dao.dao.enrolmentstatustype;

import org.lnu.is.dao.Dao;
import org.lnu.is.domain.enrolmentstatustype.EnrolmentStatusType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Persistence for EnrolmentStatusTypeDao dao layer.
 * @author OlehZanevych
 */
public interface EnrolmentStatusTypeDao extends Dao<EnrolmentStatusType, Long> {
	
	/**
	 * Method for getting paged results.
	 * @param pagedSearch context.
	 * @return paged entities.
	 */
	PagedResult<EnrolmentStatusType> getEnrolmentStatusTypes(
			PagedSearch<EnrolmentStatusType> pagedSearch);
}