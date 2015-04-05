package org.lnu.is.web.rest.controller.admin.unit.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.adminunit.type.AdminUnitTypeResource;
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

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * ADmin unit type controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/adminunits/types")
public class AdminUnitTypeController extends BaseController implements PagedController<AdminUnitTypeResource> {
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminUnitTypeController.class);
	
	@Resource(name = "adminUnitTypeFacade")
	private Facade<AdminUnitTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Admin Unit Types")
	public PagedResultResource<AdminUnitTypeResource> getPagedResource(final PagedRequest<AdminUnitTypeResource> request) {
		LOGGER.info("Getting paged result for admin unit types:{}", request);
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Admin Unit Types by id")
	public AdminUnitTypeResource getResource(@PathVariable("id") final Long id) {
		LOGGER.info("Getting admin unit type:{}", id);
		return facade.getResource(id);
	}

}
