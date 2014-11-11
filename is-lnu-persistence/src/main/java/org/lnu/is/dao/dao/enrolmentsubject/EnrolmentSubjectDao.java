package org.lnu.is.dao.dao.enrolmentsubject;

import org.lnu.is.dao.Dao;
import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Interface, that declares all operations with enrolment subject.
 * @author ivanursul
 *
 */
public interface EnrolmentSubjectDao extends Dao<EnrolmentSubject, Long> {

	/**
	 * Method for getting enrolment subjects.
	 * @author ivanursul
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<EnrolmentSubject> getEnrolmentSubjects(PagedSearch<EnrolmentSubject> pagedSearch);

}
