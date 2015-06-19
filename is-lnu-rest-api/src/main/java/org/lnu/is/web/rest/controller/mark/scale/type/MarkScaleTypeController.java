package org.lnu.is.web.rest.controller.mark.scale.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.mark.scale.type.MarkScaleTypeResource;
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
 * MarkScale Type controller.
 * @author OlehZanevych
 *
 */
@RestController
@RequestMapping("/marks/scales/types")
public class MarkScaleTypeController extends BaseController implements PagedController<MarkScaleTypeResource, MarkScaleTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(MarkScaleTypeController.class);

	@Resource(name = "markScaleTypeFacade")
	private Facade<MarkScaleTypeResource, MarkScaleTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All MarkScale Type Resources")
	public PagedResultResource<MarkScaleTypeResource> getPagedResource(final PagedRequest<MarkScaleTypeResource> request) {
		LOG.info("Getting PagedResultResource for MarkScale Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get MarkScaleTypeResource by id")
	public MarkScaleTypeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting markscale type resource:{}", id);
		return facade.getResource(id);
	}
}
