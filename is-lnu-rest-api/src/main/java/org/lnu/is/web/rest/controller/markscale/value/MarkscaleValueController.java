package org.lnu.is.web.rest.controller.markscale.value;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.markscale.value.MarkscaleValueResource;
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
 * Markscale value Controller.
 * @author OlehZanevych
 *
 */
@RestController
@RequestMapping("/markscales")
@Api("Markscale Value")
public class MarkscaleValueController extends BaseController implements CrudController<MarkscaleValueResource> {
	
	private static final Logger LOG = LoggerFactory.getLogger(MarkscaleValueController.class);

	@Resource(name = "markscaleValueFacade")
	private Facade<MarkscaleValueResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{markscaleId}/values", method = RequestMethod.POST)
	@ApiOperation(value = "Create Markscale Value", position = 1)
	public MarkscaleValueResource createResource(@Valid @RequestBody final MarkscaleValueResource resource) {
		LOG.info("Creating markscale value: {}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{markscaleId}/values/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Markscale Value", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final MarkscaleValueResource resource) {
		LOG.info("Updating markscale with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Markscale Value Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{markscaleId}/values/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Markscale Value by id", position = 3)
	public MarkscaleValueResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving markscale value with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{markscaleId}/values/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Markscale Value", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing markscale value with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Markscale Value removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{markscaleId}/values", method = RequestMethod.GET)
	@ApiOperation(value = "Get Markscales Values", position = 5)
	public PagedResultResource<MarkscaleValueResource> getPagedResource(final PagedRequest<MarkscaleValueResource> request) {
		LOG.info("Retrieving PagedResultResource for Markscale Value Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
