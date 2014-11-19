package org.lnu.is.facade.facade.enrolment.subject;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.enrolment.subject.EnrolmentSubjectResource;
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
