package org.lnu.is.web.rest.controller.person.family;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.family.PersonFamilyResource;
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


/**
 * Controller for Person Familys.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/persons")
public class PersonFamilyController extends BaseController implements CrudController<PersonFamilyResource, PersonFamilyResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PersonFamilyController.class);
	
	@Resource(name = "personFamilyFacade")
	private Facade<PersonFamilyResource, PersonFamilyResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/families", method = RequestMethod.POST)
	public PersonFamilyResource createResource(@Valid @RequestBody final PersonFamilyResource resource) {
		LOG.info("Creating person family: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/families/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final PersonFamilyResource resource) {
		LOG.info("Updated person family with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "PersonFamily Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/families/{id}", method = RequestMethod.GET)
	public PersonFamilyResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving person family with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/families/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing person family with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "PersonFamily removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/families", method = RequestMethod.GET)
	public PagedResultResource<PersonFamilyResource> getPagedResource(final PagedRequest<PersonFamilyResource> request) {
		LOG.info("Retrieving PagedResultResource for PersonFamily Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

}
