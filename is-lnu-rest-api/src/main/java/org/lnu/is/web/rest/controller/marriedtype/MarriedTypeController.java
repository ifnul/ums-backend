package org.lnu.is.web.rest.controller.marriedtype;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.marriedtype.MarriedTypeResource;
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
 * Married Type Controller.
 * @author Bohdan
 *
 */
@RestController
@RequestMapping("/marriedtypes")
@Api(value = "Married Types", description = "Married Types")
public class MarriedTypeController extends BaseController implements PagedController<MarriedTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(MarriedTypeController.class);
	
	@Resource(name = "marriedTypeFacade")
	private Facade<MarriedTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Married Types")
	public PagedResultResource<MarriedTypeResource> getPagedResource(final PagedRequest<MarriedTypeResource> request) {
		LOG.info("Getting PagedResultResource for Married Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get married type  by id")
	public MarriedTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
