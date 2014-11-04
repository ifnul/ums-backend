package org.lnu.is.facade.facade.specoffer;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
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
public class DefaultSpecOfferFacade implements SpecOfferFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultSpecOfferFacade.class);
	
	@Resource(name = "specOfferService")
	private SpecOfferService specOfferService;

	@Resource(name = "insertConverter")
	private Converter<SpecOfferResource, SpecOffer> insertConverter;

	@Resource(name = "updateConverter")
	private Converter<SpecOfferResource, SpecOffer> updateConverter;
	
	@Resource(name = "specOfferResourceConverter")
	private Converter<SpecOfferResource, SpecOffer> specOfferResourceConverter;
	
	@Resource(name = "specOfferConverter")
	private Converter<SpecOffer, SpecOfferResource> specOfferConverter;
	
	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest<SpecOfferResource>, PagedSearch<SpecOffer>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@Override
	public SpecOfferResource createSpecOffer(final SpecOfferResource specOfferResource) {
		//Converting from resource(Controller - Facade visibility) to Entity(Service - Dao visibility)
		SpecOffer specOffer = specOfferResourceConverter.convert(specOfferResource);
		insertConverter.convert(specOfferResource, specOffer);
		// Delegating creation to service layer.
		specOfferService.createSpecOffer(specOffer);
		// Converting to specoffer resource with generated identity.
		return specOfferConverter.convert(specOffer);
	}

	@Override
	public void updateSpecOffer(final Long id, final SpecOfferResource specOfferResource) {
		// Getting current specoffer by it's idenfitier.
		SpecOffer specOffer = specOfferService.getSpecOffer(id);
		// Converting specoffer resource to specoffer.
		specOfferResourceConverter.convert(specOfferResource, specOffer);
		updateConverter.convert(specOfferResource, specOffer);
		
		// Updating -> Delegating this operation to service.
		specOfferService.updateSpecOffer(specOffer);
	}

	@Override
	public SpecOfferResource getSpecOffer(final Long id) {
		// Getting current specoffer by it's idenfitier.
		SpecOffer specOffer = specOfferService.getSpecOffer(id);
		// Converting specoffer to spec offer resource
		return specOfferConverter.convert(specOffer);
	}

	@Override
	public void removeSpecOffer(final Long id) {
		// Getting current specoffer by it's idenfitier.
		SpecOffer specOffer = specOfferService.getSpecOffer(id);
		// Delegating remove operation to service layer.
		specOfferService.removeSpecOffer(specOffer);
	}

	@Override
	public PagedResultResource<SpecOfferResource> getSpecOffers(final PagedRequest<SpecOfferResource> pagedRequest) {
		LOG.info("Get spec offers by paged request: {}", pagedRequest);

		PagedSearch<SpecOffer> pagedSearch = pagedRequestConverter.convert(pagedRequest);

		PagedResult<SpecOffer> pagedResult = specOfferService.getSpecOffers(pagedSearch);

		List<SpecOfferResource> resources = specOfferConverter.convertAll(pagedResult.getEntities());

		PagedResultResource<SpecOfferResource> pagedResultResource = new PagedResultResource<>("/specoffers");
		pagedResultResource.setEntities(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}
	
}
