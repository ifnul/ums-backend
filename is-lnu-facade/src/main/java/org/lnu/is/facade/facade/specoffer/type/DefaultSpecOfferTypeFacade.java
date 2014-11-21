package org.lnu.is.facade.facade.specoffer.type;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.type.SpecOfferTypeResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.specoffer.type.SpecOfferTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * Default Spec Offer Type Facade.
 * @author ivanursul
 *
 */
@Transactional
@Facade("specOfferTypeFacade")
public class DefaultSpecOfferTypeFacade extends BaseFacade<SpecOfferTypeResource, SpecOfferType> implements SpecOfferTypeFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultSpecOfferTypeFacade.class);
	
	@Resource(name = "specOfferTypeConverter")
	private Converter<SpecOfferType, SpecOfferTypeResource> specOfferTypeConverter;

	@Resource(name = "specOfferTypeResourceConverter")
	private Converter<SpecOfferTypeResource, SpecOfferType> specOfferTypeResourceConverter;
	
	@Resource(name = "specOfferTypeService")
	private SpecOfferTypeService specOfferTypeService;
	
	@Override
	public PagedResultResource<SpecOfferTypeResource> getSpecOfferTypes(final PagedRequest<SpecOfferTypeResource> request) {
		LOG.info("Getting paged result for spec offer type, reuqest: {}", request);
		
		PagedSearch<SpecOfferType> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(specOfferTypeResourceConverter.convert(request.getResource()));
		
		PagedResult<SpecOfferType> pagedResult = specOfferTypeService.getSpecOfferTypes(pagedSearch);
		
		List<SpecOfferTypeResource> resources = specOfferTypeConverter.convertAll(pagedResult.getEntities());
		
		PagedResultResource<SpecOfferTypeResource> pagedResultResource = new PagedResultResource<>("/specoffers/types");
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);
		
		return pagedResultResource;
	}
}
