package org.lnu.is.web.rest.controller.gender.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.gender.type.GenderTypeResource;
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
 * Controller for gender types.
 * @author kushnir
 *
 */
@RestController
@RequestMapping(value = "/gendertypes")
@Api(value = "Gender Types", description = "Gender Types")
public class GenderTypeController extends BaseController implements PagedController<GenderTypeResource, GenderTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(GenderTypeController.class);

	@Resource(name = "genderTypeFacade")
	private Facade<GenderTypeResource, GenderTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Gender Types")
	public PagedResultResource<GenderTypeResource> getPagedResource(final PagedRequest<GenderTypeResource> request) {
		LOG.info("Getting PagedResultResource for Gender Type with  offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get gender type by id")
	public GenderTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
