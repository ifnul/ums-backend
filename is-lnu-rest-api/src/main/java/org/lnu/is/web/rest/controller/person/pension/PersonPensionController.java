package org.lnu.is.web.rest.controller.person.pension;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.pension.PersonPensionResource;
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
 * Persob Pension Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/persons")
public class PersonPensionController extends BaseController implements CrudController<PersonPensionResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PersonPensionController.class);
	
	@Resource(name = "personPensionFacade")
	private Facade<PersonPensionResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/pensions", method = RequestMethod.POST)
	public PersonPensionResource createResource(@Valid @RequestBody final PersonPensionResource personPensionResource) {
		LOG.info("Creating personPension: {}", personPensionResource);
		return facade.createResource(personPensionResource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/pensions/{personPensionId}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("personPensionId") final Long personPensionId,
 			@Valid @RequestBody final PersonPensionResource personPensionResource) {
		LOG.info("Updating personPension with id: {}, {}", personPensionId, personPensionResource);
		facade.updateResource(personPensionId, personPensionResource);
		return new MessageResource(MessageType.INFO);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/pensions/{personPensionId}", method = RequestMethod.GET)
	public PersonPensionResource getResource(@PathVariable("personPensionId") final Long personPensionId) {
		LOG.info("Retrieving personPension with id: {}", personPensionId);
		return facade.getResource(personPensionId);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/pensions/{personPensionId}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("personPensionId") final Long personPensionId) {
		LOG.info("Removing personPension with id: {}", personPensionId);
		facade.removeResource(personPensionId);
		return new MessageResource(MessageType.INFO, "PersonPension removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/pensions", method = RequestMethod.GET)
	public PagedResultResource<PersonPensionResource> getPagedResource(final PagedRequest<PersonPensionResource> request) {
		LOG.info("Retrieving PagedResultResource for PersonPension:{} Resources with offset: {}, limit: {}", request.getResource().getPersonId(), request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
	
}
