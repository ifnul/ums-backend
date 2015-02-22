package org.lnu.is.web.rest.controller.markscale.exchange;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.markscale.exchange.MarkscaleExchangeResource;
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
 * Markscale exchange Controller.
 * @author OlehZanevych
 *
 */
@RestController
@RequestMapping("/markscales")
@Api("Markscale Exchange")
public class MarkscaleExchangeController extends BaseController implements CrudController<MarkscaleExchangeResource> {
	
	private static final Logger LOG = LoggerFactory.getLogger(MarkscaleExchangeController.class);

	@Resource(name = "markscaleExchangeFacade")
	private Facade<MarkscaleExchangeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{markscaleId}/exchanges", method = RequestMethod.POST)
	@ApiOperation(value = "Create Markscale Exchange", position = 1)
	public MarkscaleExchangeResource createResource(@Valid @RequestBody final MarkscaleExchangeResource resource) {
		LOG.info("Creating markscale exchange: {}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{markscaleId}/exchanges/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Markscale Exchange", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final MarkscaleExchangeResource resource) {
		LOG.info("Updating markscale with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Markscale Exchange Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{markscaleId}/exchanges/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Markscale Exchange by id", position = 3)
	public MarkscaleExchangeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving markscale exchange with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{markscaleId}/exchanges/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Markscale Exchange", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing markscale exchange with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Markscale Exchange removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{markscaleId}/exchanges", method = RequestMethod.GET)
	@ApiOperation(value = "Get Markscales Exchanges", position = 5)
	public PagedResultResource<MarkscaleExchangeResource> getPagedResource(final PagedRequest<MarkscaleExchangeResource> request) {
		LOG.info("Retrieving PagedResultResource for Markscale Exchange Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
