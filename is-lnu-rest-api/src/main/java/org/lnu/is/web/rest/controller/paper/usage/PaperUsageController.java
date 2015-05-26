package org.lnu.is.web.rest.controller.paper.usage;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.paper.usage.PaperUsageResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.PagedController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Paper Type Controller.
 * @author illay
 *
 */
@RestController
@RequestMapping("/papers/usages")
@Api(value = "Paper Usage", description = "Paper Usage")
public class PaperUsageController extends BaseController implements PagedController<PaperUsageResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PaperUsageController.class);
	
	@Resource(name = "paperUsageFacade")
	private Facade<PaperUsageResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Paper Usages")
	public PagedResultResource<PaperUsageResource> getPagedResource(final PagedRequest<PaperUsageResource> request) {
		LOG.info("Getting PagedResultResource for Paper Usage with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get paper usage  by id")
	public PaperUsageResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
