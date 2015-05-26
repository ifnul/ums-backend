package org.lnu.is.web.rest.controller.person.award;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.award.PersonAwardResource;
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
 * Persob Award Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/persons")
@Api(value = "Person Awards", description = "Person Awards")
public class PersonAwardController extends BaseController implements CrudController<PersonAwardResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PersonAwardController.class);
	
	@Resource(name = "personAwardFacade")
	private Facade<PersonAwardResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/awards", method = RequestMethod.POST)
	@ApiOperation(value = "Create PersonAward")
	public PersonAwardResource createResource(@Valid @RequestBody final PersonAwardResource personAwardResource) {
		LOG.info("Creating personAward: {}", personAwardResource);
		return facade.createResource(personAwardResource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/awards/{personAwardId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update PersonAward")
	public MessageResource updateResource(@PathVariable("personAwardId") final Long personAwardId,
 			@Valid @RequestBody final PersonAwardResource personAwardResource) {
		LOG.info("Updating personAward with id: {}, {}", personAwardId, personAwardResource);
		facade.updateResource(personAwardId, personAwardResource);
		return new MessageResource(MessageType.INFO, "Person Award Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/awards/{personAwardId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get PersonAward by id", position = 3)
	public PersonAwardResource getResource(@PathVariable("personAwardId") final Long personAwardId) {
		LOG.info("Retrieving personAward with id: {}", personAwardId);
		return facade.getResource(personAwardId);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/awards/{personAwardId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete PersonAward", position = 4)
	public MessageResource removeResource(@PathVariable("personAwardId") final Long personAwardId) {
		LOG.info("Removing personAward with id: {}", personAwardId);
		facade.removeResource(personAwardId);
		return new MessageResource(MessageType.INFO, "PersonAward removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/awards", method = RequestMethod.GET)
	@ApiOperation(value = "Get PersonAwards")
	public PagedResultResource<PersonAwardResource> getPagedResource(final PagedRequest<PersonAwardResource> request) {
		LOG.info("Retrieving PagedResultResource for PersonAward:{} Resources with offset: {}, limit: {}", request.getResource().getPersonId(), request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
	
}
