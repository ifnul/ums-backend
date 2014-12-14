package org.lnu.is.web.rest.controller.person;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.person.PersonResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Persons controller.
 * 
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/persons")
@Api(value = "persons", description = "Persons", position = 2)
public class PersonController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(PersonController.class);

	@Resource(name = "personFacade")
	private Facade<PersonResource, Long> facade;

	/**
	 * Method for creating new person.
	 * @param personResource
	 * @return person with generated identifier.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Person", position = 1)
	public PersonResource createPerson(@RequestBody final PersonResource personResource) {
		LOG.info("Creating person: {}", personResource);
		return facade.createResource(personResource);
	}

	/**
	 * Method for updating person.
	 * @param id
	 * @param personResource
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Person", position = 2)
	public MessageResource updatePerson(@PathVariable("id") final Long id,
			@RequestBody final PersonResource personResource) {
		LOG.info("Updating person with id: {}, {}", id, personResource);
		facade.updateResource(id, personResource);
		return new MessageResource(MessageType.INFO, "Person Updated");
	}

	/**
	 * Method for getting person by identifier.
	 * @param id
	 * @return person.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Person by id", position = 3)
	public PersonResource getPerson(@PathVariable("id") final Long id) {
		LOG.info("Retrieving person with id: {}", id);
		return facade.getResource(id);
	}

	/**
	 * Method for removing person.
	 * @param id
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Person", position = 4)
	public MessageResource removePerson(@PathVariable("id") final Long id) {
		LOG.info("Removing person with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Person removed");
	}

	/**
	 * Method for geting paged result of persons.
	 * 
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Persons", position = 5)
	public PagedResultResource<PersonResource> getPersons(
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit, 
			final PersonResource resource) {
		LOG.info("Retrieving PagedResultResource for Person Resources with offset: {}, limit: {}", offset, limit);
		PagedRequest<PersonResource> pagedRequest = new PagedRequest<PersonResource>(resource, offset, limit);
		return facade.getResources(pagedRequest);
	}
}
