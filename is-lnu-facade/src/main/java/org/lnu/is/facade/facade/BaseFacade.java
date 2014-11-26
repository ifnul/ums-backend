package org.lnu.is.facade.facade;

import javax.annotation.Resource;

import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Base facade.
 * @author ivanursul
 *
 * @param <RESOURCE> Resource.
 * @param <ENTITY> entity.
 */
public abstract class BaseFacade<RESOURCE, ENTITY> implements Facade<RESOURCE, ENTITY> {
//	public abstract class BaseFacade<RESOURCE, ENTITY, SERVICE> implements Facade<RESOURCE, ENTITY> {
//	private static final Logger LOG = LoggerFactory.getLogger(BaseFacade.class);
	
	@Resource(name = "insertConverter")
	protected Converter<RESOURCE, ENTITY> insertConverter;
	
	@Resource(name = "updateConverter")
	protected Converter<RESOURCE, ENTITY> updateConverter;
	
	@Resource(name = "pagedRequestConverter")
	protected Converter<PagedRequest<RESOURCE>, PagedSearch<ENTITY>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	protected Converter<PagedResult<ENTITY>, PagedResultResource<RESOURCE>> pagedResultConverter;
/*	
	protected Converter<RESOURCE, ENTITY> resourceConverter;

	protected Converter<ENTITY, RESOURCE> entityConverter;
	
	protected SERVICE service;

	protected abstract PagedResult<ENTITY> getPagedResult(PagedSearch<ENTITY> request);
	
	protected abstract String getUriForPagedResult(PagedRequest<RESOURCE> request);
	
	@Override
	public PagedResultResource<RESOURCE> getResources(final PagedRequest<RESOURCE> request) {
		LOG.info("Getting paged result resource for {0}: {1}", request.getResource().getClass().getSimpleName(), request);

		PagedSearch<ENTITY> pagedSearch = pagedRequestConverter.convert(request);
		pagedSearch.setEntity(resourceConverter.convert(request.getResource()));

		PagedResult<ENTITY> pagedResult = getPagedResult(pagedSearch);

		List<RESOURCE> resources = entityConverter.convertAll(pagedResult.getEntities());

		String uri = getUriForPagedResult(request);
		PagedResultResource<RESOURCE> pagedResultResource = new PagedResultResource<>(uri);
		pagedResultResource.setResources(resources);
		pagedResultConverter.convert(pagedResult, pagedResultResource);

		return pagedResultResource;
	}

	@Required
	public void setResourceConverter(final Converter<RESOURCE, ENTITY> resourceConverter) {
		this.resourceConverter = resourceConverter;
	}

	@Required
	public void setEntityConverter(final Converter<ENTITY, RESOURCE> entityConverter) {
		this.entityConverter = entityConverter;
	}

	@Required
	public void setService(final SERVICE service) {
		this.service = service;
	}
*/
	
}
