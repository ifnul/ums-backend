package org.lnu.is.web.rest.controller.specoffer.subject;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.specoffer.subject.SpecOfferSubjectResource;
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
 * Controller for spec offer subjects.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/specoffers")
@Api(value = "SpecOffer Subjects", description = "SpecOffer Subjects")
public class SpecOfferSubjectController extends BaseController implements CrudController<SpecOfferSubjectResource> {
	private static final Logger LOG = LoggerFactory.getLogger(SpecOfferSubjectController.class);
	
	@Resource(name = "specOfferSubjectFacade")
	private Facade<SpecOfferSubjectResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{specOfferId}/subjects", method = RequestMethod.POST)
	@ApiOperation(value = "Method for creating Spec Offer Subject")
	public SpecOfferSubjectResource createResource(@RequestBody final SpecOfferSubjectResource resource) {
		LOG.info("Creating spec offer subject: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/subjects/{specOfferSubjectId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Spec Offer Subject", position = 2)
	public MessageResource updateResource(@PathVariable("specOfferSubjectId") final Long specOfferSubjectId,
 			@RequestBody final SpecOfferSubjectResource resource) {
		LOG.info("Updating spec offer subject with id: {}, {}", specOfferSubjectId, resource);
		
		facade.updateResource(specOfferSubjectId, resource);
		return new MessageResource(MessageType.INFO, "Spec Offer Subject Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/subjects/{specOfferSubjectId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Spec Offer Subjects by spec offer id", position = 3)
	public SpecOfferSubjectResource getResource(@PathVariable("specOfferSubjectId") final Long specOfferSubjectId) {
		LOG.info("Retrieving Spec Offer Subject with id: {}", specOfferSubjectId);
		
		return facade.getResource(specOfferSubjectId);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{specOfferId}/subjects/{specOfferSubjectId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Spec Offer Subject", position = 4)
	public MessageResource removeResource(@PathVariable("specOfferSubjectId") final Long specOfferSubjectId) {
		LOG.info("Removing Spec Offer Subject with id: {}", specOfferSubjectId);
		facade.removeResource(specOfferSubjectId);
		
		return new MessageResource(MessageType.INFO, "SpecOfferSubject removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/subjects", method = RequestMethod.GET)
	@ApiOperation(value = "Get Spec Offer Subjects")
	public PagedResultResource<SpecOfferSubjectResource> getPagedResource(final PagedRequest<SpecOfferSubjectResource> request) {
		LOG.info("Retrieving PagedResultResource for Spec Offer Subject:{} Resources with offset: {}, limit: {}", 
				request.getResource().getSpecOfferId(), request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
