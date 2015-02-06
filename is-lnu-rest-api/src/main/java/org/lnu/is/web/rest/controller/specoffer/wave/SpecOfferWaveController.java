package org.lnu.is.web.rest.controller.specoffer.wave;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.specoffer.subject.wave.SpecOfferWaveResource;
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
 * Controller for spec offer waves.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/specoffers")
public class SpecOfferWaveController extends BaseController implements CrudController<SpecOfferWaveResource> {
	private static final Logger LOG = LoggerFactory.getLogger(SpecOfferWaveController.class);
	
	@Resource(name = "specOfferWaveFacade")
	private Facade<SpecOfferWaveResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{specOfferId}/waves", method = RequestMethod.POST)
	public SpecOfferWaveResource createResource(@Valid @RequestBody final SpecOfferWaveResource resource) {
		LOG.info("Creating spec offer wave: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/waves/{specOfferWaveId}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("specOfferWaveId") final Long specOfferWaveId,
 			@RequestBody final SpecOfferWaveResource resource) {
		LOG.info("Updating spec offer wave with id: {}, {}", specOfferWaveId, resource);
		facade.updateResource(specOfferWaveId, resource);
		return new MessageResource(MessageType.INFO);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{specOfferId}/waves/{id}", method = RequestMethod.GET)
	public SpecOfferWaveResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving Spec Offer Wave with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{specOfferId}/waves/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing Spec Offer Wave with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = { "/{specOfferId}/waves", "/waves" }, method = RequestMethod.GET)
	public PagedResultResource<SpecOfferWaveResource> getPagedResource(final PagedRequest<SpecOfferWaveResource> request) {
		LOG.info("Retrieving PagedResultResource for Spec Offer Wave: {}", request);
		return facade.getResources(request);
	}
}
