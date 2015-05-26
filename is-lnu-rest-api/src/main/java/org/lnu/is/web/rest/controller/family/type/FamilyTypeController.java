package org.lnu.is.web.rest.controller.family.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.family.type.FamilyTypeResource;
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
 * Family Type Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/families/types")
public class FamilyTypeController extends BaseController implements PagedController<FamilyTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(FamilyTypeController.class);

	@Resource(name = "familyTypeFacade")
	private Facade<FamilyTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Family Types")
	public PagedResultResource<FamilyTypeResource> getPagedResource(final PagedRequest<FamilyTypeResource> request) {
		LOG.info("Getting PagedResultResource for Family Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Family Types by id")
	public FamilyTypeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting family type resource:{}", id);
		return facade.getResource(id);
	}

}
