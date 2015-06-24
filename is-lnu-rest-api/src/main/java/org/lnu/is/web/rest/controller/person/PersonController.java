package org.lnu.is.web.rest.controller.person;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.PersonResource;
import org.lnu.is.resource.person.PersonResourceList;
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

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * Persons controller.
 * 
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/persons")
@Api(value = "persons", description = "Persons", position = 2)
public class PersonController extends BaseController implements CrudController<PersonResource, PersonResourceList> {
	private static final Logger LOG = LoggerFactory.getLogger(PersonController.class);

	@Resource(name = "personFacade")
	private Facade<PersonResource, PersonResourceList, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Person", position = 1)
	public PersonResource createResource(@Valid @RequestBody final PersonResource personResource) {
		LOG.info("Creating person: {}", personResource);
		return facade.createResource(personResource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update Person", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final PersonResource personResource) {
		LOG.info("Updating person with id: {}, {}", id, personResource);
		facade.updateResource(id, personResource);
		return new MessageResource(MessageType.INFO);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Person by id", position = 3)
	public PersonResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving person with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Person", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing person with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Person removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Persons")
	public PagedResultResource<PersonResource> getPagedResource(final PagedRequest<PersonResourceList> request) {
		LOG.info("Retrieving PagedResultResource for Person Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
