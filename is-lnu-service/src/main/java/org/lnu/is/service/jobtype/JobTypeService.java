package org.lnu.is.service.jobtype;


import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.Service;

/**
 * 
 * @author kushnir
 *
 */
public interface JobTypeService extends Service<JobType> {

	/**
	 * Method for getting job types.
	 * @param pagedSearch
	 * @return paged result
	 */
	PagedResult<JobType> getJobTypes(PagedSearch<JobType> pagedSearch);
}
