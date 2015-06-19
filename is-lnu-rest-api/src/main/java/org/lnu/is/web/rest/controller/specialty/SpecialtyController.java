package org.lnu.is.web.rest.controller.specialty;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.specialty.SpecialtyResource;
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

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Controller, that handles all operations with
 * Specialty entity.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/specialties")
@Api(value = "specialties", description = "Specialties", position = 2)
public class SpecialtyController extends BaseController implements CrudController<SpecialtyResource, SpecialtyResource> {
	private static final Logger LOG = LoggerFactory.getLogger(SpecialtyController.class);
	
	@Resource(name = "specialtyFacade")
	private Facade<SpecialtyResource, SpecialtyResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Specialty", position = 1)
	public SpecialtyResource createResource(@Valid @RequestBody final SpecialtyResource specialtyResource) {
		LOG.info("Creating specialty: {}", specialtyResource);
		return facade.createResource(specialtyResource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update Specialty", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final SpecialtyResource specialtyResource) {
		LOG.info("Updated specialty with id: {}, {}", id, specialtyResource);
		facade.updateResource(id, specialtyResource);
		return new MessageResource(MessageType.INFO, "Specialty Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Specailty by id", position = 3)
	public SpecialtyResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving specialty with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Specialty", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing specoffer with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Specialty removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Specailties", position = 5)
	public PagedResultResource<SpecialtyResource> getPagedResource(final PagedRequest<SpecialtyResource> request) {
		LOG.info("Retrieving PagedResultResource for Specialty Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}	
}
