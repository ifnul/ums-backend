package org.lnu.is.web.rest.controller.mark.scale.value;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.mark.scale.value.MarkScaleValueResource;
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
 * MarkScale value Controller.
 * @author OlehZanevych
 *
 */
@RestController
@RequestMapping("/marks/scales")
@Api("MarkScale Value")
public class MarkScaleValueController extends BaseController implements CrudController<MarkScaleValueResource, MarkScaleValueResource> {
	
	private static final Logger LOG = LoggerFactory.getLogger(MarkScaleValueController.class);

	@Resource(name = "markScaleValueFacade")
	private Facade<MarkScaleValueResource, MarkScaleValueResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{markScaleId}/values", method = RequestMethod.POST)
	@ApiOperation(value = "Create MarkScale Value", position = 1)
	public MarkScaleValueResource createResource(@Valid @RequestBody final MarkScaleValueResource resource) {
		LOG.info("Creating markScale value: {}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{markScaleId}/values/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update MarkScale Value", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final MarkScaleValueResource resource) {
		LOG.info("Updating markScale with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "MarkScale Value Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{markScaleId}/values/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get MarkScale Value by id", position = 3)
	public MarkScaleValueResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving markScale value with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{markScaleId}/values/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete MarkScale Value", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing markScale value with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "MarkScale Value removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{markScaleId}/values", method = RequestMethod.GET)
	@ApiOperation(value = "Get MarkScales Values", position = 5)
	public PagedResultResource<MarkScaleValueResource> getPagedResource(final PagedRequest<MarkScaleValueResource> request) {
		LOG.info("Retrieving PagedResultResource for MarkScale Value Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
