package org.lnu.is.facade.facade.enrolment.statustype;

import org.lnu.is.facade.resource.enrolment.statustype.EnrolmentStatusTypeResource;
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
	PagedResultResource<EnrolmentStatusTypeResource> getEntities(PagedRequest<EnrolmentStatusTypeResource> request);
}
