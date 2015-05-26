package org.lnu.is.web.rest.controller.mark.scale;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.mark.scale.MarkScaleResource;
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
 * MarkScale Controller.
 * @author OlehZanevych
 *
 */
@RestController
@RequestMapping("/marks/scales")
@Api("MarkScale")
public class MarkScaleController extends BaseController implements CrudController<MarkScaleResource> {
	
	private static final Logger LOG = LoggerFactory.getLogger(MarkScaleController.class);

	@Resource(name = "markScaleFacade")
	private Facade<MarkScaleResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create MarkScale", position = 1)
	public MarkScaleResource createResource(@Valid @RequestBody final MarkScaleResource resource) {
		LOG.info("Creating markScale: {}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update MarkScale", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final MarkScaleResource resource) {
		LOG.info("Updating markScale with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "MarkScale Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get MarkScale by id", position = 3)
	public MarkScaleResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving markScale with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete MarkScale", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing markScale with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "MarkScale removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get MarkScales", position = 5)
	public PagedResultResource<MarkScaleResource> getPagedResource(final PagedRequest<MarkScaleResource> request) {
		LOG.info("Retrieving PagedResultResource for MarkScale Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
