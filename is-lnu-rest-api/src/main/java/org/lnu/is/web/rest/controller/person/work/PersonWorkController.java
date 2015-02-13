package org.lnu.is.web.rest.controller.person.work;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.work.PersonWorkResource;
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
 * Controller for Person Works.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/persons")
public class PersonWorkController extends BaseController implements CrudController<PersonWorkResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PersonWorkController.class);
	
	@Resource(name = "personWorkFacade")
	private Facade<PersonWorkResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/works", method = RequestMethod.POST)
	public PersonWorkResource createResource(@Valid @RequestBody final PersonWorkResource resource) {
		LOG.info("Creating person work: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/works/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final PersonWorkResource resource) {
		LOG.info("Updated person work with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "PersonWork Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/works/{id}", method = RequestMethod.GET)
	public PersonWorkResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving person work with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/works/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing person work with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "PersonWork removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = { "/{personId}/works", "/works" }, method = RequestMethod.GET)
	public PagedResultResource<PersonWorkResource> getPagedResource(final PagedRequest<PersonWorkResource> request) {
		LOG.info("Retrieving PagedResultResource for PersonWork Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}	
}
