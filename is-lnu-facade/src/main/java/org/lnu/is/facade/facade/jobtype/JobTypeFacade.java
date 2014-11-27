package org.lnu.is.facade.facade.jobtype;

import org.lnu.is.facade.resource.jobtype.JobTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Interface for job types.
 * 
 * @author kushnir
 *
 */
public interface JobTypeFacade {
	/**
	 * Method for getting job types.
	 * 
	 * @param request
	 * @return paged result
	 */
	PagedResultResource<JobTypeResource> getEntities(PagedRequest<JobTypeResource> request);
}
