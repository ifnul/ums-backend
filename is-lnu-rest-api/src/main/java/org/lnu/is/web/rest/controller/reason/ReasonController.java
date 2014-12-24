package org.lnu.is.web.rest.controller.reason;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.reason.ReasonResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
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
 * Reason controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/reasons")
@Api("Reason Controller")
public class ReasonController extends BaseController implements PagedController<ReasonResource> {
	private static final Logger LOG = LoggerFactory.getLogger(ReasonController.class);
	
	@Resource(name = "reasonFacade")
	private Facade<ReasonResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Reasons")
	public PagedResultResource<ReasonResource> getPagedResource(final PagedRequest<ReasonResource> request) {
		LOG.info("Getting PagedResultResource for Reasons with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);	
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get reason resource by id")
	public ReasonResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
