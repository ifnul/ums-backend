package org.lnu.is.web.controller.person.award;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.person.award.PersonAwardFacade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.person.award.PersonAwardResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.BaseController;
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
 * Persob Award Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/persons")
@Api(value = "Person Awards", description = "Person Awards")
public class PersonAwardController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(PersonAwardController.class);
	
	@Resource(name = "personAwardFacade")
	private PersonAwardFacade personAwardFacade;
	
	/**
	 * Method for creating person award.
	 * @param personAwardResource
	 * @param personId
	 * @return generated person award.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/awards", method = RequestMethod.POST)
	@ApiOperation(value = "Create PersonAward")
	public PersonAwardResource createPersonAward(@RequestBody final PersonAwardResource personAwardResource,
			@PathVariable("personId") final Long personId) {
		LOG.info("Creating personAward: {}", personAwardResource);
		return personAwardFacade.createEntity(personAwardResource);
	}
	
	/**
	 * Method for updating personAward.
	 * @param id
	 * @param personAwardResource
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/awards/{personAwardId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update PersonAward")
	public MessageResource updatePersonAward(@PathVariable("personId") final Long personId,
			@PathVariable("personAwardId") final Long personAwardId,
 			@RequestBody final PersonAwardResource personAwardResource) {
		LOG.info("Updating personAward with id: {}, {}", personAwardId, personAwardResource);
		
		personAwardFacade.updateEntity(personAwardId, personAwardResource);
		return new MessageResource(MessageType.INFO, "Person Award Updated");
	}
	
	/**
	 * Method for getting personAward by identifier.
	 * @param id
	 * @return personAward.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/awards/{personAwardId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get PersonAward by id", position = 3)
	public PersonAwardResource getPersonAward(@PathVariable("personId") final Long personId,
			@PathVariable("personAwardId") final Long personAwardId) {
		LOG.info("Retrieving personAward with id: {}", personAwardId);
		return personAwardFacade.getEntity(personAwardId);
	}
	
	/**
	 * Method for removing personAward.
	 * @param id
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/awards/{personAwardId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete PersonAward", position = 4)
	public MessageResource removePersonAward(@PathVariable("personId") final Long personId,
			@PathVariable("personAwardId") final Long personAwardId) {
		LOG.info("Removing personAward with id: {}", personAwardId);
		personAwardFacade.removeEntity(personAwardId);
		return new MessageResource(MessageType.INFO, "PersonAward removed");
	}
	
	/**
	 * Method for geting paged result of person awards.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{person}/awards", method = RequestMethod.GET)
	@ApiOperation(value = "Get PersonAwards", position = 5)
	public PagedResultResource<PersonAwardResource> getPersonAwards(@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			@PathVariable("person") final Long persId,
			final PersonAwardResource resource) {
		LOG.info("Retrieving PagedResultResource for PersonAward:{} Resources with offset: {}, limit: {}", persId, offset, limit);
		resource.setPersonId(persId);
		PagedRequest<PersonAwardResource> pagedRequest = new PagedRequest<PersonAwardResource>(resource, offset, limit);
		return personAwardFacade.getEntities(pagedRequest);
	}
	
}
