package org.lnu.is.web.rest.controller.honors.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.honor.type.HonorTypeResource;
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
 * Controller for honor types.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping(value = "/honors/types")
@Api(value = "Honor Types", description = "Honor Types")
public class HonorTypeController extends BaseController implements PagedController<HonorTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(HonorTypeController.class);

	@Resource(name = "honorTypeFacade")
	private Facade<HonorTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Honor Types")
	public PagedResultResource<HonorTypeResource> getPagedResource(final PagedRequest<HonorTypeResource> request) {
		LOG.info("Getting PagedResultResource for Honor Type with  offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get honor type by id")
	public HonorTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
