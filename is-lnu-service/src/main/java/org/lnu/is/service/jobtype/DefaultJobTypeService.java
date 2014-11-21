package org.lnu.is.service.jobtype;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.jobtype.JobTypeDao;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * 
 * @author kushnir
 *
 */
@Service("jobTypeService")
public class DefaultJobTypeService implements JobTypeService {

	@Resource(name = "jobTypeDao")
	private JobTypeDao jobTypeDao;

	@Resource(name = "jobTypeParametersExtractor")
	private ParametersExtractor<JobType> jobTypeParametersExtractor;

	@Override
	public PagedResult<JobType> getJobTypes(final PagedSearch<JobType> pagedSearch) {
		Map<String, Object> parameters = jobTypeParametersExtractor.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);

		return jobTypeDao.getEntities(pagedSearch);
	}

}
