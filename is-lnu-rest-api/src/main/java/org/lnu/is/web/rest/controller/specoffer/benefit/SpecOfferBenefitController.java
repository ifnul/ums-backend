package org.lnu.is.web.rest.controller.specoffer.benefit;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.benefit.SpecOfferBenefitResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.CrudController;
import org.lnu.is.web.rest.controller.specoffer.subject.SpecOfferSubjectController;
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
 * Spec Offer Benefit Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping(value = "/specoffers")
@Api(value = "SpecOffer Benefits", description = "SpecOffer Benefits")
public class SpecOfferBenefitController extends BaseController implements CrudController<SpecOfferBenefitResource> {
	private static final Logger LOG = LoggerFactory.getLogger(SpecOfferSubjectController.class);
	
	@Resource(name = "specOfferBenefitFacade")
	private Facade<SpecOfferBenefitResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{specOfferId}/benefits", method = RequestMethod.POST)
	@ApiOperation(value = "Method for creating Spec Offer Benefit")
	public SpecOfferBenefitResource createResource(@RequestBody final SpecOfferBenefitResource resource) {
		LOG.info("Creating spec offer subject: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/benefits/{specOfferBenefitId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Spec Offer Benefit", position = 2)
	public MessageResource updateResource(@PathVariable("specOfferBenefitId") final Long specOfferBenefitId,
 			@RequestBody final SpecOfferBenefitResource resource) {
		LOG.info("Updating spec offer subject with id: {}, {}", specOfferBenefitId, resource);
		
		facade.updateResource(specOfferBenefitId, resource);
		return new MessageResource(MessageType.INFO, "Spec Offer Benefit Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/benefits/{specOfferBenefitId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Spec Offer Benefits by spec offer id", position = 3)
	public SpecOfferBenefitResource getResource(@PathVariable("specOfferBenefitId") final Long specOfferBenefitId) {
		LOG.info("Retrieving Spec Offer Subject with id: {}", specOfferBenefitId);
		
		return facade.getResource(specOfferBenefitId);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{specOfferId}/benefits/{specOfferBenefitId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Spec Offer Benefit", position = 4)
	public MessageResource removeResource(@PathVariable("specOfferBenefitId") final Long specOfferBenefitId) {
		LOG.info("Removing Spec Offer Subject with id: {}", specOfferBenefitId);
		facade.removeResource(specOfferBenefitId);
		
		return new MessageResource(MessageType.INFO, "SpecOfferBenefit removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/benefits", method = RequestMethod.GET)
	@ApiOperation(value = "Get Spec Offer Benefits", position = 5)
	public PagedResultResource<SpecOfferBenefitResource> getPagedResource(final PagedRequest<SpecOfferBenefitResource> request) {
		LOG.info("Retrieving PagedResultResource for Spec Offer Subject:{} Resources with offset: {}, limit: {}", 
				request.getResource().getSpecOfferId(), request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
