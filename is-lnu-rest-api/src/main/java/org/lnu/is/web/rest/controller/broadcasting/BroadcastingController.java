package org.lnu.is.web.rest.controller.broadcasting;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
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

/**
 * Controller for broadcasting.
 * This methods allows you to 
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/broadcastings")
public class BroadcastingController extends BaseController implements CrudController<BroadcastingMessageResource, BroadcastingMessageResource> {
	private static final Logger LOG = LoggerFactory.getLogger(BroadcastingController.class);
	
	@Resource(name = "broadcastingFacade")
	private Facade<BroadcastingMessageResource, BroadcastingMessageResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	public PagedResultResource<BroadcastingMessageResource> getPagedResource(final PagedRequest<BroadcastingMessageResource> request) {
		LOG.info("Getting broadcasting messages: {}", request);
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	public BroadcastingMessageResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting Broadcast message by id : {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	public BroadcastingMessageResource createResource(@Valid @RequestBody final BroadcastingMessageResource resource) {
		LOG.info("Creating new broadcast: {}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id, 
			@Valid @RequestBody final BroadcastingMessageResource resource) {
		LOG.info("Updating resource: {},{}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO);
	}

}
