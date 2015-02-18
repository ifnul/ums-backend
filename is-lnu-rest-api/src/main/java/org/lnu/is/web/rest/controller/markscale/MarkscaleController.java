package org.lnu.is.web.rest.controller.markscale;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.markscale.MarkscaleResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.CrudController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Markscale Controller.
 * @author OlehZanevych
 *
 */
@RestController
@RequestMapping("/markscales")
@Api("Markscale")
public class MarkscaleController extends BaseController implements CrudController<MarkscaleResource> {
	
	private static final Logger LOG = LoggerFactory.getLogger(MarkscaleController.class);

	@Resource(name = "markscaleFacade")
	private Facade<MarkscaleResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Markscale", position = 1)
	public MarkscaleResource createResource(@Valid @RequestBody final MarkscaleResource resource) {
		LOG.info("Creating markscale: {}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Markscale", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final MarkscaleResource resource) {
		LOG.info("Updating markscale with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Markscale Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Markscale by id", position = 3)
	public MarkscaleResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving markscale with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Markscale", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing markscale with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Markscale removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Markscales", position = 5)
	public PagedResultResource<MarkscaleResource> getPagedResource(final PagedRequest<MarkscaleResource> request) {
		LOG.info("Retrieving PagedResultResource for Markscale Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
