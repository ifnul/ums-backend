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

	@Resource(name = "insertConverter")
	protected Converter<RESOURCE, ENTITY> insertConverter;
	
	@Resource(name = "updateConverter")
	protected Converter<RESOURCE, ENTITY> updateConverter;
	
	@Resource(name = "pagedRequestConverter")
	protected Converter<PagedRequest<RESOURCE>, PagedSearch<ENTITY>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	protected Converter<PagedResult<ENTITY>, PagedResultResource<RESOURCE>> pagedResultConverter;

}
