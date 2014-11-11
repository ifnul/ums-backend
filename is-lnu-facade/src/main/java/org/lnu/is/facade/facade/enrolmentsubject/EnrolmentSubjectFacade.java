package org.lnu.is.facade.facade.enrolmentsubject;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.enrolmentsubject.EnrolmentSubjectResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Enrolment Subject Facade.
 * @author ivanursul
 *
 */
public interface EnrolmentSubjectFacade extends Facade<EnrolmentSubjectResource> {

	/**
	 * Method for getting paged result.
	 * @author ivanursul
	 * @param request
	 * @return paged result.
	 */
	PagedResultResource<EnrolmentSubjectResource> getEnrolmentSubjects(PagedRequest<EnrolmentSubjectResource> request);

}
