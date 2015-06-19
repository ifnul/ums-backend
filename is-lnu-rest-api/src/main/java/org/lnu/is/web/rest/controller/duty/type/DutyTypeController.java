package org.lnu.is.web.rest.controller.duty.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.duty.type.DutyTypeResource;
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
 * Duty type controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/duties/types")
public class DutyTypeController extends BaseController implements PagedController<DutyTypeResource, DutyTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(DutyTypeController.class);

	@Resource(name = "dutyTypeFacade")
	private Facade<DutyTypeResource, DutyTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Duty Types")
	public PagedResultResource<DutyTypeResource> getPagedResource(final PagedRequest<DutyTypeResource> request) {
		LOG.info("Getting PagedResultResource for Duty Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Duty Types by id")
	public DutyTypeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting duty type resource:{}", id);
		return facade.getResource(id);
	}

}
