package org.lnu.is.web.rest.controller.enrolment.status;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.enrolment.status.EnrolmentStatusResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
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
 * Enrolment Status controller.
 * 
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/enrolments")
public class EnrolmentStatusController extends BaseController implements CrudController<EnrolmentStatusResource> {
	private static final Logger LOG = LoggerFactory.getLogger(EnrolmentStatusController.class);

	@Resource(name = "enrolmentStatusFacade")
	private Facade<EnrolmentStatusResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{enrolmentId}/statuses", method = RequestMethod.POST)
	public EnrolmentStatusResource createResource(@Valid @RequestBody final EnrolmentStatusResource enrolmentResource) {
		LOG.info("Creating enrolment status : {} ", enrolmentResource);
		return facade.createResource(enrolmentResource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{enrolmentId}/statuses/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id, 
			@Valid @RequestBody final EnrolmentStatusResource resource) {
		LOG.info("Updating enrolment status with id : {} , {} ", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "EnrolmentStatus Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{enrolmentId}/statuses/{id}", method = RequestMethod.GET)
	public EnrolmentStatusResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving enrolment status with id : {} ", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{enrolmentId}/statuses/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing enrolment status with id : {} ", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "EnrolmentStatus Removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{enrolmentId}/statuses", method = RequestMethod.GET)
	public PagedResultResource<EnrolmentStatusResource> getPagedResource(final PagedRequest<EnrolmentStatusResource> request) {
		LOG.info("Retrieving enrolment statuses with offset {}, limit {} ", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
