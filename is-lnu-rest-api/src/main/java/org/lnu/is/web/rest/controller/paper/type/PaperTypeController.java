package org.lnu.is.web.rest.controller.paper.type;

import javax.annotation.Resource;

import org.lnu.is.annotations.Limit;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.paper.type.PaperTypeResource;
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
 * Paper Type Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/papers/types")
@Api(value = "Paper Types", description = "Paper Types")
public class PaperTypeController extends BaseController implements PagedController<PaperTypeResource, PaperTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PaperTypeController.class);
	
	@Resource(name = "paperTypeFacade")
	private Facade<PaperTypeResource, PaperTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Paper Types")
	public PagedResultResource<PaperTypeResource> getPagedResource(@Limit(defaultValue = "60") final PagedRequest<PaperTypeResource> request) {
		LOG.info("Getting PagedResultResource for Paper Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get paper type  by id")
	public PaperTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
