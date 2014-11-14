package org.lnu.is.facade.facade.enrolmentstatustype;

import org.lnu.is.facade.resource.enrolmentstatustype.EnrolmentStatusTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Enrolment Status Type interface.
 * 
 * @author kushnir
 *
 */
public interface EnrolmentStatusTypeFacade {

	/**
	 * Method for paged result.
	 * 
	 * @param request
	 * @return paged result.
	 */
	PagedResultResource<EnrolmentStatusTypeResource> getEnrolmentStatusTypes(
			PagedRequest<EnrolmentStatusTypeResource> request);
}
