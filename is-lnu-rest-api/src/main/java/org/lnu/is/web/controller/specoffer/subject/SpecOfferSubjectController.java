package org.lnu.is.web.controller.specoffer.subject;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.subject.SpecOfferSubjectResource;
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
 * Controller for spec offer subjects.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/specoffers")
@Api(value = "SpecOffer Subjects", description = "SpecOffer Subjects")
public class SpecOfferSubjectController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(SpecOfferSubjectController.class);
	
	@Resource(name = "specOfferSubjectFacade")
	private Facade<SpecOfferSubjectResource, Long> facade;

	/**
	 * Method for creating spec offer subject.
	 * @param resource
	 * @param specOfferId
	 * @return generated person paper.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{specOfferId}/subjects", method = RequestMethod.POST)
	@ApiOperation(value = "Method for creating Spec Offer Subject")
	public SpecOfferSubjectResource createSpecOfferSubject(@RequestBody final SpecOfferSubjectResource resource,
			@PathVariable("specOfferId") final Long specOfferId) {
		LOG.info("Creating spec offer subject: {}", resource);
		return facade.createResource(resource);
	}
	
	/**
	 * Method for updating personPaper.
	 * @param id
	 * @param resource
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/subjects/{specOfferSubjectId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Spec Offer Subject", position = 2)
	public MessageResource updateSpecOfferSubject(@PathVariable("specOfferId") final Long specOfferId,
			@PathVariable("specOfferSubjectId") final Long specOfferSubjectId,
 			@RequestBody final SpecOfferSubjectResource resource) {
		LOG.info("Updating spec offer subject with id: {}, {}", specOfferSubjectId, resource);
		
		facade.updateResource(specOfferSubjectId, resource);
		return new MessageResource(MessageType.INFO, "Spec Offer Subject Updated");
	}
	
	/**
	 * Method for getting personPaper by identifier.
	 * @param id
	 * @return personPaper.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/subjects/{specOfferSubjectId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Spec Offer Subjects by spec offer id", position = 3)
	public SpecOfferSubjectResource getSubject(@PathVariable("specOfferId") final Long specOfferId,
			@PathVariable("specOfferSubjectId") final Long specOfferSubjectId) {
		LOG.info("Retrieving Spec Offer Subject with id: {}", specOfferSubjectId);
		
		return facade.getResource(specOfferSubjectId);
	}
	
	/**
	 * Method for removing personPaper.
	 * @param id
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{specOfferId}/subjects/{specOfferSubjectId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Spec Offer Subject", position = 4)
	public MessageResource removeSpecOfferSubject(@PathVariable("specOfferId") final Long specOfferId,
			@PathVariable("specOfferSubjectId") final Long specOfferSubjectId) {
		LOG.info("Removing Spec Offer Subject with id: {}", specOfferSubjectId);
		facade.removeResource(specOfferSubjectId);
		
		return new MessageResource(MessageType.INFO, "SpecOfferSubject removed");
	}
	
	/**
	 * Method for geting paged result of person papers.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/subjects", method = RequestMethod.GET)
	@ApiOperation(value = "Get Spec Offer Subjects", position = 5)
	public PagedResultResource<SpecOfferSubjectResource> getSpecOfferSubjects(@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			@PathVariable("specOfferId") final Long specOfferId,
			final SpecOfferSubjectResource resource) {
		LOG.info("Retrieving PagedResultResource for Spec Offer Subject:{} Resources with offset: {}, limit: {}", specOfferId, offset, limit);
		PagedRequest<SpecOfferSubjectResource> pagedRequest = new PagedRequest<SpecOfferSubjectResource>(resource, offset, limit);
		
		return facade.getResources(pagedRequest);
	}
}
