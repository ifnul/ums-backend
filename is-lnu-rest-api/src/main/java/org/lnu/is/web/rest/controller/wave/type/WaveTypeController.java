package org.lnu.is.web.rest.controller.wave.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.wave.type.WaveTypeResource;
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
 * WaveType controller.
 * @author illay
 *
 */
@RestController
@RequestMapping("/wave/types")
public class WaveTypeController extends BaseController implements PagedController<WaveTypeResource, WaveTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(WaveTypeController.class);
	
	@Resource(name = "waveTypeFacade")
	private Facade<WaveTypeResource, WaveTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Wave Types")
	public PagedResultResource<WaveTypeResource> getPagedResource(final PagedRequest<WaveTypeResource> request) {
		LOG.info("Getting PagedResultResource for Wave Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);	
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get wave type by id")
	public WaveTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}
}
