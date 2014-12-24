package org.lnu.is.web.rest.controller.specoffer;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.SpecOfferResource;
import org.lnu.is.facade.resource.specoffer.type.SpecOfferTypeResource;
import org.lnu.is.web.rest.constant.Request;
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
 * Controller, that handles all operations
 * with specoffers.
 * @author ivanursul.
 */
@RestController
@RequestMapping("/specoffers")
@Api(value = "specoffers", description = "Specoffers", position = 2)
public class SpecOfferController extends BaseController implements CrudController<SpecOfferResource> {
	private static final Logger LOG = LoggerFactory.getLogger(SpecOfferController.class);
	
	@Resource(name = "specOfferFacade")
	private Facade<SpecOfferResource, Long> facade;

	@Resource(name = "specOfferTypeFacade")
	private Facade<SpecOfferTypeResource, Long> typeFacade;
	
	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Specoffer", position = 1)
	public SpecOfferResource createResource(@Valid @RequestBody final SpecOfferResource specOfferResource) {
		LOG.info("Creating specoffer: {}", specOfferResource);
		return facade.createResource(specOfferResource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update SpecOffer", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@RequestBody final SpecOfferResource specOfferResource) {
		LOG.info("Updated specoffer with id: {}, {}", id, specOfferResource);
		facade.updateResource(id, specOfferResource);
		return new MessageResource(MessageType.INFO, "SpecOffer Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get's SpecOffer", position = 3)
	public SpecOfferResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving specoffer with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Remove Specoffer", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing specoffer with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "SpecOffer removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get's All SpecOffers", position = 5)
	public PagedResultResource<SpecOfferResource> getPagedResource(final PagedRequest<SpecOfferResource> request) {
		LOG.info("Retrieving PagedResultResource for Spec Offer Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
	
	/**
	 * TODO: Move to separate controller.
	 * Method for getting paged result.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/types", method = RequestMethod.GET)
	@ApiOperation(value = "Get's All SpecOfferTypes", position = 5)
	public PagedResultResource<SpecOfferTypeResource> getSpecOfferTypes(final PagedRequest<SpecOfferTypeResource> request) {
		LOG.info("Retrieving PagedResultResource for Spec Offer Type Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return typeFacade.getResources(request);
	}
}
