package org.lnu.is.web.rest.controller.person.education;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.education.PersonEducationResource;
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
 * Controller for Person Educations.
 * @author illay
 *
 */
@RestController
@RequestMapping("/persons")
public class PersonEducationController extends BaseController implements CrudController<PersonEducationResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PersonEducationController.class);
	
	@Resource(name = "personEducationFacade")
	private Facade<PersonEducationResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/educations", method = RequestMethod.POST)
	public PersonEducationResource createResource(@Valid @RequestBody final PersonEducationResource resource) {
		LOG.info("Creating person education: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/educations/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final PersonEducationResource resource) {
		LOG.info("Updated person education with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "PersonEducation Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/educations/{id}", method = RequestMethod.GET)
	public PersonEducationResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving person education with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/educations/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing person education with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "PersonEducation removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = { "/{personId}/educations", "/contans" }, method = RequestMethod.GET)
	public PagedResultResource<PersonEducationResource> getPagedResource(final PagedRequest<PersonEducationResource> request) {
		LOG.info("Retrieving PagedResultResource for PersonEducation Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}	
}
