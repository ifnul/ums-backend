package org.lnu.is.web.rest.controller.adminunit;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.adminunit.AdminUnitResource;
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

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Admin Units controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/adminunits")
public class AdminUnitController extends BaseController implements PagedController<AdminUnitResource> {
	private static final Logger LOG = LoggerFactory.getLogger(AdminUnitController.class);
	
	@Resource(name = "adminUnitFacade")
	private Facade<AdminUnitResource, Long> facade;
	
 	@Override
	@ResponseStatus(HttpStatus.OK)
 	@RequestMapping(method = RequestMethod.GET)
 	@ApiOperation(value = "Get All Married Types")
 	public PagedResultResource<AdminUnitResource> getPagedResource(final PagedRequest<AdminUnitResource> request) {
 		LOG.info("Getting PagedResultResource for Admin Unit Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
 		return facade.getResources(request);	
 	}


}
