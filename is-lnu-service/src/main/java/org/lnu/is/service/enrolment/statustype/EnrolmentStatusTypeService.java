package org.lnu.is.service.enrolment.statustype;

import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.Service;

/**
 * Interface, that describes enrolmentstatustype
 * functionality for service layer.
 * @author OlehZanevych
 *
 */
public interface EnrolmentStatusTypeService extends Service<EnrolmentStatusType> {
	
	/**
	 * Method for creating enrolmentstatustype in service layer.
	 * @param enrolmentStatusType
	 */
	void createEnrolmentStatusType(EnrolmentStatusType enrolmentStatusType);

	/**
	 * Method for getting enrolmentstatustype by it's identifier.
	 * @param id identifier
	 * @return EnrolmentStatusType entity.
	 */
	EnrolmentStatusType getEnrolmentStatusType(Long id);

	/**
	 * Method for updating enrolmentstatustype.
	 * @param enrolmentStatusType entity
	 */
	void updateEnrolmentStatusType(EnrolmentStatusType enrolmentStatusType);
	
	/**
	 * Method for removing enrolmentstatustype by it's identifier.
	 * @param enrolmentStatusType entity
	 */
	void removeEnrolmentStatusType(EnrolmentStatusType enrolmentStatusType);

	/**
	 * Method for getting enrolmentStatusTypes as paged result.
	 * @param pagedSearch search context
	 * @return Paged Entities.
	 */
	PagedResult<EnrolmentStatusType> getEnrolmentStatusTypes(PagedSearch<EnrolmentStatusType> pagedSearch);
}
