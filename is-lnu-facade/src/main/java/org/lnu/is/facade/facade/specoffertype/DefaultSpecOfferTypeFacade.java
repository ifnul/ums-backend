package org.lnu.is.facade.facade.specoffertype;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.specoffertype.SpecOfferType;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.ApiResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffertype.SpecOfferTypeResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.specoffertype.SpecOfferTypeService;

/**
 * Default Spec Offer Type Facade.
 * @author ivanursul
 *
 */
@Facade("specOfferTypeFacade")
public class DefaultSpecOfferTypeFacade implements SpecOfferTypeFacade {

	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest<SpecOfferTypeResource>, PagedSearch<SpecOfferType>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;
	
	@Resource(name = "specOfferTypeConverter")
	private Converter<SpecOfferType, SpecOfferTypeResource> specOfferTypeConverter;

	@Resource(name = "specOfferTypeResourceConverter")
	private Converter<SpecOfferTypeResource, SpecOfferType> specOfferTypeResourceConverter;
	
	@Resource(name = "specOfferTypeService")
	private SpecOfferTypeService specOfferTypeService;
	
	@Override
	public PagedResultResource<SpecOfferTypeResource> getSpecOfferTypes(final PagedRequest<SpecOfferTypeResource> request) {
		
		PagedSearch<SpecOfferType> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(specOfferTypeResourceConverter.convert(request.getResource()));
		
		PagedResult<SpecOfferType> pagedResult = specOfferTypeService.getSpecOfferTypes(pagedSearch);
		
		List<SpecOfferTypeResource> resources = specOfferTypeConverter.convertAll(pagedResult.getEntities());
		
		PagedResultResource<SpecOfferTypeResource> pagedResultResource = new PagedResultResource<>("/specoffertypes");
		pagedResultResource.setEntities(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);
		
		return pagedResultResource;
	}
}
