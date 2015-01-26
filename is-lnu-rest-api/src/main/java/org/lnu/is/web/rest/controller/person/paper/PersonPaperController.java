package org.lnu.is.web.rest.controller.person.paper;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.paper.PersonPaperResource;
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
public class PersonPaperController extends BaseController implements CrudController<PersonPaperResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PersonPaperController.class);
	
	@Resource(name = "personPaperFacade")
	private Facade<PersonPaperResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/papers", method = RequestMethod.POST)
	@ApiOperation(value = "Create PersonPaper", position = 1)
	public PersonPaperResource createResource(@Valid @RequestBody final PersonPaperResource personPaperResource) {
		LOG.info("Creating personPaper: {}", personPaperResource);
		return facade.createResource(personPaperResource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/papers/{personPaperId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update PersonPaper", position = 2)
	public MessageResource updateResource(@PathVariable("personPaperId") final Long personPaperId,
 			@Valid @RequestBody final PersonPaperResource personPaperResource) {
		LOG.info("Updating personPaper with id: {}", personPaperResource);
		
		facade.updateResource(personPaperId, personPaperResource);
		return new MessageResource(MessageType.INFO, "Person Paper Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/papers/{personPaperId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get PersonPaper by id", position = 3)
	public PersonPaperResource getResource(@PathVariable("personPaperId") final Long personPaperId) {
		LOG.info("Retrieving personPaper with id: {}", personPaperId);
		
		return facade.getResource(personPaperId);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/papers/{personPaperId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete PersonPaper", position = 4)
	public MessageResource removeResource(@PathVariable("personPaperId") final Long personPaperId) {
		LOG.info("Removing personPaper with id: {}", personPaperId);
		facade.removeResource(personPaperId);
		
		return new MessageResource(MessageType.INFO, "PersonPaper removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/papers", method = RequestMethod.GET)
	@ApiOperation(value = "Get PersonPapers")
	public PagedResultResource<PersonPaperResource> getPagedResource(final PagedRequest<PersonPaperResource> request) {
		LOG.info("Retrieving PagedResultResource for PersonPaper:{} Resources with offset: {}, limit: {}", request.getResource().getPersonId(), request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
	
}
