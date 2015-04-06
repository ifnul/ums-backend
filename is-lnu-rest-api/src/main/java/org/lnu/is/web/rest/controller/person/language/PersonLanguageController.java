package org.lnu.is.web.rest.controller.person.language;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.language.PersonLanguageResource;
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
 * Controller for Person Languages.
 * @author illay
 *
 */
@RestController
@RequestMapping("/persons")
public class PersonLanguageController extends BaseController implements CrudController<PersonLanguageResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PersonLanguageController.class);
	
	@Resource(name = "personLanguageFacade")
	private Facade<PersonLanguageResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/languages", method = RequestMethod.POST)
	public PersonLanguageResource createResource(@Valid @RequestBody final PersonLanguageResource resource) {
		LOG.info("Creating person Language: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/languages/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final PersonLanguageResource resource) {
		LOG.info("Updated person Language with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "PersonLanguage Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/languages/{id}", method = RequestMethod.GET)
	public PersonLanguageResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving person Language with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/languages/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing person Language with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "PersonLanguage removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/languages", method = RequestMethod.GET)
	public PagedResultResource<PersonLanguageResource> getPagedResource(final PagedRequest<PersonLanguageResource> request) {
		LOG.info("Retrieving PagedResultResource for PersonLanguage Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}	
}
