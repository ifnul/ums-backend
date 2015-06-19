package org.lnu.is.web.rest.controller.degree.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.degree.type.DegreeTypeResource;
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
 * Degree type controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/degrees/types")
public class DegreeTypeController extends BaseController implements PagedController<DegreeTypeResource, DegreeTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(DegreeTypeController.class);

	@Resource(name = "degreeTypeFacade")
	private Facade<DegreeTypeResource, DegreeTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Degree Types")
	public PagedResultResource<DegreeTypeResource> getPagedResource(final PagedRequest<DegreeTypeResource> request) {
		LOG.info("Getting PagedResultResource for Degree Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Degree Types by id")
	public DegreeTypeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting degree type resource:{}", id);
		return facade.getResource(id);
	}

}
