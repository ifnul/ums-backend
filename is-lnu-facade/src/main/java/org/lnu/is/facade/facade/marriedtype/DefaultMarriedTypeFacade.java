package org.lnu.is.facade.facade.marriedtype;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.facade.BaseFacade;
import org.lnu.is.facade.resource.marriedtype.MarriedTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.marriedtype.MarriedTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * Default implementation of Married Type facade.
 * @author Bohdan
 *
 */
@Transactional
@Facade("marriedTypeFacade")
public class DefaultMarriedTypeFacade extends BaseFacade<MarriedTypeResource, MarriedType> implements MarriedTypeFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultMarriedTypeFacade.class);
	
	@Resource(name = "marriedTypeConverter")
	private Converter<MarriedType, MarriedTypeResource> marriedTypeConverter;
	
	@Resource(name = "marriedTypeResourceConverter")
	private Converter<MarriedTypeResource, MarriedType> marriedTypeResourceConverter;
	
	@Resource(name = "marriedTypeService")
	private MarriedTypeService marriedTypeService;
	
	@Override
	public PagedResultResource<MarriedTypeResource> getMarriedTypes(final PagedRequest<MarriedTypeResource> request) {
		LOG.info("Getting paged result for married types: {}", request);
		
		PagedSearch<MarriedType> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(marriedTypeResourceConverter.convert(request.getResource()));

		PagedResult<MarriedType> pagedResult = marriedTypeService.getMarriedTypes(pagedSearch);
		List<MarriedTypeResource> resources = marriedTypeConverter.convertAll(pagedResult.getEntities());
		PagedResultResource<MarriedTypeResource> pagedResultResource = new PagedResultResource<MarriedTypeResource>("/marriedtypes");

		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);
		
		return pagedResultResource;
	}

}
