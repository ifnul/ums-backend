package org.lnu.is.facade.facade.specoffer;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.SpecOfferResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.specoffer.SpecOfferService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Default implementation of spec offer functionality
 * in facade level.
 * 
 * @author ivanursul
 *
 */
@Transactional
@Component("specOfferFacade")
public class DefaultSpecOfferFacade extends BaseFacade<SpecOfferResource, SpecOffer> implements SpecOfferFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultSpecOfferFacade.class);
	
	@Resource(name = "specOfferService")
	private SpecOfferService service;

	@Resource(name = "specOfferResourceConverter")
	private Converter<SpecOfferResource, SpecOffer> resourceConverter;
	
	@Resource(name = "specOfferConverter")
	private Converter<SpecOffer, SpecOfferResource> entityConverter;
	
	@Override
	public SpecOfferResource createEntity(final SpecOfferResource resource) {
		LOG.info("Creating spec offer: {}", resource);
		SpecOffer specOffer = resourceConverter.convert(resource);
		
		insertConverter.convert(resource, specOffer);
		service.createSpecOffer(specOffer);

		return entityConverter.convert(specOffer);
	}

	@Override
	public void updateEntity(final Long id, final SpecOfferResource resource) {
		LOG.info("Updating spec offer: {}, {}", id, resource);
		SpecOffer specOffer = service.getSpecOffer(id);

		resourceConverter.convert(resource, specOffer);
		updateConverter.convert(resource, specOffer);
		
		service.updateSpecOffer(specOffer);
	}

	@Override
	public SpecOfferResource getEntity(final Long id) {
		LOG.info("Getting specoffer with id {}", id);
		
		SpecOffer specOffer = service.getSpecOffer(id);
		return entityConverter.convert(specOffer);
	}

	@Override
	public void removeEntity(final Long id) {
		LOG.info("Removing specoffer with id: {}", id);
		
		SpecOffer specOffer = service.getSpecOffer(id);
		service.removeSpecOffer(specOffer);
	}

	@Override
	public PagedResultResource<SpecOfferResource> getEntities(final PagedRequest<SpecOfferResource> request) {
		LOG.info("Get spec offers by paged request: {}", request);

		PagedSearch<SpecOffer> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));
		
		PagedResult<SpecOffer> pagedResult = service.getSpecOffers(pagedSearch);

		List<SpecOfferResource> resources = entityConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<SpecOfferResource> pagedResultResource = new PagedResultResource<>("/specoffers");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}
	
}
