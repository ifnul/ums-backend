package org.lnu.is.web.rest.controller.marriedtype;

import javax.annotation.Resource;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.annotations.Offset;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.marriedtype.MarriedTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Married Type Controller.
 * @author Bohdan
 *
 */
@RestController
@RequestMapping("/marriedtypes")
@Api(value = "Married Types", description = "Married Types")
public class MarriedTypeController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(MarriedTypeController.class);
	
	@Resource(name = "marriedTypeFacade")
	private Facade<MarriedTypeResource, Long> facade;
	
	/**
	 * Method for getting paged result of married types.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Married Types")
	public PagedResultResource<MarriedTypeResource> getMarriedTypes(@Offset final Integer offset,
			@Limit final Integer limit, final MarriedTypeResource resource) {
		LOG.info("Getting PagedResultResource for Married Type with offset: {}, limit: {}", offset, limit);
		PagedRequest<MarriedTypeResource> request = new PagedRequest<MarriedTypeResource>(resource, offset, limit);
		return facade.getResources(request);	
	}

}
