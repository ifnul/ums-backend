package org.lnu.is.web.rest.controller.specialty.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specialty.type.SpecialtyTypeResource;
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
 * Controller for specialty types.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/specialties/types")
@Api("Specialty Types")
public class SpecialtyTypeController extends BaseController implements PagedController<SpecialtyTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(SpecialtyTypeController.class);
	
	@Resource(name = "specialtyTypeFacade")
	private Facade<SpecialtyTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Specialty Types")
	public PagedResultResource<SpecialtyTypeResource> getPagedResource(final PagedRequest<SpecialtyTypeResource> request) {
		LOG.info("Getting PagedResultResource for Specialty Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);	
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get  specialty type resource by id")
	public SpecialtyTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
