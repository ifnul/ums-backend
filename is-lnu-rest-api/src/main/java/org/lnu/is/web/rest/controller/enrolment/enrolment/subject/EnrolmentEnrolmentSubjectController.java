package org.lnu.is.web.rest.controller.enrolment.enrolment.subject;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.enrolment.enrolment.subject.EnrolmentEnrolmentSubjectResource;
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
 * Enrolment enrolment subject controller.
 * @author illay
 *
 */
@RestController
@RequestMapping("/enrolments")
public class EnrolmentEnrolmentSubjectController extends BaseController
	implements CrudController<EnrolmentEnrolmentSubjectResource> {
    private static final Logger LOG = LoggerFactory.getLogger(EnrolmentEnrolmentSubjectController.class);
    
    @Resource(name = "enrolmentEnrolmentSubjectFacade")
    private Facade<EnrolmentEnrolmentSubjectResource, Long> facade;
    
    @Override
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/{enrolmentId}/enrolmentsubjects", method = RequestMethod.POST)
    public EnrolmentEnrolmentSubjectResource createResource(@Valid @RequestBody final  EnrolmentEnrolmentSubjectResource resource) {
	LOG.info("Creating enrolment enrolment subject : {} ", resource);
	return facade.createResource(resource);
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{enrolmentId}/enrolmentsubjects/{id}", method = RequestMethod.PUT)
    public MessageResource updateResource(@PathVariable("id") final Long id, 
		@Valid @RequestBody final EnrolmentEnrolmentSubjectResource resource) {
	LOG.info("Updating enrolment enrolment subject with id : {} , {} ", id, resource);
	facade.updateResource(id, resource);
	return new MessageResource(MessageType.INFO, "Enrolment Enrolment Subject Updated");
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{enrolmentId}/enrolmentsubjects/{id}", method = RequestMethod.GET)
    public EnrolmentEnrolmentSubjectResource getResource(@PathVariable("id") final Long id) {
	LOG.info("Retrieving enrolment enrolment subject with id : {} ", id);
	return facade.getResource(id);
    }
	
    @Override
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/{enrolmentId}/enrolmentsubjects/{id}", method = RequestMethod.DELETE)
    public MessageResource removeResource(@PathVariable("id") final Long id) {
	LOG.info("Removing enrolment enrolment subject with id : {} ", id);
	facade.removeResource(id);
	return new MessageResource(MessageType.INFO, "Enrolment Enrolment Subject Removed");
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = { "/{enrolmentId}/enrolmentsubjects" }, method = RequestMethod.GET)
    public PagedResultResource<EnrolmentEnrolmentSubjectResource> getPagedResource(final PagedRequest<EnrolmentEnrolmentSubjectResource> request) {
	LOG.info("Retrieving enrolment enrolment subject with offset {}, limit {} ", request.getOffset(), request.getLimit());
	return facade.getResources(request);
    }

}
