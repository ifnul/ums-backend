package org.lnu.is.web.rest.controller.markscale.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.markscale.type.MarkscaleTypeResource;
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
 * Markscale Type controller.
 * @author OlehZanevych
 *
 */
@RestController
@RequestMapping("/markscales/types")
public class MarkscaleTypeController extends BaseController implements PagedController<MarkscaleTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(MarkscaleTypeController.class);

	@Resource(name = "markscaleTypeFacade")
	private Facade<MarkscaleTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Markscale Type Resources")
	public PagedResultResource<MarkscaleTypeResource> getPagedResource(final PagedRequest<MarkscaleTypeResource> request) {
		LOG.info("Getting PagedResultResource for Markscale Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get MarkscaleTypeResource by id")
	public MarkscaleTypeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting markscale type resource:{}", id);
		return facade.getResource(id);
	}
}
