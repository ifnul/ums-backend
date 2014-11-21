package org.lnu.is.facade.facade.jobtype;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.jobtype.JobTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.jobtype.JobTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
/**
 * 
 * @author kushnir
 *
 */
@Transactional
@Facade("jobTypeFacade")
public class DefaultJobTypeFacade extends BaseFacade<JobTypeResource, JobType> implements JobTypeFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultJobTypeFacade.class);

	@Resource(name = "jobTypeConverter")
	private Converter<JobType, JobTypeResource> jobTypeConverter;

	@Resource(name = "jobTypeResourceConverter")
	private Converter<JobTypeResource, JobType> jobTypeResourceConverter;

	@Resource(name = "jobTypeService")
	private JobTypeService jobTypeService;

	@Override
	public PagedResultResource<JobTypeResource> getJobTypes(final PagedRequest<JobTypeResource> request) {
		LOG.info("Getting paged result for job types: {}", request);

		PagedSearch<JobType> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(jobTypeResourceConverter.convert(request.getResource()));

		PagedResult<JobType> pagedResult = jobTypeService.getJobTypes(pagedSearch);
		List<JobTypeResource> resources = jobTypeConverter.convertAll(pagedResult.getEntities());
		PagedResultResource<JobTypeResource> pagedResultResource = new PagedResultResource<JobTypeResource>("/jobtypes");

		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);
		return pagedResultResource;
	}

}
