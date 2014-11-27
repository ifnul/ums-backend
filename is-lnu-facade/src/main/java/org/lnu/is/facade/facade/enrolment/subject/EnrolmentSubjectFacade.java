package org.lnu.is.facade.facade.enrolment.subject;

import org.lnu.is.facade.resource.enrolment.subject.EnrolmentSubjectResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Enrolment Subject Facade.
 * @author ivanursul
 *
 */
public interface EnrolmentSubjectFacade {

	/**
	 * Method for getting paged result.
	 * @param request
	 * @return paged result.
	 */
	PagedResultResource<EnrolmentSubjectResource> getEntities(PagedRequest<EnrolmentSubjectResource> request);

}
