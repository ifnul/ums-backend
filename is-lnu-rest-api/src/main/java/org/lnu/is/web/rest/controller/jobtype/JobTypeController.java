package org.lnu.is.web.rest.controller.jobtype;

import javax.annotation.Resource;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.jobtype.JobTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.PagedController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * 
 * @author kushnir
 *
 */
@RestController
@RequestMapping("/jobtypes")
@ApiModel(value = "Job Types", description = "Job Types")
public class JobTypeController extends BaseController implements PagedController<JobTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(JobTypeController.class);

	@Resource(name = "jobTypeFacade")
	private Facade<JobTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Job Types")
	public PagedResultResource<JobTypeResource> getPagedResource(@Limit(defaultValue = "38") final PagedRequest<JobTypeResource> request) {
		LOG.info("Getting PagedResultResource for Job Type with  offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

}
