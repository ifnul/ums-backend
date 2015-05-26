package org.lnu.is.web.rest.controller.mark.scale.exchange;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.mark.scale.exchange.MarkScaleExchangeResource;
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
 * MarkScale exchange Controller.
 * @author OlehZanevych
 *
 */
@RestController
@RequestMapping("/marks/scales")
@Api("MarkScale Exchange")
public class MarkScaleExchangeController extends BaseController implements CrudController<MarkScaleExchangeResource> {
	
	private static final Logger LOG = LoggerFactory.getLogger(MarkScaleExchangeController.class);

	@Resource(name = "markScaleExchangeFacade")
	private Facade<MarkScaleExchangeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{markScaleId}/exchanges", method = RequestMethod.POST)
	@ApiOperation(value = "Create MarkScale Exchange", position = 1)
	public MarkScaleExchangeResource createResource(@Valid @RequestBody final MarkScaleExchangeResource resource) {
		LOG.info("Creating markScale exchange: {}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{markScaleId}/exchanges/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update MarkScale Exchange", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final MarkScaleExchangeResource resource) {
		LOG.info("Updating markScale with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "MarkScale Exchange Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{markScaleId}/exchanges/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get MarkScale Exchange by id", position = 3)
	public MarkScaleExchangeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving markScale exchange with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{markScaleId}/exchanges/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete MarkScale Exchange", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing markScale exchange with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "MarkScale Exchange removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{markScaleId}/exchanges", method = RequestMethod.GET)
	@ApiOperation(value = "Get MarkScales Exchanges", position = 5)
	public PagedResultResource<MarkScaleExchangeResource> getPagedResource(final PagedRequest<MarkScaleExchangeResource> request) {
		LOG.info("Retrieving PagedResultResource for MarkScale Exchange Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
