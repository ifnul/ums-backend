package org.lnu.is.service.enrolmentsubject;

import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Enrolment Subject Service.
 * @author ivanursul
 *
 */
public interface EnrolmentSubjectService {

	/**
	 * Method for getting all enrolment subjects.
	 * @author ivanursul
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<EnrolmentSubject> getEnrolmentSubjects(PagedSearch<EnrolmentSubject> pagedSearch);

}
