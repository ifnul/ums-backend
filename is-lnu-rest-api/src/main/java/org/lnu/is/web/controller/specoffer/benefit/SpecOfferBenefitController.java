package org.lnu.is.web.controller.specoffer.benefit;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.benefit.SpecOfferBenefitResource;
import org.lnu.is.web.controller.BaseController;
import org.lnu.is.web.controller.specoffer.subject.SpecOfferSubjectController;
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
 * Spec Offer Benefit Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping(value = "/specoffers")
@Api(value = "SpecOffer Benefits", description = "SpecOffer Benefits")
public class SpecOfferBenefitController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(SpecOfferSubjectController.class);
	
	@Resource(name = "specOfferBenefitFacade")
	private Facade<SpecOfferBenefitResource, Long> facade;

	/**
	 * Method for creating spec offer subject.
	 * @param resource
	 * @param specOfferId
	 * @return generated person paper.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{specOfferId}/benefits", method = RequestMethod.POST)
	@ApiOperation(value = "Method for creating Spec Offer Benefit")
	public SpecOfferBenefitResource createSpecOfferSubject(@RequestBody final SpecOfferBenefitResource resource,
			@PathVariable("specOfferId") final Long specOfferId) {
		LOG.info("Creating spec offer subject: {}", resource);
		return facade.createResource(resource);
	}
	
	/**
	 * Method for updating personBenefit.
	 * @param id
	 * @param resource
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/benefits/{specOfferBenefitId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Spec Offer Benefit", position = 2)
	public MessageResource updateSpecOfferSubject(@PathVariable("specOfferId") final Long specOfferId,
			@PathVariable("specOfferBenefitId") final Long specOfferBenefitId,
 			@RequestBody final SpecOfferBenefitResource resource) {
		LOG.info("Updating spec offer subject with id: {}, {}", specOfferBenefitId, resource);
		
		facade.updateResource(specOfferBenefitId, resource);
		return new MessageResource(MessageType.INFO, "Spec Offer Benefit Updated");
	}
	
	/**
	 * Method for getting personBenefit by identifier.
	 * @param id
	 * @return personBenefit.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/benefits/{specOfferBenefitId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Spec Offer Benefits by spec offer id", position = 3)
	public SpecOfferBenefitResource getSubject(@PathVariable("specOfferId") final Long specOfferId,
			@PathVariable("specOfferBenefitId") final Long specOfferBenefitId) {
		LOG.info("Retrieving Spec Offer Subject with id: {}", specOfferBenefitId);
		
		return facade.getResource(specOfferBenefitId);
	}
	
	/**
	 * Method for removing personBenefit.
	 * @param id
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{specOfferId}/benefits/{specOfferBenefitId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Spec Offer Benefit", position = 4)
	public MessageResource removeSpecOfferSubject(@PathVariable("specOfferId") final Long specOfferId,
			@PathVariable("specOfferBenefitId") final Long specOfferBenefitId) {
		LOG.info("Removing Spec Offer Subject with id: {}", specOfferBenefitId);
		facade.removeResource(specOfferBenefitId);
		
		return new MessageResource(MessageType.INFO, "SpecOfferBenefit removed");
	}
	
	/**
	 * Method for geting paged result of person papers.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/benefits", method = RequestMethod.GET)
	@ApiOperation(value = "Get Spec Offer Benefits", position = 5)
	public PagedResultResource<SpecOfferBenefitResource> getSpecOfferBenefits(@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			@PathVariable("specOfferId") final Long specOfferId,
			final SpecOfferBenefitResource resource) {
		LOG.info("Retrieving PagedResultResource for Spec Offer Subject:{} Resources with offset: {}, limit: {}", specOfferId, offset, limit);
		PagedRequest<SpecOfferBenefitResource> pagedRequest = new PagedRequest<SpecOfferBenefitResource>(resource, offset, limit);
		
		return facade.getResources(pagedRequest);
	}
}
