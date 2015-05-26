package org.lnu.is.web.rest.controller.person.contact;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.contact.PersonContactResource;
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
 * Controller for Person Contacts.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/persons")
public class PersonContactController extends BaseController implements CrudController<PersonContactResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PersonContactController.class);
	
	@Resource(name = "personContactFacade")
	private Facade<PersonContactResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/contacts", method = RequestMethod.POST)
	public PersonContactResource createResource(@Valid @RequestBody final PersonContactResource resource) {
		LOG.info("Creating person contact: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/contacts/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final PersonContactResource resource) {
		LOG.info("Updated person contact with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "PersonContact Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/contacts/{id}", method = RequestMethod.GET)
	public PersonContactResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving person contact with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/contacts/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing person contact with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "PersonContact removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/contacts", method = RequestMethod.GET)
	public PagedResultResource<PersonContactResource> getPagedResource(final PagedRequest<PersonContactResource> request) {
		LOG.info("Retrieving PagedResultResource for PersonContact Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}	
}
