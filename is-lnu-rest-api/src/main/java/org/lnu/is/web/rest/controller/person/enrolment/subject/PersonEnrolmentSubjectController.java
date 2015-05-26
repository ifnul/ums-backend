package org.lnu.is.web.rest.controller.person.enrolment.subject;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.domain.person.enrolment.subject.PersonEnrolmentSubject;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.enrolment.subject.PersonEnrolmentSubjectResource;
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

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Person Enrolment Subject Controller.
 * TODO: Think about rewriting this API /{personId}/enrolment/{enrolmentId}/subjects
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/persons")
public class PersonEnrolmentSubjectController extends BaseController implements CrudController<PersonEnrolmentSubjectResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PersonEnrolmentSubject.class);

	@Resource(name = "personEnrolmentSubjectFacade")
	private Facade<PersonEnrolmentSubjectResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/enrolmentsubjects", method = RequestMethod.GET)
	@ApiOperation(value = "Get Person Enrolment Subjects")
	public PagedResultResource<PersonEnrolmentSubjectResource> getPagedResource(final PagedRequest<PersonEnrolmentSubjectResource> request) {
		LOG.info("Retrieving PagedResultResource for PersonEnrolmentSubject:{} Resources with offset: {}, limit: {}", request.getResource()
				.getPersonId(), request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/enrolmentsubjects/{personEnrolmentSubjectId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Person Enrolment Subjects by id", position = 1)
	public PersonEnrolmentSubjectResource getResource(@PathVariable("personEnrolmentSubjectId") final Long id) {
		LOG.info("Retrieving Enrolment Subject with id : {} ", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{personId}/enrolmentsubjects", method = RequestMethod.POST)
	@ApiOperation(value = "Create Enrolment Subject", position = 2)
	public PersonEnrolmentSubjectResource createResource(@Valid @RequestBody final PersonEnrolmentSubjectResource resource) {
		LOG.info("Creating Enrolment Subject: {}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{personId}/enrolmentsubjects/{personEnrolmentSubjectId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update PersonName", position = 3)
	public MessageResource updateResource(@PathVariable("personEnrolmentSubjectId") final Long id,
			@Valid @RequestBody final PersonEnrolmentSubjectResource resource) {
		LOG.info("Updating personEnrolmentSubject with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Person Enrolment Subject Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{personId}/enrolmentsubjects/{personEnrolmentSubjectId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Person Enrolment Subject", position = 4)
	public MessageResource removeResource(@PathVariable("personEnrolmentSubjectId") final Long id) {
		LOG.info("Removing personEnrolmentSubject with id: {}", id);
		facade.removeResource(id);

		return new MessageResource(MessageType.INFO, "PersonEnrolmentSubject removed");
	}

}
