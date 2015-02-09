package org.lnu.is.web.rest.controller.enrolment.benefit;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.enrolment.benefit.EnrolmentBenefitResource;
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
 * Controller for enrolments.
 * 
 * @author ivanursul
 *
 */
@RestController
@RequestMapping(value = "/enrolments")
public class EnrolmentBenefitController extends BaseController implements CrudController<EnrolmentBenefitResource> {
	private static final Logger LOG = LoggerFactory.getLogger(EnrolmentBenefitController.class);

	@Resource(name = "enrolmentBenefitFacade")
	private Facade<EnrolmentBenefitResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{enrolmentId}/benefits", method = RequestMethod.POST)
	public EnrolmentBenefitResource createResource(@Valid @RequestBody final EnrolmentBenefitResource resource) {
		LOG.info("Creating enrolment benefit : {} ", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{enrolmentId}/benefits/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id, 
			@Valid @RequestBody final EnrolmentBenefitResource resource) {
		LOG.info("Updating enrolment benefit with id : {} , {} ", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "EnrolmentBenefit Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{enrolmentId}/benefits/{id}", method = RequestMethod.GET)
	public EnrolmentBenefitResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving enrolment benefit with id : {} ", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{enrolmentId}/benefits/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing enrolment benefit with id : {} ", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "EnrolmentBenefit Removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = { "/benefits", "/{enrolmentId}/benefits" }, method = RequestMethod.GET)
	public PagedResultResource<EnrolmentBenefitResource> getPagedResource(final PagedRequest<EnrolmentBenefitResource> request) {
		LOG.info("Retrieving enrolment benefits with offset {}, limit {} ", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

}
