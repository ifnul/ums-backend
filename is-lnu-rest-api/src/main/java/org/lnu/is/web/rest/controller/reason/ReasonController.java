package org.lnu.is.web.rest.controller.reason;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.reason.ReasonResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
public class ReasonController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(ReasonController.class);
	
	@Resource(name = "reasonFacade")
	private Facade<ReasonResource, Long> facade;
	
	/**
	 * Method for getting paged result of married types.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Reasons")
	public PagedResultResource<ReasonResource> getReasons(
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			final ReasonResource resource) {
		LOG.info("Getting PagedResultResource for Reasons with offset: {}, limit: {}", offset, limit);
		PagedRequest<ReasonResource> request = new PagedRequest<ReasonResource>(resource, offset, limit);
		return facade.getResources(request);	
	}

}
