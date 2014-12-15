package org.lnu.is.web.rest.controller.person.paper;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.person.paper.PersonPaperResource;
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
 * Controller, that handles all operations with person.
 * @author ivanursul
 * 
 */
@RestController
@RequestMapping("/persons")
@Api(value = "Person Papers", description = "Person Papers")
public class PersonPaperController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(PersonPaperController.class);
	
	@Resource(name = "personPaperFacade")
	private Facade<PersonPaperResource, Long> facade;
	
	/**
	 * Method for creating person paper.
	 * @param personPaperResource
	 * @param personId
	 * @return generated person paper.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/papers", method = RequestMethod.POST)
	@ApiOperation(value = "Create PersonPaper", position = 1)
	public PersonPaperResource createPersonPaper(@RequestBody final PersonPaperResource personPaperResource,
			@PathVariable("personId") final Long personId) {
		LOG.info("Creating personPaper: {}", personPaperResource);
		return facade.createResource(personPaperResource);
	}
	
	/**
	 * Method for updating personPaper.
	 * @param id
	 * @param personPaperResource
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/papers/{personPaperId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update PersonPaper", position = 2)
	public MessageResource updatePersonPaper(@PathVariable("personId") final Long personId,
			@PathVariable("personPaperId") final Long personPaperId,
 			@RequestBody final PersonPaperResource personPaperResource) {
		LOG.info("Updating personPaper with id: {}, {}", personPaperId, personPaperResource);
		
		facade.updateResource(personPaperId, personPaperResource);
		return new MessageResource(MessageType.INFO, "Person Paper Updated");
	}
	
	/**
	 * Method for getting personPaper by identifier.
	 * @param id
	 * @return personPaper.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/papers/{personPaperId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get PersonPaper by id", position = 3)
	public PersonPaperResource getPersonPaper(@PathVariable("personId") final Long personId,
			@PathVariable("personPaperId") final Long personPaperId) {
		LOG.info("Retrieving personPaper with id: {}", personPaperId);
		
		return facade.getResource(personPaperId);
	}
	
	/**
	 * Method for removing personPaper.
	 * @param id
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/papers/{personPaperId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete PersonPaper", position = 4)
	public MessageResource removePersonPaper(@PathVariable("personId") final Long personId,
			@PathVariable("personPaperId") final Long personPaperId) {
		LOG.info("Removing personPaper with id: {}", personPaperId);
		facade.removeResource(personPaperId);
		
		return new MessageResource(MessageType.INFO, "PersonPaper removed");
	}
	
	/**
	 * Method for geting paged result of person papers.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{person}/papers", method = RequestMethod.GET)
	@ApiOperation(value = "Get PersonPapers", position = 5)
	public PagedResultResource<PersonPaperResource> getPersonPapers(@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			@PathVariable("person") final Long persId,
			final PersonPaperResource resource) {
		LOG.info("Retrieving PagedResultResource for PersonPaper:{} Resources with offset: {}, limit: {}", persId, offset, limit);
		resource.setPersonId(persId);
		PagedRequest<PersonPaperResource> pagedRequest = new PagedRequest<PersonPaperResource>(resource, offset, limit);
		
		return facade.getResources(pagedRequest);
	}
	
}
