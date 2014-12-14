package org.lnu.is.web.rest.controller.person.name;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.person.name.PersonNameResource;
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

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Person Name Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/persons")
public class PersonNameController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(PersonNameController.class);
	
	@Resource(name = "personNameFacade")
	private Facade<PersonNameResource, Long> facade;
	
	/**
	 * Method for creating person name.
	 * @param resource
	 * @param personId
	 * @return generated person name.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/names", method = RequestMethod.POST)
	@ApiOperation(value = "Create PersonName", position = 1)
	public PersonNameResource createPersonName(@RequestBody final PersonNameResource resource,
			@PathVariable("personId") final Long personId) {
		LOG.info("Creating personName: {}", resource);
		return facade.createResource(resource);
	}
	
	/**
	 * Method for updating personName.
	 * @param id
	 * @param resource
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/names/{personNameId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update PersonName", position = 2)
	public MessageResource updatePersonName(@PathVariable("personId") final Long personId,
			@PathVariable("personNameId") final Long personNameId,
 			@RequestBody final PersonNameResource resource) {
		LOG.info("Updating personName with id: {}, {}", personNameId, resource);
		
		facade.updateResource(personNameId, resource);
		return new MessageResource(MessageType.INFO, "Person Name Updated");
	}
	
	/**
	 * Method for getting personName by identifier.
	 * @param id
	 * @return personName.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/names/{personNameId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get PersonName by id", position = 3)
	public PersonNameResource getPersonName(@PathVariable("personId") final Long personId,
			@PathVariable("personNameId") final Long personNameId) {
		LOG.info("Retrieving personName with id: {}", personNameId);
		
		return facade.getResource(personNameId);
	}
	
	/**
	 * Method for removing personName.
	 * @param id
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/names/{personNameId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete PersonName")
	public MessageResource removePersonName(@PathVariable("personId") final Long personId,
			@PathVariable("personNameId") final Long personNameId) {
		LOG.info("Removing personName with id: {}", personNameId);
		facade.removeResource(personNameId);
		
		return new MessageResource(MessageType.INFO, "PersonName removed");
	}
	
	/**
	 * Method for geting paged result of person names.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/names", method = RequestMethod.GET)
	@ApiOperation(value = "Get PersonNames")
	public PagedResultResource<PersonNameResource> getPersonNames(@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			final PersonNameResource resource) {
		LOG.info("Retrieving PagedResultResource for PersonName:{} Resources with offset: {}, limit: {}", resource.getPersonId(), offset, limit);
		PagedRequest<PersonNameResource> pagedRequest = new PagedRequest<PersonNameResource>(resource, offset, limit);
		
		return facade.getResources(pagedRequest);
	}
	
}
